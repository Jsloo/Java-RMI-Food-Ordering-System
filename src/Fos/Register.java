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
        java.rmi.registry.Registry login = LocateRegistry.createRegistry(2000);
        login.rebind("Login", new Server());
        
        java.rmi.registry.Registry reg = LocateRegistry.createRegistry(2001);
        reg.rebind("Register", new Server());
    }
}
