/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author cele2154
 */
public class AdministrarLibrosImplement extends UnicastRemoteObject implements ICRUD {

        ArrayList<Libro> libros = new ArrayList();

        int top = 0;

        public AdministrarLibrosImplement() throws RemoteException {
                super();
        }
        
        

        @Override
        public String crear(String titulo, String autor, String editorial, int anio) throws RemoteException {
                top++;
                Libro aux = new Libro(top, titulo, autor, editorial, anio);
                libros.add(aux);
                return "si";
        }

        @Override
        public Libro editar(int idLibro, String titulo, String autor, String editorial, int anio) throws RemoteException {
                if (idLibro > 0 && idLibro <= top) {
                        libros.get(idLibro-1).setTitulo(titulo);
                        libros.get(idLibro-1).setAutor(autor);
                        libros.get(idLibro-1).setEditorial(editorial);
                        libros.get(idLibro-1).setAnio(anio);
                        return libros.get(idLibro);
                }
                return null;
        }

        @Override
        public String eliminar(int idLibro) throws RemoteException {
                if (idLibro > 0 && idLibro <= top) {
                        libros.remove(libros.get(idLibro-1));
                        top--;
                        return "si";
                }
                return "no";
        }

        @Override
        public ArrayList<Libro> mostrar() throws RemoteException {
                return libros;
        }
}
