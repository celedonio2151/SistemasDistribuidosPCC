/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.primerparcialsis258;

import java.rmi.Remote;
import java.util.ArrayList;

/**
 *
 * @author cele2154
 */
public interface IRMI_ASFI extends Remote {
        
        public ArrayList<Cuenta> ConsultarCuentas(String ci, String nombres, String apellidos) throws java.rmi.RemoteException;  
        public Boolean RetenerMonto(String cuenta, double monto, String glosa) throws java.rmi.RemoteException;  
}
