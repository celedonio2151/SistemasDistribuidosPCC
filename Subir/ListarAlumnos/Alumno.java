/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cele2154
 */
public class Alumno {
    private String nombre;
    private String apellidos;
    private String CU;
    Carrera carrera;

    public Alumno(String nombre, String apellidos, String CU, Carrera carrera) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.CU = CU;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCU() {
        return CU;
    }

    public void setCU(String CU) {
        this.CU = CU;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    
    
}
