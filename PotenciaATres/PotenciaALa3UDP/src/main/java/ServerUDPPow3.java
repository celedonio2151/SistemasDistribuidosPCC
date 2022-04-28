
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
        byte[] buffer = new byte[10000]; 
        try {
            System.out.println("Iniciamos el servidor UDP");
            DatagramSocket socketUDP = new DatagramSocket(PUERTO); // Iniciar

            while (true) {
                        // Construimos el DatagramPacket para recibir peticiones
                        DatagramPacket peticion = new DatagramPacket(buffer, buffer.length);
                        // Leemos una petición del DatagramSocket
                        socketUDP.receive(peticion);

                        System.out.println("Datagrama recibido del host: " + peticion.getAddress());
                        System.out.println(" Por el puerto remoto: " + peticion.getPort());
                        InetAddress direccion = peticion.getAddress();
                        System.out.print("Recivi la informacion del cliente: ");
        //                El mensaje recivido
                        String mensaje = new String(peticion.getData());
                        System.out.println(mensaje);
                        
                        byte[] bytes = mensaje.getBytes();
    
                        System.out.println("result1: " + new BigInteger(bytes).intValue());

//                    int pow = Integer.parseInt(mensaje);
//                    System.out.println("Numero convertido: "+pow);
//                     int pow = 456;
                        String p = mensaje;
    //                mensaje = String.valueOf(powtencia3);
                byte[] enviarData = p.getBytes();
//        ======================================================================
                // Construimos el DatagramPacket para enviar la respuesta
                DatagramPacket respuesta = new DatagramPacket(p.getBytes(), enviarData.length, direccion, peticion.getPort());

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
