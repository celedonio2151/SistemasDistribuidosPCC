/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.primerparcialsis258;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cele2154
 */
public class Cliente_JUEZ {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
                IRMI_ASFI asfi;
                boolean respuestaRetener;
                Scanner sc = new Scanner(System.in);
                boolean salir = true;
                int opcion;
                try {
                        asfi = (IRMI_ASFI) Naming.lookup("rmi://localhost/Cuentas"); // instanciar un objeto remoto 
                        while (salir) {
                                System.out.println("1:  Ver cuentas");
                                System.out.println("2:  Salir");
                                System.out.println("=============================================");
                                System.out.println("Selecione un numero del menu: ");
                                opcion = sc.nextInt();
                                 switch(opcion){
                                        case 1: 
                                                System.out.println("Ingrese el CU ");
                                                String ciCuenta = sc.next();
                                                System.out.println("Ingrese el Nombre ");
                                                String nombre = sc.next();
                                                System.out.println("Ingrese el apellido ");
                                                String apellido = sc.next();
                                                 ArrayList<Cuenta> auxCuentas = asfi.ConsultarCuentas(ciCuenta,nombre,apellido);
                                                System.out.println("La lista de cuentas es: ");
                                                int indice = 0;
                                                for(Cuenta  cuentaa:auxCuentas){
                                                        indice++;
                                                        System.out.println(indice+"   "+cuentaa);
                                                }
                                                System.out.println("=============================================");
                                                System.out.println("============Selecione una cuenta==================");
                                                System.out.println("Ingrese numero de cuenta ");
                                                String nrocuenta = sc.next();
                                                System.out.println("Ingrese el monto ");
                                                double monto = sc.nextDouble();
                                                respuestaRetener = asfi.RetenerMonto(nrocuenta, monto, "glosa");
                                                
                                                break;
                                        case 2:
                                                salir = false;
                                                break;
                                        default : 
                                                System.out.println("Valor no valido");
                                    }
                        }

                } catch (NotBoundException | MalformedURLException | RemoteException ex) {
                        Logger.getLogger(Cliente_JUEZ.class.getName()).log(Level.SEVERE, null, ex);
                }
        }

}
