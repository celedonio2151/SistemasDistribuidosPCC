/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio1.perka.casillas;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author cele2154
 */
public class ServidorBanco extends UnicastRemoteObject implements IBanco{
    ServidorCessa serverCessa = new ServidorCessa();
    @Override
    public Factura[] calcular(int idCliente) throws RemoteException {
        
    }

    @Override
    public String pagar(Factura[] fact) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
