/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio1.perka.casillas;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author cele2154
 */
public class ServidorCessa extends UnicastRemoteObject implements ICessa {
    ArrayList<Factura> FacturasCessa = new ArrayList();
    @Override
    public Factura pendientes(int idCliente) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String pagar(Factura[] fact) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
