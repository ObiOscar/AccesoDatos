import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;

public class Servidor implements Runnable  {

    public static void main(String[] args) throws IOException  {
        int numeroPuerto = 6000;
        String cad = "";
        ServerSocket servidor = new ServerSocket(numeroPuerto);
        Socket clienteConectado = null;
        System.out.println("Esperando al cliente....");
        clienteConectado = servidor.accept();

        //CREO EL FLUJO DE ENTRADA DEL CLIENTE
        PrintWriter fsalida = new PrintWriter(clienteConectado.getOutputStream(),true);
        
        BufferedReader fentrada = new BufferedReader(new InputStreamReader(clienteConectado.getInputStream()));
        
        while ((cad = fentrada.readLine()) != null){
        fsalida.println(cad);
        System.out.println("Recibiendo del Cliente: \n\t" + cad);
        if(cad.equals("*")) break;
        }
        InputStream entrada = null;
        entrada = clienteConectado.getInputStream();
        DataInputStream flujoEntrada = new DataInputStream(entrada);

        //EL CLIENTE ME ENVIA EL MENSAJE
        

        //CREO FLUJO DE SALIDA AL CLIENTE
        OutputStream salida = null;
        salida = clienteConectado.getOutputStream();
        DataOutputStream flujoSalida = new DataOutputStream(salida);

        //ENVIO UN SALUDO AL CLIENTE
        flujoSalida.writeUTF("Saludos al cliente del servidor");
        
        

        //CERRAR STREAMS Y SOCKETS
        entrada.close();
        flujoEntrada.close();
        salida.close();
        flujoSalida.close();
        clienteConectado.close();
        servidor.close();

    }

    @Override
    public void run() {
        try {
            ServerSocket servidor = new ServerSocket(80);
            while (true) {
                Socket miSocket = servidor.accept();
                DataInputStream flujo = new DataInputStream(miSocket.getInputStream());
                String mensaje = flujo.readUTF();
                areatexto.append("\n" + mensaje);
                miSocket.close();
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con el servidor", "Error", JOptionPane.WARNING_MESSAGE);

        }
    }
}
