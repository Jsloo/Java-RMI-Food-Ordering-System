/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fos;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author User
 */
public class Register {
    public static void main(String[] args) throws RemoteException{
        java.rmi.registry.Registry reg = LocateRegistry.createRegistry(2000);
        
        //user
        reg.rebind("Login", new Server());
        reg.rebind("Register", new Server());
        
        
        //admin
        reg.rebind("Report", new Server());
        login.rebind("SaveMenu", new Server());
        login.rebind("ViewMenu", new Server());
        login.rebind("DeleteMenu", new Server());
        login.rebind("UpdateMenu", new Server());

    }
}
