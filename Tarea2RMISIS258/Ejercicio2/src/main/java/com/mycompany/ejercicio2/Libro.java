/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

import java.io.Serializable;

/**
 *
 * @author cele2154
 */
public class Libro implements Serializable {
        private int id;
        private String titulo;
        private String autor;
        private String editorial;
        private int anio;

        public Libro(int id, String titulo, String autor, String editorial, int anio) {
                this.id = id;
                this.titulo = titulo;
                this.autor = autor;
                this.editorial = editorial;
                this.anio = anio;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getTitulo() {
                return titulo;
        }

        public void setTitulo(String titulo) {
                this.titulo = titulo;
        }

        public String getAutor() {
                return autor;
        }

        public void setAutor(String autor) {
                this.autor = autor;
        }

        public String getEditorial() {
                return editorial;
        }

        public void setEditorial(String editorial) {
                this.editorial = editorial;
        }

        public int getAnio() {
                return anio;
        }

        public void setAnio(int anio) {
                this.anio = anio;
        }

        @Override
        public String toString() {
                return "Libro{" + "id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", anio=" + anio + '}';
        }
        
        
        
}
