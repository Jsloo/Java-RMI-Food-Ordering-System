/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fos;

import java.rmi.*;
import java.net.*;
/**
 *
 * @author User
 */
public interface FosInterface extends Remote{
    public String Login(String nam, String pass)throws RemoteException;
}
