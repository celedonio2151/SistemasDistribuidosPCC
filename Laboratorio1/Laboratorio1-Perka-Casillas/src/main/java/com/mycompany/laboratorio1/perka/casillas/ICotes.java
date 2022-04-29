/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.laboratorio1.perka.casillas;

import java.rmi.RemoteException;

/**
 *
 * @author cele2154
 */
public interface ICotes {

    public Factura pendientes(int idCliente) throws RemoteException;

    public String pagar(Factura[] fact) throws RemoteException;
}
