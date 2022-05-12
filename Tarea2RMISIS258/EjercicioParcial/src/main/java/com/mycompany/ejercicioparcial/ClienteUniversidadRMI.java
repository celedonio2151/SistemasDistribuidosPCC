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
        boolean salir = true;
        int opcion;
        try {
            universidad = (IUniversidad)Naming.lookup("rmi://localhost/EmitirDiploma"); // instanciar un objeto remoto 
            while(salir){
            System.out.println("1:  Emitir Diploma");
            System.out.println("2:  Salir");
            System.out.println("=============================================");
            System.out.println("Selecione un numero del menu: ");
            opcion = sc.nextInt();
                switch(opcion){
                    case 1: 
                             Diploma diploma = universidad.emitirDiploma(1140506,"Walter Jhamil","Segovia","Arellano","11-02-1996","Sistemas");
                            System.out.println("La Diploma es: ");
                            System.out.println(diploma.toString());
                        break;
                    case 2:
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
