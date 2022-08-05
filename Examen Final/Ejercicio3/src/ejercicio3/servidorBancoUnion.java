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
public class servidorBancoUnion extends UnicastRemoteObject implements IRMIBancos{

    CuentaBanco bancounion1 = new CuentaBanco(1,1,1000.00);
    CuentaBanco bancounion2 = new CuentaBanco(2,2,5000.00);
    
    public servidorBancoUnion() throws RemoteException {
        super();
    }
    
    @Override
    public Bool retirar(CuentaBanco cuenta, double monto) throws RemoteException {
//        Retirar un monto
        if(bancounion1.getCliente_id() == cuenta.cliente_id){
            System.out.println("El usuario tiene cuenta");
            return null;
        }else{
            System.out.println("El usuario no tiene cuenta");
            return null;
        }
//        if(bancounion1.getSaldo() >= monto){
//            System.out.println("");
//            return null;
//        }
        
    }

    @Override
    public Bool abonar(CuentaBanco cuenta, double monto) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
