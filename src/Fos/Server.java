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
}
