/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ejercicio1rmi;

import java.rmi.Remote;

/**
 *
 * @author cele2154
 */
public interface IAccionesRMI extends Remote {

        public int sumatoria(int limite) throws java.rmi.RemoteException;

        public String invertirCadena(String cadena) throws java.rmi.RemoteException;

        public int factorial(int numero) throws java.rmi.RemoteException;
}
