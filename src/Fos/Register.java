
package Fos;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Register {
    public static void main(String[] args) throws RemoteException{
        java.rmi.registry.Registry reg = LocateRegistry.createRegistry(2000);
        
        //user
        reg.rebind("Login", new Server());
        reg.rebind("Register", new Server());
        reg.rebind("LogOut", new Server());
        
        //admin
        reg.rebind("Report", new Server());
        reg.rebind("SaveMenu", new Server());
        reg.rebind("ViewMenu", new Server());
        reg.rebind("DeleteMenu", new Server());
        reg.rebind("UpdateMenu", new Server());
        reg.rebind("ViewOrderId", new Server());
        reg.rebind("ViewOrderHistoryItem", new Server());
    }
}
