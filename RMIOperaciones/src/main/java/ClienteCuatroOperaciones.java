
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author cele2154
 */
public class ClienteCuatroOperaciones {

    public static void main(String[] args) {
        ICuatroOperaciones cuatroOperaciones;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el primer numero: ");
        int primerNum = sc.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        int segundoNum = sc.nextInt();
        boolean salir = true;
        int opcion;
        try {
            cuatroOperaciones = (ICuatroOperaciones)Naming.lookup("rmi://localhost/Operaciones"); // instanciar un objeto remoto 
            while(salir){
            System.out.println("1:  Sumar");
            System.out.println("2:  Restar");
            System.out.println("3:  Multiplicar");
            System.out.println("4:  Dividir");
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
                        System.out.println("multi: "+cuatroOperaciones.multiplicar(primerNum, segundoNum));
                        break;
                    case 4:
                        System.out.println("divi: "+cuatroOperaciones.dividir(primerNum, segundoNum));
                        break;
                    case 5:
                        salir = false;
                        break;
                    default : 
                        System.out.println("Valor no valido");
                }
            }

        } catch (NotBoundException ex) {
            Logger.getLogger(ClienteCuatroOperaciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClienteCuatroOperaciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClienteCuatroOperaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
