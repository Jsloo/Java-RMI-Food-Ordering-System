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
import java.sql.ResultSet;
import java.sql.Statement;

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
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos");
            Statement t = conn.createStatement();
            String script = "SELECT * from ACCOUNT where USERNAME = '" + nam + "' and PASSWORD = '" + pass + "'";

            ResultSet rs = t.executeQuery(script);
            boolean found = rs.next(); 

            if(found){
                String userType = rs.getString("TYPE");
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
    public String Register(String nam, String pass, String age, String email, String phonenum, String gender)throws RemoteException{
        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/fos", "fos", "fos")) {
            conn.setAutoCommit(false); 

            
            try (Statement statement = conn.createStatement()) {
                String checkExist = "SELECT USERNAME FROM ACCOUNT WHERE USERNAME = '" + nam + "'";
                ResultSet resultSet = statement.executeQuery(checkExist);

                if (resultSet.next()) {
                    return "Username already exists!";
                }
            } 

            
            String checkLast = "SELECT USERID FROM ACCOUNT ORDER BY USERID DESC FETCH FIRST 1 ROW ONLY";
            try (Statement statement = conn.createStatement()) {
                ResultSet cl = statement.executeQuery(checkLast);

                String userId = "UUID0";
                if (cl.next()) {
                    userId = cl.getString("USERID");
                    System.out.println("Last User ID: " + userId);
                } 

                int numericPart = Integer.parseInt(userId.replaceAll("\\D", ""));
                String newUserId = "UUID" + (numericPart + 1);
                System.out.println("New User ID: " + newUserId);

                
                String script = "INSERT INTO ACCOUNT (USERNAME, PASSWORD, TYPE, AGE, EMAIL, PHONE, GENDER, USERID) " +
                                "VALUES ('" + nam + "', '" + pass + "', 'user', '" + age + "', '" + email + "', '" +
                                phonenum + "', '" + gender + "', '" + newUserId + "')";
                statement.executeUpdate(script);

                conn.commit();
                return "Register Successful!";
            } 

        } catch (Exception e) {
            e.printStackTrace();
            return "Error occurred: " + e.toString();
        }    
    }  
}
