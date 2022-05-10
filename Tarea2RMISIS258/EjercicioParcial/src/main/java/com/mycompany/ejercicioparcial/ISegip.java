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
public interface ISegip extends Remote{
        public Respuesta verificar(int CI, String nombres, String apellidos) throws java.rmi.RemoteException;
}
