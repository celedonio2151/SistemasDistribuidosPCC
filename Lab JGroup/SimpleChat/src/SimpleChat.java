
import org.jgroups.JChannel;
import org.jgroups.Message;
import org.jgroups.ReceiverAdapter;
import org.jgroups.View;
import org.jgroups.util.Util;

import java.io.*;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

public class SimpleChat extends ReceiverAdapter {

    JChannel channel;
    //String user_name=System.getProperty("user.name", "n/a");
    votosMesa[] votacion = new votosMesa[100];

    int numeroMesa;
    int votosJuan;
    int votosMaria;
    int votosPedro;
    String mesa[];
    String juan[];
    String maria[];
    String pedro[];
    int sumM ;
    int sumP ;
    int sumJ ;

    public SimpleChat() {
        sumM = 0;
        sumP = 0;
        sumJ = 0;
    }
    final List<String> state = new LinkedList<>();

    public void viewAccepted(View new_view) {
        System.out.println("** vista: " + new_view);
    }

    public void receive(Message msg) {
        String line = msg.getSrc() + ": " + msg.getObject();
        String[] cadena = line.split(",");  // separar la entreada por la coma (,)
        System.out.println(line); // dato de entrada
        mesa = cadena[0].split(" ");    // Separar lo separado por espacio ( )
        juan = cadena[1].split(" ");// Separar lo separado por espacio ( )
        maria = cadena[2].split(" ");// Separar lo separado por espacio ( )
        pedro = cadena[3].split(" ");// Separar lo separado por espacio ( )
        System.out.println("Mesa"+mesa[3]);
        numeroMesa = Integer.valueOf(mesa[3]) - 1;
        votosJuan = Integer.valueOf(juan[1]);
        votosMaria = Integer.valueOf(maria[1]);
        votosPedro = Integer.valueOf(pedro[1]);

        if (votacion[numeroMesa] == null) {
            votacion[numeroMesa] = new votosMesa(votosMaria, votosJuan, votosPedro);
        }
        // recorremos todo el vectos votacion en busca de votos para sumar
        /*int sumM =0;
         int sumP =0;
         int sumJ =0;*/
        for (votosMesa aux : votacion) {
            System.out.println("Votos: "+aux.getVotosMaria());
            if (aux != null) {
                sumM += aux.getVotosMaria();
                sumP += aux.getVotosPedro();
                sumJ += aux.getVotosJuan();
            }
        }
        System.out.println("Maria; " + sumM + " Pedro: " + sumP + " Juan: " + sumJ);

        synchronized (state) {
            state.add(line);
        }
    }

    public void getState(OutputStream output) throws Exception {
        synchronized (state) {
            Util.objectToStream(state, new DataOutputStream(output));
        }
    }

    @SuppressWarnings("unchecked")
    public void setState(InputStream input) throws Exception {
        /*añade todos los mensaje a la lista */
        List<String> list = (List<String>) Util.objectFromStream(new DataInputStream(input));
        synchronized (state) {
            state.clear();
            state.addAll(list);
        }
        System.out.println("estado recibido (" + list.size() + " mensajes en la historia del chat ):");
        for (String str : list) {
            System.out.println(str);
        }
    }

    private void start() throws Exception {
        channel = new JChannel();
        channel.setReceiver(this);
        //channel.connect("ChatCluster");
        channel.connect("VotacionCluster");
        channel.getState(null, 10000);
        eventLoop();
        channel.close();
    }

    private void eventLoop() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                System.out.print("> ");
                System.out.flush();
                String line = in.readLine().toLowerCase();
                if (line.startsWith("quit") || line.startsWith("exit")) {
                    break;
                }
                line = "[" + "Skyline2154" + "]" + line;
                Message msg = new Message(null, line);
                channel.send(msg);
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] args) throws Exception {
        new SimpleChat().start();
        
    }
}
