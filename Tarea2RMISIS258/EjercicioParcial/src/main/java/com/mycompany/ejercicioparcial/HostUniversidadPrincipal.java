/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicioparcial;

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
public class HostUniversidadPrincipal {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
                try {
                        ServerUniversidadRMI server = new ServerUniversidadRMI();
                        ServerSegipImplements segip = new ServerSegipImplements();

                        LocateRegistry.createRegistry(1099); //levantar el servidor de registro;
                        Naming.bind("EmitirDiploma", server); // Servicio Universidad
                        Naming.bind("VerificarSegip", segip); // Servicio Segip
                        System.out.println("El servidor esta levandado");

                } catch (RemoteException | AlreadyBoundException | MalformedURLException ex) {
                        Logger.getLogger(HostUniversidadPrincipal.class.getName()).log(Level.SEVERE, null, ex); // nombre clase actual
                }                
        }
}
