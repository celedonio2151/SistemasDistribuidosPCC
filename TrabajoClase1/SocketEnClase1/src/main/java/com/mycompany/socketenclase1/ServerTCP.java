/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.socketenclase1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cele2154
 */
public class ServerTCP {
     public static void main(String[] args) {
         ServerTCP server = new ServerTCP();

        ServerSocket servidor = null;
        Socket sc = null;
        DataInputStream in;
        DataOutputStream out;
//         int sumatoria = 20;

        //puerto de nuestro servidor
        final int PUERTO = 5000;

        try {
            //Creamos el socket del servidor
            servidor = new ServerSocket(PUERTO);
            System.out.println("Servidor iniciado");

            //Siempre estara escuchando peticiones
            while (true) {

                //Espero a que un cliente se conecte
                sc = servidor.accept();

                System.out.println("Cliente conectado");
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());

                //Leo el mensaje que me envia
                String mensaje = in.readUTF();

                System.out.println("Mensaje del cliente: "+mensaje);
                System.out.println("Valor de la serie: "+server.sumaSerie(5));
                //Le envio un mensaje
//                out.writeUTF("¡Hola mundo desde el servidor!");
                
                out.writeUTF("La suma de la series "+mensaje+" es: "+server.sumaSerie(5));

                //Cierro el socket
                sc.close();
                System.out.println("Cliente desconectado");

            }

        } catch (IOException ex) {
            Logger.getLogger(ServerTCP.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     
     public int sumaSerie(int numero){
        int suma = 0;
        for (int i = 0; i >= 5; i++) {
                    suma = suma + i;
        }
        return suma;
    }
     
}
