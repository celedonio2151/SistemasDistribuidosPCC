
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author cele2154
 */
public interface ICurso extends Remote{
    public void registrarEstudianes(Estudiante estudiante) throws RemoteException;
    public ArrayList<Estudiante> listarEstudiantes() throws RemoteException;
    
}
