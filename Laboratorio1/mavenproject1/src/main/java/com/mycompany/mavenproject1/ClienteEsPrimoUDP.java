/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 *
 * @author cele2154
 */
public class ClienteEsPrimoUDP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            int PUERTO_SERVER = 5000;
            System.out.println("Ingrese un numero: ");
            String dato = teclado.next();
            String ip="localhost";
            try {
                        DatagramSocket socketUDP = new DatagramSocket();
                        byte[] mensaje = dato.getBytes();
                        InetAddress hostServidor = InetAddress.getByName(ip);

                        // Construimos un datagrama para enviar el mensaje al servidor
                        DatagramPacket peticion = new DatagramPacket(mensaje, dato.length(), hostServidor,PUERTO_SERVER);

                        // Enviamos el datagrama
                        socketUDP.send(peticion);
//==============================================================================================
                        // Construimos el DatagramPacket que contendrá la respuesta
                        byte[] bufer = new byte[1000];
                        DatagramPacket respuesta = new DatagramPacket(bufer, bufer.length);
                        socketUDP.receive(respuesta);

                        // Enviamos la respuesta del servidor a la salida estandar
                        System.out.println("Respuesta: " + new String(respuesta.getData()));

          // Cerramos el socket
          socketUDP.close();

        } catch (SocketException e) {
                        System.out.println("Socket: " + e.getMessage());
        } catch (IOException e) {
                        System.out.println("IO: " + e.getMessage());
          }
      }
    
}
