/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicio2;

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
public class ClienteLibros {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
                ICRUD librosCli;
                Scanner teclado = new Scanner(System.in);
                boolean salir = true;
                int opcion;
                String titulo,autor,editorial,mensaje;
                int idLibro,anio;
                
//                Libro aux = 
                
                try {
                       // instanciar un objeto remoto en una ruta  por la interfaz del objeto
                        librosCli = (ICRUD)Naming.lookup("rmi://localhost/Libros"); 
                        while(salir){
                        System.out.println("=============================================");
                        System.out.println("1:  Crear ");
                        System.out.println("2:  Editar ");
                        System.out.println("3:  Eliminar ");
                        System.out.println("4:  Mostrar ");
                        System.out.println("5:  Salir ");
                        System.out.println("=============================================");
                        System.out.println("Selecione un numero del menu: ");
                        opcion = teclado.nextInt();
                            switch(opcion){
                                case 1:
                                        System.out.println("Ingrese el titulo del libro: ");
                                        titulo = teclado.next();
                                        System.out.println("Ingrese el autor del libro: ");
                                         autor = teclado.next();
                                        System.out.println("Ingrese el editorial del libro: ");
                                        editorial = teclado.next();
                                        System.out.println("Ingrese el anio del libro: ");
                                        anio = teclado.nextInt();
                                        System.out.println("Libro: ");
                                        mensaje = librosCli.crear(titulo, autor, editorial, anio);
                                        if(mensaje.equals("si")){
                                                System.out.println("Se inserto con exito");
                                        }else{
                                                System.out.println("Hubo un error al isertar");
                                        }
                                        break;
                                case 2:
                                        System.out.println("Ingrese el id del libro a editar: ");
                                        idLibro = teclado.nextInt();
                                        System.out.println("Ingrese el titulo del libro: ");
                                        titulo = teclado.next();
                                        System.out.println("Ingrese el autor del libro: ");
                                         autor = teclado.next();
                                        System.out.println("Ingrese el editorial del libro: ");
                                        editorial = teclado.next();
                                        System.out.println("Ingrese el anio del libro: ");
                                        anio = teclado.nextInt();
                                        System.out.println("Libro: ");
                                        Libro aux  = librosCli.editar(idLibro, titulo, autor, editorial, anio);
                                        System.out.println(aux); // imprimer 
                                        break;
                                case 3:
                                        System.out.println("Ingrese idLibro para eliminar4: ");
                                        idLibro = teclado.nextInt();
//                                        System.out.println("Invertir Cadena: "+librosCli.invertirCadena(cadena));
                                        mensaje = librosCli.eliminar(idLibro);
                                        System.out.println("Mensaje: "+mensaje);
                                        break;
                                case 4:
                                        ArrayList<Libro> auxiliar = librosCli.mostrar();
                                        for(Libro  libro:auxiliar){
                                                System.out.println(libro);
                                        }
                                        break;
                                case 5:
                                        salir = false;
                                        break;
                                default : 
                                        System.out.println("Valor no valido");
                            }
                        }

        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(ClienteLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
}
