/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.rmi.Naming;

/**
 *
 * @author cele2154
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IRMIPlataformaIntercambio intercambio;
        try {
            intercambio = (IRMIPlataformaIntercambio)Naming.lookup("rmi://localhost/intercambio"); // instanciar un objeto remoto
//            while(salir){
            System.out.println("1:  Opciones");
            System.out.println("=============================================");
            System.out.println("Selecione un numero del menu: ");
            
            Cliente cliente1 = new Cliente(1,"desconocido","Carla","Perez","Aguilar");
            Cliente vendedor1 = new Cliente(2,"desconocido","Maria","Flores","Smith");
            Double monto = 200.50;
            
            String data = intercambio.realizarTransaccion(cliente1, vendedor1, monto);
//            opcion = sc.nextInt();
//                switch(opcion){
//                    case 1: 
//                        System.out.println("suma: "+cuatroOperaciones.sumar(primerNum,segundoNum));
//                        break;
//                    case 2:
//                        System.out.println("resta: "+cuatroOperaciones.restar(primerNum, segundoNum));
//                        break;
//                    default : 
//                        System.out.println("Valor no valido");
//                }
//            }

        } catch (NotBoundException ex) {
            Logger.getLogger(Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
