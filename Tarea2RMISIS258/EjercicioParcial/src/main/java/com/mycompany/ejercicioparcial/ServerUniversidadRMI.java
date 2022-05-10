/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioparcial;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author cele2154
 */
public class ServerUniversidadRMI extends UnicastRemoteObject implements IUniversidad {

        public ServerUniversidadRMI() throws RemoteException {
                super();
        }
        
        

        @Override
        public Diploma emitirDiploma(int CI, String nombre, String primerApellido, String segundoApellido, String fechaDeNacimiento, String carrera) {
                return null;
//                llamar a metodos
        }
        
}
