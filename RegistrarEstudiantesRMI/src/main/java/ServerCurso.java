
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cele2154
 */
public class ServerCurso extends UnicastRemoteObject implements ICurso{
    String Materia;
    String Docente;
    ArrayList<Estudiante>listaAlumnos;
    
    public ServerCurso(String materia, String docente) throws RemoteException {
        super();
        this.Materia = materia;
       this. listaAlumnos = new ArrayList<Estudiante>();
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }

    public String getDocente() {
        return Docente;
    }

    public void setDocente(String Docente) {
        this.Docente = Docente;
    }
    
    @Override
    public void registrarEstudianes(Estudiante estudiante) {
        this.listaAlumnos.add(estudiante);
    }

    @Override
    public ArrayList<Estudiantes> ListarEstudiantes() {
        return this.listaAlumnos;
    }
    
    
    
}
