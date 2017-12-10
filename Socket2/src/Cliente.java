/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;

public class Cliente {

    public static void main(String[] args) throws IOException {
        String Host = "localHost";
        int Puerto = 6000;

        System.out.println("PROGRAMA CLIENTE INICIADO.....");
        Socket Cliente = new Socket(Host, Puerto);
        //CREO EL FLUJO DE SALIDA AL SERVIDOR
        DataOutputStream flujoSalida = new DataOutputStream(Cliente.getOutputStream());
        //ENVIA UN SALUDO AL SERVIDOR
        flujoSalida.writeUTF("Saludo al SERVIDOR desde el CLIENTE");
        //CREO FLUJO DE ENTRADA AL SERVIDOR			
        DataInputStream flujoEntrada = new DataInputStream(Cliente.getInputStream());
        //EL SERVIDOR ME ENVIA UN MENSAJE
        System.out.println("Recibiendo del SERVIDOR:\n\t" + flujoEntrada.readUTF());

        //CERRAR STREAMS Y SOCKETS
        flujoEntrada.close();
        flujoSalida.close();
        Cliente.close();

    }

    private class EnviarTexto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            //ystem.out.println(campo1.getText());
            try {
                String localhost = "192.168.202.12";
                Socket miSocket = new Socket(localhost, 80);
                DataOutputStream flujoSalida = new DataOutputStream(miSocket.getOutputStream());
                flujoSalida.writeUTF(campo1.getText());
                flujoSalida.close();
            } catch (IOException ex) {
                System.out.print(ex.getMessage());
            }
        }

    }
}
