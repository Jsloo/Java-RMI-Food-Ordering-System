/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fos;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;


/**
 *
 * @author User
 */
public class Server extends UnicastRemoteObject implements FosInterface {
    public Server()throws RemoteException{
        super();
    }
    public Integer UserId = 0;
    //user
    @Override
    public String Login(String nam, String pass)throws RemoteException{
        try{
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos");
            Statement t = conn.createStatement();
            String script = "SELECT * from ACCOUNT where USERNAME = '" + nam + "' and PASSWORD = '" + pass + "'";

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
            conn.setAutoCommit(false); 

            
            try (Statement statement = conn.createStatement()) {
                String checkExist = "SELECT USERNAME FROM ACCOUNT WHERE USERNAME = '" + nam + "'";
                ResultSet resultSet = statement.executeQuery(checkExist);

                if (resultSet.next()) {
                    return "Username already exists!";
                }
            } 


            try (Statement statement = conn.createStatement()) {
                String script = "INSERT INTO ACCOUNT (USERNAME, PASSWORD, TYPE, AGE, EMAIL, PHONE, GENDER) " +
                                "VALUES ('" + nam + "', '" + pass + "', 'user', " + age + ", '" + email + "', '" +
                                phonenum + "', '" + gender + "')";
                statement.executeUpdate(script);

                conn.commit();
                return "Register Successful!";
            } 

        } catch (Exception e) {
            return "Error occurred: " + e.toString();
        }    
    }  
    
    @Override
    public String LogOut()throws RemoteException{
        UserId = 0;
        return "LogOut Success!";
    }
    //admin
    @Override
    public String[][] Report() throws RemoteException {
        String[][] result = new String[14][2]; 
        ArrayList<Object> result2 = new ArrayList<>();
        for (String[] row : result) {
            Arrays.fill(row, "");
        }
        System.out.println(Arrays.deepToString(result));
        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos")) {
            // total users
            try (Statement t = conn.createStatement()) {
                String totalUsersScript = "SELECT COUNT(*) as total_users FROM ACCOUNT";
                ResultSet totalUsersResult = t.executeQuery(totalUsersScript);
                totalUsersResult.next();
                int totalUsers = totalUsersResult.getInt("total_users");
                result[0][0] = "Total";
                result[0][1] = String.valueOf(totalUsers);
            }

            // age
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
                        "ORDER BY age_group_count DESC " +
                        "FETCH FIRST 3 ROWS ONLY";

                ResultSet ageGroupResult = t.executeQuery(ageGroupScript);

                int index = 1;
                while (ageGroupResult.next()) {
                    String ageGroup = ageGroupResult.getString("AGE_GROUP");
                    int count = ageGroupResult.getInt("age_group_count");
                    result[index][0] = ageGroup;
                    result[index][1] = String.valueOf(count);
                    index++;
                }
            }

            //gender
            try (Statement t = conn.createStatement()) {
                String genderScript = "SELECT GENDER, COUNT(*) as gender_count FROM ACCOUNT GROUP BY GENDER";
                ResultSet genderResult = t.executeQuery(genderScript);

                int index = 4;
                while (genderResult.next()) {
                    String gender = genderResult.getString("GENDER");
                    int count = genderResult.getInt("gender_count");
                    result[index][0] = gender;
                    result[index][1] = String.valueOf(count);
                    index++;
                }
            }
            
            //total revenue
            try (Statement t = conn.createStatement()) {
                String totalRevenueScript = "SELECT SUM(m.price) as total_revenue " +
                                            "FROM order_history_item o " +
                                            "JOIN menu m ON o.MenuID = m.id";

                ResultSet totalRevenueResult = t.executeQuery(totalRevenueScript);

                if (totalRevenueResult.next()) {
                    double totalRevenue = totalRevenueResult.getDouble("total_revenue");

                    result[6][0] = "Total Revenue";
                    result[6][1] = String.valueOf(totalRevenue);
                }
            }
            
            //category top 3
            try (Statement t = conn.createStatement()) {
               String revenueScript = "SELECT m.category, SUM(m.price) as total_revenue " +
                                      "FROM order_history_item o " +
                                      "JOIN menu m ON o.MenuID = m.id " +
                                      "GROUP BY m.category " +
                                      "ORDER BY total_revenue DESC " +
                                      "FETCH FIRST 3 ROWS ONLY";

               ResultSet revenueResult = t.executeQuery(revenueScript);

               int index = 7; 
               while (revenueResult.next()) {
                   String menuCategory = revenueResult.getString("category");
                   double totalRevenue = revenueResult.getDouble("total_revenue");

                   result[index][0] = menuCategory;
                   result[index][1] = String.valueOf(totalRevenue);
                   index++;
               }
            }
            
            try (Statement t = conn.createStatement()) {
                String totalOrderItemsScript = "SELECT COUNT(*) as total_order_items " +
                                              "FROM order_history_item";

                ResultSet totalOrderItemsResult = t.executeQuery(totalOrderItemsScript);

                if (totalOrderItemsResult.next()) {
                    int totalOrderItems = totalOrderItemsResult.getInt("total_order_items");

                    // Store total number of order items in the result array
                    result[10][0] = "Total Order Items";
                    result[10][1] = String.valueOf(totalOrderItems);
                }

                // Query to get the top three highest number of order items along with their names
                String topOrderItemsScript = "SELECT m.name, COUNT(o.MenuID) as order_item_count " +
                                             "FROM order_history_item o " +
                                             "JOIN menu m ON o.MenuID = m.id " +
                                             "GROUP BY m.name " +
                                             "ORDER BY order_item_count DESC " +
                                             "FETCH FIRST 3 ROWS ONLY";

                ResultSet topOrderItemsResult = t.executeQuery(topOrderItemsScript);

                int index = 11;
                while (topOrderItemsResult.next()) {
                    String itemName = topOrderItemsResult.getString("name");
                    int itemCount = topOrderItemsResult.getInt("order_item_count");

                    // Store item name and item count in the result array
                    result[index][0] = itemName;
                    result[index][1] = String.valueOf(itemCount);
                    index++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            result = new String[][]{{"Error", e.toString()}};
        }
        System.out.println(Arrays.deepToString(result));
        return result;
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
    public String UpdateMenu(String id, String name, String price, String category) throws RemoteException {
        Connection conn = null;
        PreparedStatement  pstmt = null;

        try {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos");
            String sql = "DELETE FROM MENU WHERE ID = '"+ id +"'";

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setDouble(2, Double.parseDouble(price));
            pstmt.setString(3, category);

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
    public ArrayList<String[]> ViewMenu()throws RemoteException{

        try{
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos");
            try (Statement t = conn.createStatement()) {
                String sql = "SELECT* FROM MENU";
                ResultSet rs = t.executeQuery(sql);

                ArrayList<String[]> menuDataList = new ArrayList<>();

                while (rs.next()) {
                    String ID = rs.getString("ID");
                    String Name = rs.getString("NAME");
                    double Price = rs.getDouble("PRICE");
                    String Category = rs.getString("CATEGORY");
                    String[] menuData = {ID,Name, String.valueOf(Price), Category};
                    menuDataList.add(menuData);
                }   
                return menuDataList;

            }catch(Exception e){
                System.out.println(e.toString());
            }
        }catch(Exception e){
            System.out.println(e.toString());
        }
        return null;

    }                            
    
}
