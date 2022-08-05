/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import com.sun.org.apache.xpath.internal.operations.Bool;
import java.rmi.Remote;
/**
 *
 * @author cele2154
 */
public interface IRMIBancos extends Remote{

    public Bool retirar(CuentaBanco cuenta, double monto) throws java.rmi.RemoteException;
    public Bool abonar(CuentaBanco cuenta, double monto) throws java.rmi.RemoteException;
}
