
import java.io.IOException;
import java.math.BigInteger;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author cele2154
 */
public class ServerUDPPow3 {
    
    public static String recuperar(String cad, int tam){
        String res = "";
        for (int i = 0; i < tam; i++) {
            res += cad.charAt(i);
            
        }
        return res;
    }

    public static void main(String args[]) {
        final int PUERTO = 6789;
        try {
            System.out.println("Iniciamos el servidor UDP");
            DatagramSocket socketUDP = new DatagramSocket(PUERTO); // Iniciar
            byte[] buffer = new byte[10000]; 

            while (true) {
                        // Construimos el DatagramPacket para recibir peticiones
                        DatagramPacket peticion = new DatagramPacket(buffer, buffer.length);
                        // Leemos una petición del DatagramSocket
                        socketUDP.receive(peticion);

                        System.out.println("Datagrama recibido del host: " + peticion.getAddress());
                        System.out.println(" Por el puerto remoto: " + peticion.getPort());
                        InetAddress direccion = peticion.getAddress();
                        System.out.print("Recivi la informacion del cliente: " + new String(peticion.getData()));
        //                El mensaje recivido
                        String mensaje = new String(peticion.getData());
                        int numeroPow = Integer.parseInt(mensaje.trim());
                        System.out.println(numeroPow);
                        int pow3 = numeroPow*numeroPow*numeroPow;
                        String pow = "La potencia 3 de: "+ numeroPow + " es: " + String.valueOf(pow3);
//        ======================================================================
                        // Construimos el DatagramPacket para enviar la respuesta
                        byte[] enviarData = pow.getBytes();
                        // Construimos el DatagramPacket para enviar la respuesta
                        DatagramPacket respuesta = new DatagramPacket(pow.getBytes(), enviarData.length, direccion, peticion.getPort());

                        // Enviamos la respuesta, que es un eco
                        socketUDP.send(respuesta);
            }

        } catch (SocketException e) {
            System.out.println("Socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        }
    }
}
