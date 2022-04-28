/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.IOException;
import java.math.BigInteger;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author cele2154
 */
public class ServerEsPrimoUDP {

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
        ServerEsPrimoUDP server = new ServerEsPrimoUDP();
        int PUERTO = 5000;
        String res = "";
        
        try {
            System.out.println("Iniciamos el servidor UDP");
            DatagramSocket socketUDP = new DatagramSocket(PUERTO);
            byte[] bufer = new byte[10000];

            while (true) {
                        // Construimos el DatagramPacket para recibir peticiones
                        DatagramPacket peticion = new DatagramPacket(bufer, bufer.length);

                        // Leemos una petición del DatagramSocket
                        socketUDP.receive(peticion);

                        System.out.println("Datagrama recibido del host: " + peticion.getAddress());
                        System.out.println(" Desde el puerto remoto: " + peticion.getPort());
                        System.out.println(" Mensaje del cliente: " + new String(peticion.getData()));

                        String mensaje =  new String(peticion.getData());
                        int numero = Integer.parseInt(mensaje.trim());
                        
                        int es = server.esPrimo(numero);
                        if(es == 2){
                            res = "es primo";
                        }else{
                            res = "es primo";
                        }
                        System.out.println("Convertido a entero "+numero);
//                        String mensajeDev = String.valueOf(pow);
                        byte[] mensaje = res.getBytes();
                        
//                        =====================================================================================
                        // Construimos el DatagramPacket para enviar la respuesta
                        DatagramPacket respuesta = new DatagramPacket(mensaje), mensaje.length, peticion.getAddress(), peticion.getPort());

                        // Enviamos la respuesta, que es un eco
                        socketUDP.send(respuesta);
            }

          } catch (SocketException e) {
                  System.out.println("Socket: " + e.getMessage());
          } catch (IOException e) {
                   System.out.println("IO: " + e.getMessage());
          }
    }
    
}
