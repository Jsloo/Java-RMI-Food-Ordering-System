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
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Server extends UnicastRemoteObject implements FosInterface {
    public Server()throws RemoteException{
        super();
    }
    
    
    
    @Override
    public String Login(String nam, String pass)throws RemoteException{
        try{
            System.out.println("1");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos");
            System.out.println("Connected to library DB");

            //login
            Statement t = conn.createStatement();
            String script = "SELECT * from ACCOUNT where USERNAME = '" + nam + "' and PASSWORD = '" + pass + "'";
            
            System.out.println("Script: "+ script);

            ResultSet rs = t.executeQuery(script);
            boolean found = rs.next(); 

            if(found){
                System.out.println("Found: ");
                return "Login Successfull!";
            }else{
                System.out.println("User Name or Pasword Incorrect!: ");
                return "No";
            }
        }catch(Exception e){
            return (e.toString());
        }      
    }  
    @Override
    public String Register(String nam, String pass)throws RemoteException{
        try{
            System.out.println("1");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos");
            System.out.println("Connected to library DB");

            //login
            Statement statement  = conn.createStatement();
            String selectQuery = "SELECT USERNAME FROM ACCOUNT WHERE USERNAME = '" + nam + "'";
            String script = "INSERT INTO ACCOUNT (USERNAME, PASSWORD) VALUES ('" + nam + "', '" + pass + "')";
            ResultSet resultSet = statement.executeQuery(selectQuery);
            
            if (resultSet.next()) {
                return "Username already exists!";
            } else {
                System.out.println("Script: "+ script);
                statement.executeUpdate(script);
                return "Register Succesful!";
            }
            

            
        }catch(Exception e){
            return (e.toString());
        }      
    } 
    @Override
    public String DeleteMenu(String name)throws RemoteException{
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
