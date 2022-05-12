/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioparcial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.SocketException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cele2154
 */
public class ServerUniversidadRMI extends UnicastRemoteObject implements IUniversidad {
        String mensaje;
        public ServerUniversidadRMI() throws RemoteException {
                super();
        }

        @Override
        public Diploma emitirDiploma(int CI, String nombre, String primerApellido, String segundoApellido, String fechaDeNacimiento, String carrera) throws RemoteException {

                try {
                        ISegip segipCli;
                        segipCli = (ISegip) Naming.lookup("rmi://localhost/VerificarSegip");
                        Respuesta res = segipCli.verificar(CI, nombre, primerApellido + " " + segundoApellido); // para el cliente
                        System.out.println(res);
//                        String verificarRude = "WaSeAr11-02-1996";
                        String nom = String.valueOf(nombre.charAt(0))+String.valueOf(nombre.charAt(1));
                        String apel1 = String.valueOf(primerApellido.charAt(0))+String.valueOf(primerApellido.charAt(1));
                        String apel2 = String.valueOf(segundoApellido.charAt(0))+String.valueOf(segundoApellido.charAt(1));
                        String verificarRude = nom+apel1+apel2+fechaDeNacimiento;
//                        System.out.println(verificarRude);
                        String respuestaTCP = clienteSeducaTCP(verificarRude);  // para el cliente
                        String respuestaUDP = clienteSereciUDP(nombre+" "+primerApellido+" "+segundoApellido+" "+fechaDeNacimiento);
//                        System.out.println("TCP : "+respuestaTCP+"    :   UDP : "+respuestaUDP);
                        mensaje = respuestaTCP+" "+respuestaUDP+" "+res;
                        System.out.println("For Cliente: "+mensaje);
                        
                        return new Diploma(nombre+" "+primerApellido+" "+segundoApellido,carrera,fechaDeNacimiento,mensaje);

                } catch (NotBoundException | MalformedURLException ex) {
                        Logger.getLogger(ServerUniversidadRMI.class.getName()).log(Level.SEVERE, null, ex);
                }

                return null;
        }
        
//      ====================================================================================
        public String clienteSeducaTCP(String verificar_rude) {
                int port = 5000;
                Scanner teclado = new Scanner(System.in);
                try {
                        Socket client = new Socket("localhost", port);
                        PrintStream toServer = new PrintStream(client.getOutputStream());
                        BufferedReader fromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));

                        toServer.println(verificar_rude);
                        String result = fromServer.readLine();  // leemos el resultado devuelto
                        System.out.println("Dato del Server TCP Seduca: " + result);
                        return result;  // devolvemos la respuesta

                } catch (IOException e) {
                        System.out.println(e.getMessage());
                }
                return null;
        }
        
//      ====================================================================================
        public String clienteSereciUDP(String verFecha) {
                int PUERTO_SERVER = 5002;
                String ip = "localhost";
                try {
                        DatagramSocket socketUDP = new DatagramSocket();
                        byte[] mensaje = verFecha.getBytes();
                        InetAddress hostServidor = InetAddress.getByName(ip);

                        // Construimos un datagrama para enviar el mensaje al servidor
                        DatagramPacket peticion = new DatagramPacket(mensaje, verFecha.length(), hostServidor, PUERTO_SERVER);

                        // Enviamos el datagrama
                        socketUDP.send(peticion);
//==============================================================================================
                        // Construimos el DatagramPacket que contendrá la respuesta
                        byte[] bufer = new byte[1000];
                        DatagramPacket respuesta = new DatagramPacket(bufer, bufer.length);
                        socketUDP.receive(respuesta);

                        // Enviamos la respuesta del servidor a la salida estandar
                        System.out.println("Respuesta: " + new String(respuesta.getData()));
                        
                        String res = new String(respuesta.getData()); // Respuesta para el envio

                        // Cerramos el socket
                        socketUDP.close();
                        return res;

                } catch (SocketException e) {
                        System.out.println("Socket: " + e.getMessage());
                } catch (IOException e) {
                        System.out.println("IO: " + e.getMessage());
                }
                return null;
        }

}
