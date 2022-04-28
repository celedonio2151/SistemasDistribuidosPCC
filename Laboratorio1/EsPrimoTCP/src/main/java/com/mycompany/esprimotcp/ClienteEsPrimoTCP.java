/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.esprimotcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author cele2154
 */
public class ClienteEsPrimoTCP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int port = 5002;
        Scanner teclado = new Scanner(System.in);
        try {
                        Socket client = new Socket("localhost", port); 
                        PrintStream toServer = new PrintStream(client.getOutputStream());
                        BufferedReader fromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
                        System.out.println("Ingrese un numero para verificar si es primo o no: ");
                        int numero = teclado.nextInt();
//                        toServer.println("SIS-258");
                        toServer.println(numero);
                        String result = fromServer.readLine();  
                        System.out.println("El numero  " + result);

        } catch (IOException e) {
                        System.out.println(e.getMessage());
        }
    }
    
}
