
import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author cele2154
 */
public interface ICuatroOperaciones extends Remote {
    public int sumar(int a, int b) throws RemoteException;
    public int restar(int a, int b) throws RemoteException;
    public int multiplicar(int a, int b) throws RemoteException;
    public int dividir(int a, int b) throws RemoteException;
    
}
