/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cele2154
 */
public class Fibonacci {
    int n;
        
    public Fibonacci(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public int  getFibonacci(){
        return fibonacci(this.n);
    }
    
    private int fibonacci(int n)
    {
        if (n==0 || n==1){
             return 1;
        }else
             return fibonacci(n-1)+fibonacci(n-2);
    }
    
}