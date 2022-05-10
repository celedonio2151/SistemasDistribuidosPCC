/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ejercicioparcial;

import java.rmi.Remote;

/**
 *
 * @author cele2154
 */
public interface IUniversidad extends Remote{
        public Diploma emitirDiploma(int CI, String nombre, String primerApellido, String segundoApellido, String fechaDeNacimiento,String carrera) throws java.rmi.RemoteException;        
}
