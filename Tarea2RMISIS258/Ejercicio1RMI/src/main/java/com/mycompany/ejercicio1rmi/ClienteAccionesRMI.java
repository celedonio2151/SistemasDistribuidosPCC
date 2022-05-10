/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicio1rmi;

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
public class ClienteAccionesRMI {
        Scanner teclado = new Scanner(System.in);
//        IAccionesRMI accionesCli;

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
                 IAccionesRMI accionesCli;
                Scanner teclado = new Scanner(System.in);
                boolean salir = true;
                int opcion;
                
                try {
                       // instanciar un objeto remoto en una ruta  por la interfaz del objeto
                        accionesCli = (IAccionesRMI)Naming.lookup("rmi://localhost/Acciones"); 
                        while(salir){
                        System.out.println("=============================================");
                        System.out.println("1:  Sumatoria");
                        System.out.println("2:  Factorial");
                        System.out.println("3:  Invertir Cadena");
                        System.out.println("4:  Salir");
                        System.out.println("=============================================");
                        System.out.println("Selecione un numero del menu: ");
                        opcion = teclado.nextInt();
                            switch(opcion){
                                case 1: 
                                        System.out.println("Ingrese un numero para calcular su factorial: ");
                                        int numero1 = teclado.nextInt();
                                    System.out.println("Sumarotoria: "+accionesCli.sumatoria(numero1));
                                    break;
                                case 2:
                                        System.out.println("Ingrese un numero para calcular su factorial: ");
                                        int numero2 = teclado.nextInt();
                                    System.out.println("Factorial: "+accionesCli.factorial(numero2));
                                    break;
                                case 3:
                                        System.out.println("Ingrese una palabra para invertir: ");
                                        String cadena = teclado.next();
                                            System.out.println("Invertir Cadena: "+accionesCli.invertirCadena(cadena));
                                    break;
                                case 4:
                                    salir = false;
                                    break;
                                default : 
                                    System.out.println("Valor no valido");
                            }
                        }

        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(ClienteAccionesRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

}
