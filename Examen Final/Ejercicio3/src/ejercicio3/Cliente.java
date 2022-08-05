/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author cele2154
 */
public class Cliente {
    int nrodocumento;
    String complemento;
    String nombres;
    String primerapellido;
    String segundoapellido;

    public Cliente(int nrodocumento, String complemento, String nombres, String primerapellido, String segundoapellido) {
        this.nrodocumento = nrodocumento;
        this.complemento = complemento;
        this.nombres = nombres;
        this.primerapellido = primerapellido;
        this.segundoapellido = segundoapellido;
    }

    public int getNrodocumento() {
        return nrodocumento;
    }

    public void setNrodocumento(int nrodocumento) {
        this.nrodocumento = nrodocumento;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPrimerapellido() {
        return primerapellido;
    }

    public void setPrimerapellido(String primerapellido) {
        this.primerapellido = primerapellido;
    }

    public String getSegundoapellido() {
        return segundoapellido;
    }

    public void setSegundoapellido(String segundoapellido) {
        this.segundoapellido = segundoapellido;
    }
    
    
}
