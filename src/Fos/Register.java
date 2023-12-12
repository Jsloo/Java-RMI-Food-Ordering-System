package Fos;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Register {

    public static void main(String[] args) throws RemoteException {
        java.rmi.registry.Registry reg = LocateRegistry.createRegistry(2000);

        //user
        //Loo Juin Song
        reg.rebind("Login", new Server());
        reg.rebind("Register", new Server());
        reg.rebind("LogOut", new Server());
        reg.rebind("GetProfile", new Server());
        reg.rebind("UpdateProfile", new Server());
        
        //Tay Quan Jun
        reg.rebind("displayMenu", new Server());
        reg.rebind("addToCart", new Server());
        reg.rebind("showCart", new Server());
        reg.rebind("showOrderSummary", new Server());
        reg.rebind("userViewOrderId", new Server());
        reg.rebind("getUsername", new Server());
//        reg.rebind("updateCart", new Server());
        reg.rebind("clearCart", new Server());
        reg.rebind("placeOrder", new Server());
        

        //admin
        //Loo Juin Song
        reg.rebind("Report", new Server());
        reg.rebind("AgeReport", new Server());
        reg.rebind("GenderReport", new Server());
        reg.rebind("OrderReport", new Server());
        
        //Chan Heng Yan
        reg.rebind("SaveMenu", new Server());
//        reg.rebind("ViewMenu", new Server());
        reg.rebind("DeleteMenu", new Server());
        reg.rebind("UpdateMenu", new Server());
        reg.rebind("ViewOrderId", new Server());
        reg.rebind("ViewOrderHistoryItem", new Server());
    }
}
