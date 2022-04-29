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
public class ServidorCotes extends UnicastRemoteObject implements ICotes {
    ArrayList<Factura> FacturasCotes = new ArrayList();
    @Override
    public ArrayList<Factura> pendientes(int idCliente) throws RemoteException {
        this.FacturasCotes.add("");
        return this.FacturasCotes;
    }

    @Override
    public String pagar(Factura[] fact) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
