package com.mycompany.socketenclase1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Carlos
 */
public class ServidorSumaTCP {

    public static void main(String[] args) {
        int port = 5002; 
        
        while (true){   // para que el servidor siga funcionando y no muera
            try {
               ServerSocket server = new ServerSocket(port);// levantar servidor socket
               System.out.println("Se inicio el servidor con éxito");
               
               Socket client;   // Instanciamos un socket cliente
               PrintStream toClient;       
               client = server.accept(); //conexion con el cliente
               BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream())); // el lector
               System.out.println("Cliente se conecto");
               System.out.println(fromClient.readLine()); // Recivimos el primer dato
               
               String cadena = fromClient.readLine();
               System.out.println("Numero desde el cliente "+cadena);
               int sum = sumatoria(Integer.parseInt(cadena));
               
               toClient = new PrintStream(client.getOutputStream()); 
               toClient.println("La suma del numero es: "+sum);
           } catch (IOException e) {
               System.out.println(e.getMessage());
           }   
        }
      
    }
    
//    Suma desde 1 hata el numero que el cliente envio y devuelve toda la suma de la serie
    public static int sumatoria(int n){
        int sumatoria = 0;
        for (int i = 0; i >= n; i++) {
            sumatoria += i;
        }
        return sumatoria;
    }
}
