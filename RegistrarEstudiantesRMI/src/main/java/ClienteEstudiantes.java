
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author cele2154
 */
public class ClienteEstudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ICurso curso;
        String nombre, apellidos;
        int opcion, edad;
        Sexo sexo = null;
        Carrera carrera;
        Estudiante estudiante;
        boolean salir = true;
        try{
            ServerCurso listaCurso = new ServerCurso("SIS-258", "Ing. Montellano");
            while(salir){
                curso = (ICurso)Naming.lookup("rmi://localhost/Curso"); // instanciar un objeto remoto 
                System.out.println("1:  Registrar Estudiante");
                System.out.println("2:  Listar Estudiantes");
                System.out.println("3:  Salir");
                System.out.println("=============================================");
                System.out.println("Selecione un numero del menu: ");
                opcion = sc.nextInt();
                    switch(opcion){
                        case 1:
                                System.out.println("Ingrese el nombre del alumno: ");    
                                nombre = sc.next();
                                System.out.println("Ingrese el apellido del alumno: ");    
                                apellidos = sc.next();
                                System.out.println("Ingrese el sexo del alumno:         1: Masxulino            2: Femenino ");
                        switch (sc.nextInt()) {
                                case 1:
                                        sexo = Sexo.Masculino;
                                        break;
                                case 2:
                                        sexo = Sexo.Femenino;
                                        break;
                                default:
                                        System.out.println("Numero no valido...");
                                        break;
                        }
                                System.out.println("Ingrese la edad del alumno: ");    
                                edad = sc.nextInt();
                                System.out.println("Carreras: \n 1.- Sistemas \n 2.- Computacion \n 3.- Seeguridad TI");
                                switch (sc.nextInt()) {
                                    case 1:
                                        carrera = Carrera.Sistemas;
                                        break;
                                    case 2:
                                        carrera = Carrera.Computacion;
                                        break;
                                    case 3:
                                        carrera = Carrera.Seguridad_TI;
                                        break;
                                    default:
                                        throw new AssertionError();
                                }
                                estudiante = new Estudiante(nombre,apellidos,sexo,edad,carrera);
                                curso.registrarEstudianes(estudiante);
                            break;
                        case 2:
                            System.out.println("Lista de estudiantes: ");
                            
                            break;
                        case 3:
                            salir = false;
                            break;
                        default : 
                            System.out.println("Valor no valido");
                    } // switch
                } // while
            
            }catch (NotBoundException ex) {
                Logger.getLogger(ClienteEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                } catch (MalformedURLException ex) {
                    Logger.getLogger(ClienteEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                } catch (RemoteException ex) {
                    Logger.getLogger(ClienteEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                }    
        }
    
}
