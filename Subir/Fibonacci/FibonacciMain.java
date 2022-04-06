/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author cele2154
 */
import java.util.Scanner;

public class FibonacciMain {

    public static void main(String[] ar) {
        Scanner teclado = new Scanner(System.in);
        int numeroLimite;
        System.out.println("======================================================== ");
        System.out.println("Ingrese el numero de calcular el fibonacci: ");
        numeroLimite = teclado.nextInt();
        Fibonacci fibo = new Fibonacci(numeroLimite);
        System.out.print("La ultima serie de numero "+fibo.getFibonacci());
    }
}