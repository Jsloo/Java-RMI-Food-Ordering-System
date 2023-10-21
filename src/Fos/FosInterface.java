/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fos;

import java.rmi.*;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public interface FosInterface extends Remote{
    //User
    public String Login(String nam, String pass)throws RemoteException;
    public String Register(String nam, String pass, Integer age, String email, String phonenum, String gender)throws RemoteException;
    public String LogOut()throws RemoteException;
    public ArrayList<String[]> displayMenu()throws RemoteException;
    
    //Admin
    public String[][] Report()throws RemoteException;
    public String SaveMenu(String imagePath, String name, Double price, String category)throws RemoteException;
    public ArrayList<String[]> ViewMenu()throws RemoteException;
    public String DeleteMenu(String name)throws RemoteException;
    public String UpdateMenu(String id, String name, String price, String category) throws RemoteException;

}
