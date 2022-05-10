/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicio2;

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
public class ServerLibrosRMI {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
                System.out.println("Preparando servidor RMI...");
                try {

                        AdministrarLibrosImplement librosR = new AdministrarLibrosImplement();// instanciar la clase remota
//                        Vinculamos el objeto remoto acciones en el registro registry
                        LocateRegistry.createRegistry(1099); //levantar el servidor de registro en un puerto
//                        Enlazamos la clase y nombreamos el objeto remoto RMI 
                        Naming.bind("Libros", librosR);
                        System.out.println("El servidor esta levandado");

                } catch (RemoteException | AlreadyBoundException | MalformedURLException ex) {
                        Logger.getLogger(ServerLibrosRMI.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        
}