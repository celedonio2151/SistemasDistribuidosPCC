/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ejercicio2;

import java.rmi.Remote;
import java.util.ArrayList;

/**
 *
 * @author cele2154
 */
public interface ICRUD extends Remote {

        public String  crear( String titulo, String autor, String editorial, int anio) throws java.rmi.RemoteException;
        public Libro editar(int idLibro, String titulo, String autor, String editorial, int anio) throws java.rmi.RemoteException;
        public String eliminar(int idLibro) throws java.rmi.RemoteException;
        public ArrayList<Libro> mostrar()  throws java.rmi.RemoteException;

}
