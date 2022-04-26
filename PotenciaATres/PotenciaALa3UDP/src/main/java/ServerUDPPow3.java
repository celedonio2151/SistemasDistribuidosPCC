
import java.io.IOException;
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
                System.out.println("Recivi la informacion del cliente");
//                El mensaje recivido
                String mensaje = new String(peticion.getData());
                System.out.println(mensaje); 

                System.out.print("Datagrama recibido del host: " + peticion.getAddress());
                System.out.println(" Por el puerto remoto: " + peticion.getPort());
                InetAddress direccion = peticion.getAddress();
                
                mensaje = "Hola mundo desde el servisor";
//                String str = new String(peticion.getData(), java.nio.charset.StandardCharsets.UTF_8); 
//        System.out.println("Tipo de dato: " + str.getClass().getSimpleName());
//                int number = Integer.parseInt(str);
//                System.out.println("esto es covertido "+str);
//        System.out.println(("Tipo de dato: "+(Object)number).getClass().getSimpleName());
//                int powtencia3 = number*number*number;
//                mensaje = peticion.getData();
//                mensaje = String.valueOf(powtencia3);
                byte[] enviarData = mensaje.getBytes();
//        ======================================================================
                // Construimos el DatagramPacket para enviar la respuesta
                DatagramPacket respuesta = new DatagramPacket(enviarData, enviarData.length, direccion, peticion.getPort());

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
