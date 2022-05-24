/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.primerparcialsis258;

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
public class BancoMercantilTCP {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
                int port = 5000;
                BancoMercantilTCP mercantil = new BancoMercantilTCP();
                String mensajeDevolver = "";

                try {
                        while (true) {
                                ServerSocket server = new ServerSocket(port);
                                System.out.println("Se inicio el servidor TCP Banco Mercantil con éxito");
                                Socket client;
                                PrintStream toClient;
                                client = server.accept(); //conexion
                                BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream())); // el lector
                                System.out.println("Cliente se conecto");
                                String numero = fromClient.readLine();
                                String buscar = String.valueOf(numero);  // convierte el del cliente en Entero   
                                System.out.println("Dato del cliente: " + buscar);
                                String[] separar = buscar.split("-");          //  Separa la cadena a buscar

                                Cuenta cuenta = new Cuenta(Banco.Banco_Mercntil, "23254", "11021654", "Juan Perez", "Segovia", 500);
                                if (separar[0].equals("Buscar")) {
                                        String[] datos = separar[1].split("-");
                                        mensajeDevolver = BuscarCliente(datos[0], datos[1], datos[2]);

                                }
                                if (separar[0].equals("Congelar")) {
                                        String[] datos = separar[1].split("-");
                                        mensajeDevolver = CongelarCliente(datos[0], Double.valueOf(datos[1]));

                                }

                                if (separar[0].equals("11021654") && separar[1].equals("Juan Perez") && separar[2].equals("Segovia")) {
                                        mensajeDevolver = cuenta.getNrocuenta() + "-" + cuenta.getSaldo();
                                }
//                                    ========================================================================
                                toClient = new PrintStream(client.getOutputStream());
                                toClient.println(mensajeDevolver);
                                System.out.println("Cliente se desconecto");
                        }
                } catch (IOException e) {
                        System.out.println(e.getMessage());
                }
        }
        
        public static String BuscarCliente(String ci, String nombres, String apellidos) {
        if (ci.equals("11021654") && nombres.equals("Juan Perez") && apellidos.equals("Segovia")) {
            return "23254-5000";
        } else {
            return "";
        }

    }

    private static String CongelarCliente(String cuenta, Double monto) {
      if (cuenta.equals("23254"))
      {
          return "SI-"+cuenta;
      }
      else
          return "NO-No Encontrado";
    }

}
