/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author cele2154
 */
import java.util.Scanner;

public class InvertirCadena {

    /**
     * @param args the command line arguments
     */
    public void invertir(String cadena) {
        System.out.println(" La cadena invertida " + cadena);
//        Un vector vacio para cargar los caracteres en orden inverso
        StringBuilder cadenaInvertida = new StringBuilder();
//        Con chartAt se accede a los caracteres de la cadena
        for (int i = (cadena.length() - 1); i >= 0; i--) {
            cadenaInvertida.append(cadena.charAt(i));
        }
        System.out.println("La nueva cadena invertida es: "+cadenaInvertida);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        InvertirCadena invertir = new InvertirCadena();
        String cadena;
        System.out.println("Ingrese la cadena a invertir: ");
        cadena = teclado.next();
        invertir.invertir(cadena);

    }

}
