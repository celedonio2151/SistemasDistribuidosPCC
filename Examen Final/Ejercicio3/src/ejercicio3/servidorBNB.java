/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import com.sun.org.apache.xpath.internal.operations.Bool;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author cele2154
 */
public class servidorBNB extends UnicastRemoteObject implements IRMIBancos{
    
    CuentaBanco bancobnb1 = new CuentaBanco(1,1,500.00);
    CuentaBanco bancobnb2 = new CuentaBanco(2,2,100.00);

    public servidorBNB() throws RemoteException {
        super();
    }
    
    @Override
    public Bool retirar(CuentaBanco cuenta, double monto) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Bool abonar(CuentaBanco cuenta, double monto) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
