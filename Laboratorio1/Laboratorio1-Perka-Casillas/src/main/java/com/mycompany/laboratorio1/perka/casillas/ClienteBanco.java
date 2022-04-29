/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.laboratorio1.perka.casillas;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cele2154
 */
public class ClienteBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ICotes cotes;
        ICessa cessa;
        IBanco banco;
        Scanner sc = new Scanner(System.in);
        
        try {
            cotes = (ICotes)Naming.lookup("rmi://localhost/cotes"); // instanciar un objeto remoto
            cessa = (ICessa)Naming.lookup("rmi://localhost/cessa"); // instanciar un objeto remoto
            banco = (IBanco)Naming.lookup("rmi://localhost/banco"); // instanciar un objeto remoto
//            while(salir){
            System.out.println("1:  Sumar");
            System.out.println("2:  Restar");
            System.out.println("=============================================");
            System.out.println("Selecione un numero del menu: ");
//            opcion = sc.nextInt();
//                switch(opcion){
//                    case 1: 
//                        System.out.println("suma: "+cuatroOperaciones.sumar(primerNum,segundoNum));
//                        break;
//                    case 2:
//                        System.out.println("resta: "+cuatroOperaciones.restar(primerNum, segundoNum));
//                        break;
//                    default : 
//                        System.out.println("Valor no valido");
//                }
//            }

        } catch (NotBoundException ex) {
            Logger.getLogger(ClienteBanco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClienteBanco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClienteBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
