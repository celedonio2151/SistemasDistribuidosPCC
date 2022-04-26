
import java.net.DatagramSocket;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cele2154
 */

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ClienteUDP {
    
    // Los argumentos proporcionan el mensaje y el nombre del servidor
  public static void main(String args[]) {
    Scanner teclado = new Scanner (System.in);
    final int PUERTO_SERVER = 6789;
//    byte[] buffer = new byte[1024];
    String ip="localhost";

    try {
        
        System.out.println("Ingrese un numero: ");
        String numero = teclado.next();  
        String dato= String.valueOf(numero);
        
        InetAddress hostServidor = InetAddress.getByName(ip);
        DatagramSocket socketUDP = new DatagramSocket();  // Inicializar
//        buffer = dato.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        byte buffer [] = dato.getBytes();
        
      
        // Construimos un datagrama para enviar el mensaje al servidor
        DatagramPacket peticion = new DatagramPacket(buffer, buffer.length, hostServidor, PUERTO_SERVER);

        // Enviamos el datagrama
        socketUDP.send(peticion);
//    ==========================================================================
        // Construimos el DatagramPacket que contendrá la respuesta
        DatagramPacket respuesta = new DatagramPacket(new byte[buffer.length], buffer.length);
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
