
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cele2154
 */

public class Estudiante implements Serializable {
    
    String nombre;
    String Apellidos;
    Sexo sexo;
    int edad;
    Carrera carrera;

    public Estudiante(String nombre, String Apellidos, Sexo sexo, int edad, Carrera carrera) {
        this.nombre = nombre;
        this.Apellidos = Apellidos;
        this.sexo = sexo;
        this.edad = edad;
        this.carrera = carrera;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public Carrera getCarrera() {
        return carrera;
    }
    
    

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", Apellidos=" + Apellidos + ", sexo=" + sexo + ", edad=" + edad + ", carrera=" + carrera + '}';
    }
    
    
    
}
