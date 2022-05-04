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
        int port = 5002;
        Scanner teclado = new Scanner(System.in);
        try {
                        Socket client = new Socket("localhost", port); 
                        PrintStream toServer = new PrintStream(client.getOutputStream());
                        BufferedReader fromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
                        System.out.println("Ingrese un numero para verificar si es primo o no: ");
                        int numero = teclado.nextInt();
                        toServer.println(numero);
//                        =====================================================================================
                        String result = fromServer.readLine();  
                        System.out.println("El numero  " + result);

        } catch (IOException e) {
                        System.out.println(e.getMessage());
        }
    }
}
