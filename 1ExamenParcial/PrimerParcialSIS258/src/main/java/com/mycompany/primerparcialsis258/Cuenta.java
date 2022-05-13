/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerparcialsis258;

import java.io.Serializable;

/**
 *
 * @author cele2154
 */
public class Cuenta implements Serializable{
        Banco banco;
        String nrocuenta;
        String ci;
        String nombres;
        String apellidos;
        double saldo;

        public Cuenta(Banco banco, String nrocuenta, String ci, String nombres, String apellidos, double saldo) {
                this.banco = banco;
                this.nrocuenta = nrocuenta;
                this.ci = ci;
                this.nombres = nombres;
                this.apellidos = apellidos;
                this.saldo = saldo;
        }

        public Banco getBanco() {
                return banco;
        }

        public void setBanco(Banco banco) {
                this.banco = banco;
        }

        public String getNrocuenta() {
                return nrocuenta;
        }

        public void setNrocuenta(String nrocuenta) {
                this.nrocuenta = nrocuenta;
        }

        public String getCi() {
                return ci;
        }

        public void setCi(String ci) {
                this.ci = ci;
        }

        public String getApellidos() {
                return apellidos;
        }

        public void setApellidos(String apellidos) {
                this.apellidos = apellidos;
        }

        public double getSaldo() {
                return saldo;
        }

        public void setSaldo(double saldo) {
                this.saldo = saldo;
        }

        public String getNombres() {
                return nombres;
        }

        public void setNombres(String nombres) {
                this.nombres = nombres;
        }

        @Override
        public String toString() {
                return "Cuenta{" + "banco=" + banco + ", nrocuenta=" + nrocuenta + ", ci=" + ci + ", nombres=" + nombres + ", apellidos=" + apellidos + ", saldo=" + saldo + '}';
        }
        
        
        
}
