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
    //    Suma desde 1 hata el numero que el cliente envio y devuelve toda la suma de la serie
    public int sumatoria(int n){    // 5+4+3+2+1 = 15
        int sumatoria = 0;
        for (int i = 1; i <= n; i++) {
            sumatoria +=i;
            System.out.println(" " + sumatoria);
        }
        return sumatoria;
    }

    public static void main(String[] args) {
         int port = 5002; 
            ServidorSumaTCP serverSuma = new ServidorSumaTCP();
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
                                    int numeroSumar = Integer.valueOf(numero);  // convierte el del cliente en Entero
                                    int es = serverSuma.sumatoria(numeroSumar);    // Devuelve numero de divisores
                                    mensajeDevolver = es + " sumatoria";
                                    System.out.println("Mensaje del cliente: " + numeroSumar +" sumatoria = " + es);
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
