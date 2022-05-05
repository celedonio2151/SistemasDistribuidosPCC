/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cele2154
 */
public class Tablero {
    String [][] tablero;
    int bandera;
    
    public Tablero(){
        tablero = new String[3][3];
        bandera = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = "-";
            }
        }
    }

    public String[][] getTablero() {
        return tablero;
    }

    public boolean setTablero(int i, int j, String valor) {
        if(this.tablero[i][j] == "-"){
            this.tablero[i][j] = valor;   
        }else{
            System.out.println("La posicion ya esta ocupado");
            return true;
        }
        return false;
    }
    
    public int verificarTablero(){
//        Primera fila
        if(this.tablero[0][0].equals(this.tablero[0][1]) && this.tablero[0][0].equals(tablero[0][2]) && this.tablero[0][0] != "-" ){
            return 1;
        }
//        Segunda fila
        if(this.tablero[1][0].equals(this.tablero[1][1]) && this.tablero[1][0].equals(tablero[1][2]) && this.tablero[1][0] != "-" ){
            return 1;
        }
//        Tercera fila
        if(this.tablero[2][0].equals(this.tablero[2][1]) && this.tablero[2][0].equals(tablero[2][2]) && this.tablero[2][0] != "-" ){
            return 1;
        }
//        Columna 1
        if(this.tablero[0][0].equals(this.tablero[1][0]) && this.tablero[0][0].equals(tablero[2][0]) && this.tablero[0][0] != "-" ){
            return 1;
        }
//        Columna 2
        if(this.tablero[0][1].equals(this.tablero[1][1]) && this.tablero[0][1].equals(tablero[2][1]) && this.tablero[0][1] != "-" ){
            return 1;
        }
//        Columna 3
        if(this.tablero[0][2].equals(this.tablero[1][2]) && this.tablero[0][2].equals(tablero[2][2]) && this.tablero[0][2] != "-" ){
            return 1;
        }
//        Diagonal derecha
        if(this.tablero[0][0].equals(this.tablero[1][1]) && this.tablero[0][0].equals(tablero[2][2]) && this.tablero[0][0] != "-" ){
            return 1;
        }
//        Diagonal izquierda
        if(this.tablero[0][2].equals(this.tablero[1][1]) && this.tablero[0][2].equals(tablero[2][0]) && this.tablero[0][2] != "-" ){
            return 1;
        }
        return 0;
    }
}
