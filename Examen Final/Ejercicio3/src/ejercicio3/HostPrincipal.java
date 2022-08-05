/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cele2154
 */
public class HostPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            servidorIntercambio intercambio = new servidorIntercambio();
            servidorBNB bnb = new servidorBNB();
            servidorBancoUnion union = new servidorBancoUnion();
            LocateRegistry.createRegistry(1099); //levantar el servidor de registro;
            Naming.bind("intercambio", intercambio); // Servicio Universidad
            Naming.bind("banco bnb", bnb); // Servicio Universidad
            Naming.bind("banco union", union); // Servicio Universidad
            System.out.println("El servidor bnb esta levandado");
            System.out.println("El servidor banco union esta levandado");
            System.out.println("El servidor plataforma de intercambio esta levandado");

         } catch (RemoteException ex) {
            Logger.getLogger(HostPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(HostPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(HostPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
