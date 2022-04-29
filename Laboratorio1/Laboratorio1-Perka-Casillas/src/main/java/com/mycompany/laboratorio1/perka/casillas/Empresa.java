/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio1.perka.casillas;

/**
 *
 * @author cele2154
 */
public class Empresa {

    String nombre;
    long NIT;

    public Empresa(String nombre, long NIT) {
        this.nombre = nombre;
        this.NIT = NIT;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNIT() {
        return NIT;
    }

    public void setNIT(long NIT) {
        this.NIT = NIT;
    }

}
