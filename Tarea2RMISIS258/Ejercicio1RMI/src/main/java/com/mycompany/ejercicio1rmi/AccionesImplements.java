/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author cele2154
 */
public class AccionesImplements extends UnicastRemoteObject implements IAccionesRMI {
//        El contructor que implementa una interfaz en miuy imortante  
        public AccionesImplements() throws RemoteException {
                super();
        }

        @Override
        public int sumatoria(int limite) throws RemoteException {
                int sumatoria = 0;
                for (int i = 0; i <= limite; i++) {
                        sumatoria += i;
                }
                return sumatoria;
        }

        @Override
        public String invertirCadena(String cadena) throws RemoteException {
                String cad = "";
                int contadorReversa = cadena.length();

                for (int i = 0; i < cadena.length(); i++) {
                        contadorReversa--;
                        cad += String.valueOf(cadena.charAt(contadorReversa));
                }
                return cad;
        }

        @Override
        public int factorial(int numero) throws RemoteException {
                if (numero == 1 || numero == 0) {
                        return 1;
                } else {
                        return numero * factorial(numero - 1);
                }
        }
}
