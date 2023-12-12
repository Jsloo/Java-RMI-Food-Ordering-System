
package Fos;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;

public class Server extends UnicastRemoteObject implements FosInterface {
    public Server()throws RemoteException{
        super();
    }
    public static Integer UserId = 5;
    //user
    @Override
    public String Login(String nam, String pass)throws RemoteException{
        try{
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos");
            Statement t = conn.createStatement();
            String encryptPass = Encrypt(pass);
            String script = "SELECT * from ACCOUNT where USERNAME = '" + nam + "' and PASSWORD = '" + encryptPass + "'";

            ResultSet rs = t.executeQuery(script);
            boolean found = rs.next(); 

            if(found){
                String userType = rs.getString("TYPE");
                UserId = rs.getInt("ID");
                if ("user".equals(userType)) {
                    return "userLogin";
                } 
                else if ("admin".equals(userType)) {
                    return "adminLogin";
                } 
                return "Login Successfull!";
            }else{
                return "incorrect";
            }
        }catch(Exception e){
            return (e.toString());
        }      
    }  
    
    @Override
    public String Register(String nam, String pass, Integer age, String email, String phonenum, String gender)throws RemoteException{
        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos")) {
            String encryptPass = Encrypt(pass);
            
            try (Statement statement = conn.createStatement()) {
                String checkExist = "SELECT USERNAME FROM ACCOUNT WHERE USERNAME = '" + nam + "'";
                ResultSet resultSet = statement.executeQuery(checkExist);
                if (resultSet.next()) {
                    return "Username already exists!";
                }
            } 

            try (Statement statement = conn.createStatement()) {
                String script = "INSERT INTO ACCOUNT (USERNAME, PASSWORD, TYPE, AGE, EMAIL, PHONE, GENDER) " +
                                "VALUES ('" + nam + "', '" + encryptPass + "', 'user', " + age + ", '" + email + "',' " +
                                phonenum + "', '" + gender + "')";
                statement.executeUpdate(script);
                return "Register Successful!";
            } 

        } catch (Exception e) {
            return "Error occurred: " + e.toString();
        }    
    }  
    
    @Override
    public ArrayList<String> GetProfile()throws RemoteException{
        ArrayList<String> data = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos")) {
            
            try (Statement statement = conn.createStatement()) {
                String checkExist = "SELECT * FROM ACCOUNT WHERE ID = " + UserId + "";
                ResultSet resultSet = statement.executeQuery(checkExist);

                if (resultSet.next()) {
                    String Name = resultSet.getString("USERNAME");
                    String Email = resultSet.getString("EMAIL");
                    String Gender = resultSet.getString("GENDER");
                    String Phone = resultSet.getString("PHONE");
                    Integer Age = resultSet.getInt("AGE");
                    
                    data.add(Name);
                    data.add(Email);
                    data.add(Gender);
                    data.add(Phone);
                    data.add(String.valueOf(Age));
                }
            } 

            
        } catch (Exception e) {
            
            data.add(e.toString());
        }  
        return data;
    }  
    
    @Override
    public String UpdateProfile(String nam, String pass, Integer age, String email, String phonenum, String gender)throws RemoteException{
        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos")) {
            try (Statement statement = conn.createStatement()) {
                String checkExist = "SELECT USERNAME FROM ACCOUNT WHERE USERNAME = '" + nam + "' AND ID != " + UserId;
                ResultSet resultSet = statement.executeQuery(checkExist);

                if (resultSet.next()) {
                    return "Username already exists!";
                }
            } 
            
            String updateQuery = "UPDATE ACCOUNT SET USERNAME='" + nam + "', AGE=" + age + ", EMAIL='" + email + "', PHONE='" +
             phonenum + "', GENDER='" + gender + "'";
            if (pass != null) {
                updateQuery += ", PASSWORD='" + Encrypt(pass) + "'";
            }
            
            updateQuery += " WHERE ID=" + UserId;

            try (Statement statement = conn.createStatement()) {
                int rowsAffected = statement.executeUpdate(updateQuery);
                if (rowsAffected > 0) {
                    return "Profile updated successfully!";
                } else {
                    return "Failed to update profile. Please try again.";
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while updating profile: " + e.getMessage();
        }
    }  
    
    @Override
    public String LogOut()throws RemoteException{
        UserId = 0;
        backup();
        return "LogOut Success!";
    }
    
    
    public String Encrypt(String password){
        String hashCode = ""; 
        try { 
                MessageDigest md = MessageDigest.getInstance("SHA-256"); 
                md.update( password.getBytes() ); 
                byte[] hashBytes = md.digest(); 

                hashCode = Base64.getEncoder().encodeToString(hashBytes); 

        } catch (Exception e) { 
                e.printStackTrace(); 
        } 
        return hashCode; 
    }
    //admin
    
    @Override
    public ArrayList<String[]> AgeReport() throws RemoteException {
        ArrayList<String[]> ageDataList = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos")) {
            try (Statement t = conn.createStatement()) {
                String ageGroupScript = "SELECT AGE_GROUP, COUNT(*) as age_group_count FROM (" +
                        "SELECT " +
                        "CASE " +
                        "WHEN AGE < 20 THEN '<20' " +
                        "WHEN AGE BETWEEN 20 AND 39 THEN '20-39' " +
                        "WHEN AGE BETWEEN 40 AND 59 THEN '40-59' " +
                        "ELSE '>=60' " +
                        "END AS AGE_GROUP " +
                        "FROM ACCOUNT" +
                        ") AS AGEGROUPS " +
                        "GROUP BY AGE_GROUP " +
                        "ORDER BY age_group_count DESC";

                ResultSet ageGroupResult = t.executeQuery(ageGroupScript);

                while (ageGroupResult.next()) {
                    String ageGroup = ageGroupResult.getString("AGE_GROUP");
                    int count = ageGroupResult.getInt("age_group_count");
                    String[] data = { ageGroup, String.valueOf(count) };
                    ageDataList.add(data);
                }
            }
        } catch (Exception e) {
            String[] errorData = { "Error", e.toString() };
            ageDataList.add(errorData);
        }

        return ageDataList;
    }
    
    @Override
    public ArrayList<String[]> GenderReport() throws RemoteException {
        ArrayList<String[]> genderDataList = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos")) {
            try (Statement t = conn.createStatement()) {
                String genderScript = "SELECT GENDER, COUNT(*) as gender_count FROM ACCOUNT GROUP BY GENDER";

                ResultSet genderGroupResult = t.executeQuery(genderScript);

                while (genderGroupResult.next()) {
                    String gender = genderGroupResult.getString("GENDER");
                    int count = genderGroupResult.getInt("gender_count");
                    String[] data = { gender, String.valueOf(count) };
                    genderDataList.add(data);
                }
            }
        } catch (Exception e) {
            String[] errorData = { "Error", e.toString() };
            genderDataList.add(errorData);
        }

        return genderDataList;
    }
    
    @Override
    public ArrayList<String[]> OrderReport() throws RemoteException {
        ArrayList<String[]> orderDataList = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos")) {
            try (Statement t = conn.createStatement()) {
                String topOrderItemsScript = "SELECT m.name, SUM(o.quantity) as total_quantity " +
                                                "FROM order_history_item o " +
                                                "JOIN menu m ON o.Menu_ID = m.id " +
                                                "GROUP BY m.name " +
                                                "ORDER BY total_quantity DESC ";


                ResultSet OrderResult = t.executeQuery(topOrderItemsScript);

                while (OrderResult.next()) {
                    String order = OrderResult.getString("NAME");
                    int count = OrderResult.getInt("total_quantity");
                    String[] data = { order, String.valueOf(count) };
                    orderDataList.add(data);
                }
            }
        } catch (Exception e) {
            String[] errorData = { "Error", e.toString() };
            orderDataList.add(errorData);
        }

        return orderDataList;
    }

    
    @Override
    public ArrayList<String> Report() throws RemoteException {
        ArrayList<String> reportDataList = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos")) {
            // total users
            try (Statement t = conn.createStatement()) {
                String totalUsersScript = "SELECT COUNT(*) as total_users FROM ACCOUNT";
                ResultSet totalUsersResult = t.executeQuery(totalUsersScript);
                totalUsersResult.next();
                int totalUsers = totalUsersResult.getInt("total_users");
                reportDataList.add(String.valueOf(totalUsers));
            }

            //total revenue
            try (Statement t = conn.createStatement()) {
                String totalRevenueScript = "SELECT SUM(m.price) as total_revenue " +
                                            "FROM order_history_item o " +
                                            "JOIN menu m ON o.Menu_ID = m.id";

                ResultSet totalRevenueResult = t.executeQuery(totalRevenueScript);

                if (totalRevenueResult.next()) {
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
  
                    String totalRevenue = decimalFormat.format(totalRevenueResult.getDouble("total_revenue"));

                    reportDataList.add(String.valueOf(totalRevenue));
                }
            }

            //total order
            try (Statement t = conn.createStatement()) {
                String totalOrderItemsScript = "SELECT COUNT(*) as total_order_items " +
                                              "FROM order_history_item";

                ResultSet totalOrderItemsResult = t.executeQuery(totalOrderItemsScript);
                if (totalOrderItemsResult.next()) {
                    int totalOrderItems = totalOrderItemsResult.getInt("total_order_items");

                    reportDataList.add(String.valueOf(totalOrderItems));
                }    
            }
        } catch (Exception e) {
            reportDataList.add(e.toString());
        }

        return reportDataList;
    }
    
    

    @Override
    public String DeleteMenu(String name) throws RemoteException{
        Connection conn = null;
        PreparedStatement  pstmt = null;
        try {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos");
            String sql = "DELETE FROM MENU WHERE NAME = '"+ name +"'";
            pstmt = conn.prepareStatement(sql);

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                return "success";
            } else {
                return "fail";
            }
        }catch(Exception e){
            return (e.toString());
        }
    }
    
    @Override
    public String UpdateMenu(String id, String name, String price, String category,String imagePath) throws RemoteException {
        Connection conn = null;
        PreparedStatement  pstmt = null;
        try {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos");
            String updateQuery = "UPDATE MENU SET NAME = '"+name+"', PRICE = "+Double.parseDouble(price)+", CATEGORY = '"+category+"',IMAGE = '"+imagePath+"' WHERE ID = "+id+" ";
            pstmt = conn.prepareStatement(updateQuery);
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                return "success";
            } else {
                return "fail";
            }
        }catch(Exception e){
            return (e.toString());
        }
    }
    
    @Override
    public String SaveMenu(String imagePath, String name, Double price, String category) throws RemoteException {
        Connection conn = null;
        PreparedStatement  pstmt = null;

        try {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos");
            String insertQuery = "INSERT INTO MENU ( Name,Price,Category,Image) VALUES (?, ?, ?, ?)";

            pstmt = conn.prepareStatement(insertQuery);
            pstmt.setString(1, name);
            pstmt.setDouble(2, price);
            pstmt.setString(3, category);
            pstmt.setString(4, imagePath);

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                return "success";
            } else {
                return "fail";
            }
        }catch(Exception e){
            return (e.toString());
        }
    }
                            
    
    @Override
    public ArrayList<String[]> displayMenu() throws RemoteException {
        try {
            ArrayList<String[]> menuList = new ArrayList<>();
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos");
            Statement stmt = conn.createStatement();
            String sql = "SELECT * from MENU";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String food_name = rs.getString("NAME");
                String price = rs.getString("PRICE");
                String Category = rs.getString("CATEGORY");
                String imagePath = rs.getString("IMAGE");
                int menuID = rs.getInt("ID"); // Assuming "ID" is the column name for menu ID
                String[] menuData = {String.valueOf(menuID),food_name, String.valueOf(price),Category, imagePath};
                menuList.add(menuData);
            }
        return menuList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
   
    
    @Override
    public ArrayList<String[]> ViewOrderId() throws RemoteException {
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos");
            try (Statement t = conn.createStatement()) {
                String sql = "SELECT ID FROM ORDER_HISTORY";
                ResultSet rs = t.executeQuery(sql);

                ArrayList<String[]> orderIdList = new ArrayList<>();

                while (rs.next()) {
                    String ID = rs.getString("ID");
                    String[] orderData = {ID};
                    orderIdList.add(orderData);
                }
                
                return orderIdList;

            } catch (Exception e) {
                System.out.println(e.toString());
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return null;
    }
       
    @Override
    public ArrayList<Object> ViewOrderHistoryItem(String ID) throws RemoteException {
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos");
            ArrayList<Object> result = new ArrayList<>();

            String QUERY1 = "SELECT TOTAL_AMOUNT FROM ORDER_HISTORY WHERE ID = " + ID;
            PreparedStatement t = conn.prepareStatement(QUERY1);
            ResultSet orderHistoryResults = t.executeQuery();

            Object[] orderDetails = new Object[1];

            while (orderHistoryResults.next()) {
                double amount = orderHistoryResults.getDouble("TOTAL_AMOUNT");
                orderDetails[0] = amount;
    
            }

            String sql = "SELECT MENU_ID, QUANTITY FROM ORDER_HISTORY_ITEM WHERE ORDER_ID = " + ID;
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet orderHistoryItemResults = preparedStatement.executeQuery();

            ArrayList<Object[]> menuItems = new ArrayList<>();

            while (orderHistoryItemResults.next()) {
                String menuID = orderHistoryItemResults.getString("MENU_ID");
                int quantity = orderHistoryItemResults.getInt("QUANTITY");

                String menuQuery = "SELECT NAME, PRICE FROM MENU WHERE ID = ?";
                PreparedStatement menuPreparedStatement = conn.prepareStatement(menuQuery);
                menuPreparedStatement.setString(1, menuID);
                ResultSet menuResults = menuPreparedStatement.executeQuery();

                while (menuResults.next()) {
                    String name = menuResults.getString("NAME");
                    double price = menuResults.getDouble("PRICE");
                    Object[] menuData = new Object[3];
                    menuData[0] = name;
                    menuData[1] = price;
                    menuData[2] = quantity;
                    menuItems.add(menuData);
                }
            }

            result.add(orderDetails);
            result.addAll(menuItems);

            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    
    @Override
    public String placeOrder()throws RemoteException{
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos");
            Statement stmt = conn.createStatement();
            LocalDate todayDate = LocalDate.now();
            System.out.println(todayDate);
            String sql = "Insert into ORDER_HISTORY (USER_ID, TOTAL_AMOUNT, DATE) Select "+UserId+",sum(c.QUANTITY * m.PRICE),'" + todayDate + "' from CART c inner join MENU m on m.ID = c.FOOD_ID where c.USER_ID = "+UserId+"";
            stmt.executeUpdate(sql);
            
            String sql2 = "Insert into ORDER_HISTORY_ITEM (ORDER_ID, MENU_ID, QUANTITY) Select oh.ID, c.FOOD_ID, c.QUANTITY from cart c inner join ORDER_HISTORY oh on oh.USER_ID = c.USER_ID where c.USER_ID = "+UserId+"and oh.ID = (Select max(ID) from ORDER_HISTORY)";
            stmt.executeUpdate(sql2);
        } catch (Exception e) {
            return e.toString();
        }
        return "Place Order success";
    }
    
    @Override
    public String addToCart(int id,int q)throws RemoteException{
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos");
            Statement stmt = conn.createStatement();
            String sql = "Select * from CART where USER_ID = "+ UserId +" and FOOD_ID = "+ id +"";
            ResultSet rs = stmt.executeQuery(sql);
                if (rs.next()) {
                        Integer cid = rs.getInt("ID");
                        Integer quantity = rs.getInt("QUANTITY");
                       int total = quantity + q;
                       Statement stmt1 = conn.createStatement();
                       String sql1 = "Update CART Set QUANTITY = "+ total +" where ID = "+ cid +"";
                       stmt1.executeUpdate(sql1);
                    }
            
            else{
                Statement stmt2 = conn.createStatement();
                String sql2 = "Insert into CART (USER_ID, FOOD_ID, QUANTITY) values ("+UserId+", "+id+", "+ q +")";
                stmt2.executeUpdate(sql2);
            }
        } catch (Exception e) {
            return e.toString();
        }
        return "success";
    }
    
    
    @Override
    public ArrayList<String[]> showCart() throws RemoteException {
    try {
        ArrayList<String[]> cartList = new ArrayList<>();
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos");
        Statement stmt = conn.createStatement();
        String sql = "SELECT m.IMAGE as Image, m.NAME as Name, m.PRICE as Price, c.QUANTITY as Quantity from cart c inner join MENU m on m.ID = c.FOOD_ID where c.USER_ID = "+UserId+"";
        ResultSet rs = stmt.executeQuery(sql);
        
        while (rs.next()) {
            String imagePath = rs.getString("Image");
            String food_name = rs.getString("Name");
            String price = rs.getString("Price");
            String quantity = rs.getString("Quantity");
           
            String[] cartData = {imagePath, food_name, String.valueOf(price), String.valueOf(quantity)};
            cartList.add(cartData);
        }
        return cartList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
   
    @Override
    public ArrayList<String[]> getUsername()throws RemoteException{
        try {
            ArrayList<String[]> nameList = new ArrayList<>();
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos");
            Statement stmt = conn.createStatement();
            String sql = "SELECT USERNAME from ACCOUNT where ID = "+UserId+"";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String uname = rs.getString("USERNAME");
                String[] nameData = {uname};
                nameList.add(nameData);
            }
        return nameList;
        } catch (Exception e) {
                e.printStackTrace();
        }
        return null;
    }
    
    @Override
    public String clearCart() throws RemoteException{
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos");
            Statement stmt = conn.createStatement();
            String sql = "Delete from CART where USER_ID = "+UserId+"";
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "success";
    }
    
    @Override
    public ArrayList<String[]> showOrderSummary(String ID) throws RemoteException {
        try {
            ArrayList<String[]> orderList = new ArrayList<>();
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos");
            Statement stmt = conn.createStatement();
            String sql = "SELECT m.IMAGE , m.NAME , m.PRICE , ohi.QUANTITY, oh.TOTAL_AMOUNT FROM MENU m INNER JOIN ORDER_HISTORY_ITEM ohi ON ohi.MENU_ID = m.ID INNER JOIN ORDER_HISTORY oh ON oh.ID = ohi.ORDER_ID WHERE ohi.ORDER_ID = " + ID + "";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String imagePath = rs.getString("IMAGE");
                String name = rs.getString("NAME");
                String price = rs.getString("PRICE");
                String quantity = rs.getString("QUANTITY");
                String total_amount = rs.getString("TOTAL_AMOUNT");

                String[] orderData = {imagePath, name, String.valueOf(price), String.valueOf(quantity), String.valueOf(total_amount)};
                orderList.add(orderData);
            }
            
            return orderList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    @Override
    public ArrayList<String[]> userViewOrderId() throws RemoteException {
        try {
            System.out.println("ID1:" + UserId);

            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos");
            try (Statement t = conn.createStatement()) {
                String sql = "SELECT ID FROM ORDER_HISTORY WHERE USER_ID = "+ UserId +"";
                ResultSet rs = t.executeQuery(sql);

                ArrayList<String[]> orderIdList = new ArrayList<>();

                while (rs.next()) {
                    String ID = rs.getString("ID");
                    
                    String[] orderData = {ID};
                    orderIdList.add(orderData);
                    System.out.println(ID);
                }
                
                return orderIdList;

            } catch (Exception e) {
                System.out.println("ID2:" + UserId);
                System.out.println(e.toString());
            }
        } catch (Exception e) {
            System.out.println("ID3:" + UserId);
            System.out.println(e.toString());
        }

        return null;
    }
    
    public void backup() {
        String backupDirectory = "C:\\Users\\User\\Desktop\\Year 3 Sem 1\\Distributed Computer Systems\\Ass\\FosRmi";

        try (Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/fos;create=false", "fos", "fos");
             Statement statement = connection.createStatement()) {
 
            connection.setAutoCommit(false);

            statement.execute("CALL SYSCS_UTIL.SYSCS_BACKUP_DATABASE('" + backupDirectory + "')");

            connection.commit();

            System.out.println("Backup completed successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

