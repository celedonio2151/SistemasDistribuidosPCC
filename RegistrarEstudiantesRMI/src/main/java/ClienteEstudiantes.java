
import java.rmi.Naming;
import java.util.Scanner;

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
        String opcion;
        boolean salir = true;
        try{
            while(salir){
                curso = (ICurso)Naming.lookup("rmi://localhost/Operaciones"); // instanciar un objeto remoto 
                System.out.println("1:  Registrar Estudiante");
                System.out.println("2:  Listar Estudiantes");
                System.out.println("5:  Salir");
                System.out.println("=============================================");
                System.out.println("Selecione un numero del menu: ");
                opcion = sc.nextInt();
                    switch(opcion){
                        case 1: 
                            System.out.println("suma: "+cuatroOperaciones.sumar(primerNum,segundoNum));
                            break;
                        case 2:
                            System.out.println("resta: "+cuatroOperaciones.restar(primerNum, segundoNum));
                            break;
                        case 3:
                            salir = false;
                            break;
                        default : 
                            System.out.println("Valor no valido");
                    }
                }
            }
        }catch{
//            
        }
    }
    
}
