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
                System.out.println("No Found: ");
                return "No";
            }
        }catch(Exception e){
            return (e.toString());
        }      
    }  
}
