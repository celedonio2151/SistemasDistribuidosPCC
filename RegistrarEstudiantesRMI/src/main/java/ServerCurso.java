
import java.rmi.RemoteException;
import java.rmi.server.RemoteRef;
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
        private String materia;
        private String docente;
       private  ArrayList<Estudiante> ListaEstudiantes;

        public ServerCurso(String materia, String docente) throws RemoteException{
                super();
                this.materia = materia;
                this.docente = docente;
                this.ListaEstudiantes = new ArrayList<Estudiante>();
        }

        public String getMateria() {
                return materia;
        }

        public void setMateria(String materia) {
                this.materia = materia;
        }

        public String getDocente() {
                return docente;
        }

        public void setDocente(String docente) {
                this.docente = docente;
        }

        public ArrayList<Estudiante> getListaEstudiantes() {
                return ListaEstudiantes;
        }

        public void setListaEstudiantes(ArrayList<Estudiante> ListaEstudiantes) {
                this.ListaEstudiantes = ListaEstudiantes;
        }
        
        @Override
        public void registrarEstudianes(Estudiante estudiante) throws RemoteException {
                ListaEstudiantes.add(estudiante);
        }

        @Override
        public ArrayList<Estudiante> listarEstudiantes() throws RemoteException {
                return ListaEstudiantes;
        }
}
