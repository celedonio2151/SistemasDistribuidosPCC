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
public class ServerSegipImplements extends UnicastRemoteObject implements ISegip {

        public ServerSegipImplements() throws RemoteException {
                super();
        }

        @Override
        public Respuesta verificar(int CI, String nombres, String apellidos) throws RemoteException {
                if (CI == 1140506 && nombres.equals("Walter Jhamil") && apellidos.equals("Segovia Arellano")) {
                        return new Respuesta(true, "Los datos son correctos");
                        
                } else {
                        return new Respuesta(true, "Los datos del CI no son corretos");

                }
        }

}
