/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.laboratorio1.perka.casillas;

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
public class PricipalRMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ServidorBanco serverBanco = new ServidorBanco();
            ServidorCessa serverCessa = new ServidorCessa();
            ServidorCotes serverCotes = new ServidorCotes();

            LocateRegistry.createRegistry(1099); //levantar el servidor de registro;
            Naming.bind("Serer Banco", serverBanco);
            Naming.bind("Server Cotes", serverCotes);
            Naming.bind("Server Cessa", serverCessa);
            System.out.println("Los servidores estan levandados");

        } catch (RemoteException ex) {
            Logger.getLogger(PricipalRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(PricipalRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(PricipalRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
