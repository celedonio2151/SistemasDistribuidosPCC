
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cele2154
 */
public class ServerCuatroOperaciones extends UnicastRemoteObject implements ICuatroOperaciones {
    
    public ServerCuatroOperaciones() throws RemoteException {
        super();
    }

    @Override
    public int sumar(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int restar(int a, int b) throws RemoteException {
        return a - b;
    }

    @Override
    public int multiplicar(int a, int b) throws RemoteException {
        return a * b;
    }

    @Override
    public int dividir(int a, int b) throws RemoteException {
        return a/b;
    }
    
}
