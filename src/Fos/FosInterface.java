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
    //Loo Juin Song
    public String Login(String nam, String pass)throws RemoteException;
    public String Register(String nam, String pass, Integer age, String email, String phonenum, String gender)throws RemoteException;
    public String LogOut()throws RemoteException;
    public ArrayList<String> GetProfile()throws RemoteException;
    public String UpdateProfile(String nam, String pass, Integer age, String email, String phonenum, String gender)throws RemoteException;
    
    //Tay Quan Jun
    public ArrayList<String[]> displayMenu()throws RemoteException;
    public String addToCart(int id,int q)throws RemoteException;
    public ArrayList<String[]> showCart()throws RemoteException;
    public ArrayList<String[]> showOrderSummary(Integer ID)throws RemoteException;
    public ArrayList<String[]> userViewOrderId()throws RemoteException;
    public ArrayList<String[]> getUsername()throws RemoteException;
//    public String updateCart()throws RemoteException;
    public String clearCart()throws RemoteException;
    
    
    //Admin
    //Loo Juin Song
    public ArrayList<String> Report()throws RemoteException;
    public ArrayList<String[]> AgeReport()throws RemoteException;
    public ArrayList<String[]> GenderReport()throws RemoteException;
    public ArrayList<String[]> OrderReport()throws RemoteException;
    
    //Chan Heng Yan
    public String SaveMenu(String imagePath, String name, Double price, String category)throws RemoteException;
    public String DeleteMenu(String name)throws RemoteException;
    public String UpdateMenu(String id, String name, String price, String category,String imagePath) throws RemoteException;
    public ArrayList<String[]> ViewOrderId() throws RemoteException;
    public ArrayList<Object> ViewOrderHistoryItem(String ID) throws RemoteException ;
}
