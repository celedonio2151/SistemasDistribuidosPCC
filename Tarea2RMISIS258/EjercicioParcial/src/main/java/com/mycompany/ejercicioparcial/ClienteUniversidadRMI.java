/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicioparcial;

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
public class ClienteUniversidadRMI {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
                IUniversidad universidad;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el primer numero: ");
        int primerNum = sc.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        int segundoNum = sc.nextInt();
        boolean salir = true;
        int opcion;
        try {
            universidad = (IUniversidad)Naming.lookup("rmi://localhost/EmitirDiploma"); // instanciar un objeto remoto 
            while(salir){
            System.out.println("1:  Sumar");
            System.out.println("2:  Restar");
            System.out.println("3:  Salir");
            System.out.println("=============================================");
            System.out.println("Selecione un numero del menu: ");
            opcion = sc.nextInt();
                switch(opcion){
                    case 1: 
                       universidad.emitirDiploma(1,"Carla","Perrez","Calcina","20*04*2022","Sistemas");
                        break;
                    case 2:
//                        System.out.println("resta: "+universidad.restar(primerNum, segundoNum));
                        break;
                    case 3:
                        salir = false;
                        break;
                    default : 
                        System.out.println("Valor no valido");
                }
            }

        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(ClienteUniversidadRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
}
