/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerparcialsis258;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cele2154
 */
public class servidorRMI_ASFI extends UnicastRemoteObject implements IRMI_ASFI {

        ArrayList<Cuenta> cuentas = new ArrayList();        
        String buscar;
        String congelar;
        
        public servidorRMI_ASFI() throws RemoteException {
                super();
        }

        @Override
        public ArrayList<Cuenta> ConsultarCuentas(String ci, String nombres, String apellidos) throws RemoteException {
                buscar = ci+"-"+nombres+"-"+apellidos;             //  Preaparamos la cadena congelar
                return cuentas;
        }

        @Override
        public boolean RetenerMonto(String cuenta, double monto, String glosa) throws RemoteException {
                congelar = cuenta+"-"+monto;             //  Preaparamos la cadena congelar
                clienteMercantilTCP(congelar);
                
                return true;
        }

        //      ====================================================================================
        public String clienteMercantilTCP(String congelar) {
                int port = 5000;
                Scanner teclado = new Scanner(System.in);
                try {
                        Socket client = new Socket("localhost", port);
                        PrintStream toServer = new PrintStream(client.getOutputStream());
                        BufferedReader fromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
                        String buscar = cuentas.get(2).ci+"-"+cuentas.get(2).nombres+"-"+cuentas.get(2).apellidos;      // Preaparamos buscar
                        toServer.println(buscar);
                        String result = fromServer.readLine();  // leemos el resultado devuelto
                        System.out.println("Dato del Server TCP Mercantil: " + result);
                        String resEcontrado;
                        if(result.equals("")){
                                resEcontrado = "No-no encontrado";
                        }else{
                                resEcontrado = "SI-1212";
                        }
                        return result;  // devolvemos la respuesta

                } catch (IOException e) {
                        System.out.println(e.getMessage());
                }
                return null;
        }
        
        
}
