package com.mycompany.socketenclase1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class ClienteSumaTCP {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int port = 5002;
        int numero;
        try {
            Socket client = new Socket("localhost", port); // se conecta al server socket
            PrintStream toServer = new PrintStream(client.getOutputStream());
            BufferedReader fromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            
            toServer.println("SIS-258"); // imprimimos en el servidor el dato
            String result = fromServer.readLine();  // Leemos desde el servidor el dato
            System.out.println("cadena devuelta es: " + result);
            
//            System.out.print("Introduce un numero: ");
//            numero = teclado.nextInt();
//            
//            toServer.println(numero);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
