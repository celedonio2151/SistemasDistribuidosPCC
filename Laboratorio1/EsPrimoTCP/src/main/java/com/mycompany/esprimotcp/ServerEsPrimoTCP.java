/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.esprimotcp;

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
public class ServerEsPrimoTCP {

    /**
     * @param args the command line arguments
     */
    public int esPrimo(int limite){
            int contadorDivisor = 0;
            for (int i = 1; i <= limite; i++) {
                            if(limite%i == 0){
                                        contadorDivisor++;
                            }
             }
            return contadorDivisor;
    }
    
    
    public static void main(String[] args) {
            int port = 5002; 
            ServerEsPrimoTCP primo = new ServerEsPrimoTCP();
            String mensajeDevolver = "";
            
            try {
                        while(true){
                                    ServerSocket server = new ServerSocket(port);
                                    System.out.println("Se inicio el servidor con éxito");
                                    Socket client;
                                    PrintStream toClient;       
                                    client = server.accept(); //conexion
                                    BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream())); // el lector
                                    System.out.println("Cliente se conecto");
                                    String numero = fromClient.readLine();
                                    int numeroPrimo = Integer.valueOf(numero);  // convierte el del cliente en Entero
                                    int es = primo.esPrimo(numeroPrimo);    // Devuelve numero de divisores
                                    if(es == 2){
                                                mensajeDevolver = numero + " es primo";
                                    }else{
                                                mensajeDevolver = numero+" no es primo";
                                    }
                                    System.out.println("Mensaje del cliente: " + numeroPrimo +" " + es);
//                                    ================================================================================
                                    toClient = new PrintStream(client.getOutputStream()); 
                                    toClient.println(mensajeDevolver);
                                    System.out.println("Cliente se desconecto");
                        }
            } catch (IOException e) {
                        System.out.println(e.getMessage());
            }
    }
    
}
