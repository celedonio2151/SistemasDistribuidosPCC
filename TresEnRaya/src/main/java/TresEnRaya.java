
import java.util.Random;
import java.util.Scanner;

public class TresEnRaya {

    Random random = new Random();
    int bandera;
    String q;
    Scanner teclado = new Scanner(System.in);
    Tablero tablero;
    String XO;
    int valor;
    boolean salida;

    public TresEnRaya() {
        tablero = new Tablero();
        bandera = random.nextInt((2 + 1) - 1); // Generamos numero aleatorio para empezar
        System.out.println("Bandera: " + bandera);
        XO = "O";
        salida = true;
    }

    public void cargarTablero() {
        mostrar();
        while (salida) {
            System.out.println("Ingrese un numero de 1 a 9 ");
            if (bandera == 0) {
                valor = jugador1();
                XO = "O";
                bandera = 1;
            } else {
                valor = jugador2();
                bandera = 0;
                XO = "X";
            }
            if (valor == 1) {
                tablero.setTablero(0, 0, XO);
            }
            if (valor == 2) {
                tablero.setTablero(0, 1, XO);
            }
            if (valor == 3) {
                tablero.setTablero(0, 2, XO);
            }
            if (valor == 4) {
                tablero.setTablero(1, 0, XO);
            }
            if (valor == 5) {
                tablero.setTablero(1, 1, XO);
            }
            if (valor == 6) {
                tablero.setTablero(1, 2, XO);
            }
            if (valor == 7) {
                tablero.setTablero(2, 0, XO);
            }
            if (valor == 8) {
                tablero.setTablero(2, 1, XO);
            }
            if (valor == 9) {
                tablero.setTablero(2, 2, XO);
            }
            mostrar();
            int ganador = tablero.verificarTablero();
            if (ganador == 1) {
                salida = false;
                System.out.println("Gano!!!");
            }
        }
    }

    public int jugador1() {
        System.out.println("Jugador 1:  O");
        int valor = teclado.nextInt();
        return valor;
    }

    public int jugador2() {
        System.out.println("Jugador 2:  X");
        int valor = teclado.nextInt();
        return valor;
    }

    public void mostrar() {
        System.out.println("");
        String[][] tablero3 = tablero.getTablero();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero3[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        TresEnRaya tres = new TresEnRaya();
        tres.cargarTablero();
    }

}
