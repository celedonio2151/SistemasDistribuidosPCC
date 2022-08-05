/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.rmi.Remote;

/**
 *
 * @author cele2154
 */
public interface IRMIPlataformaIntercambio extends Remote{
    public String realizarTransaccion(Cliente cliente, Cliente vendedor, double monto)throws java.rmi.RemoteException;
}
