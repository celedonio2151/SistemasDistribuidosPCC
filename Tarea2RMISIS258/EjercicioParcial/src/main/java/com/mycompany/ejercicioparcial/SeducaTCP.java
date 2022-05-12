/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicioparcial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author cele2154
 */
public class SeducaTCP {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
                int port = 5000;
                SeducaTCP seduca = new SeducaTCP();
                String mensajeDevolver = "";

                try {
                        while (true) {
                                ServerSocket server = new ServerSocket(port);
                                System.out.println("Se inicio el servidor TCP SEDUCA con éxito");
                                Socket client;
                                PrintStream toClient;
                                client = server.accept(); //conexion
                                BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream())); // el lector
                                System.out.println("Cliente se conecto");
                                String numero = fromClient.readLine();
                                String datos = String.valueOf(numero);  // convierte el del cliente en Entero   
                                System.out.println("Dato del cliente: "+datos);
//                                Verificando rude
//                                if (datos.equals("WaSeAr11-02-1996")) {
                                if ("WaSeAr11-02-1996".equals(datos)) {
                                        mensajeDevolver = "si"+" : "+"verificado con exito";
                                }else{
                                        mensajeDevolver = "no"+" : "+"no se encontro el titulo de bachiller";
                                }
//                                    ========================================================================
                                toClient = new PrintStream(client.getOutputStream());
                                toClient.println(mensajeDevolver);
                                System.out.println("Cliente se desconecto");
                        }
                } catch (IOException e) {
                        System.out.println(e.getMessage());
                }
        }

}
