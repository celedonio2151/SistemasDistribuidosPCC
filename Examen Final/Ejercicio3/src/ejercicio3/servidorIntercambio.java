/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cele2154
 */
public class servidorIntercambio extends UnicastRemoteObject implements IRMIPlataformaIntercambio{

    servidorBNB bbnb;
    servidorBancoUnion bunion;
//    Cuentas de clientes registradas
    Cliente cliente1 = new Cliente(1,"desconocido","Carla","Perez","Aguilar");
    Cliente vendedor1 = new Cliente(2,"desconocido","Maria","Flores","Smith");
//    Cuentas de bancos registrados
    Cuenta cuenta1 = new Cuenta(Banco.BNB,1,cliente1); // BNB
    Cuenta cuenta2 = new Cuenta(Banco.BancoUnion,2,vendedor1); // Union
    
    
    public servidorIntercambio() throws RemoteException {
        super();
    }
    
    @Override
    public String realizarTransaccion(Cliente cliente, Cliente vendedor, double monto) throws RemoteException {
        try {
//            ------------------------------------------------------------------
            bbnb = (servidorBNB)(IRMIBancos)Naming.lookup("rmi://localhost/bnb"); // instanciar un objeto remoto
            bunion = (servidorBancoUnion)(IRMIBancos)Naming.lookup("rmi://localhost/union"); // instanciar un objeto remoto
            cuenta1 = new Cuenta(Banco.BNB,1,cliente);
            if(cliente. == cuenta1.getBanco()){
                
            }
         } catch (RemoteException ex) {
            Logger.getLogger(HostPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(HostPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(servidorIntercambio.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
}
