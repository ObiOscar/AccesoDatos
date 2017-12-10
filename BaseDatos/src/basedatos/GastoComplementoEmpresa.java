/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GastoComplementoEmpresa {

    public static void main(String[] args) {
        try {
            //Cargar el driver. Necesitamaos carga el driver de MySQL. 

            Class.forName("org.sqlite.JDBC");
            //Para Sqlite es: "org.sqlite.JDBC"

            // Establecemos la conexion con la BD
            Connection conexion = DriverManager.getConnection("jdbc:sqlite:EmpresaCristian");
            /*jdbc:mysql:indica que estamos utilizando del driver JDBC para MySQL
	localhost:indica que el servidor de la BD está en la misma máquina en la que se ejecuta el
	programa java. Aquí se puede poner una IP o un nombre de máquina que esté en la red
	ejemplo: nombre de la BD a la que nos vamos a conectar 
	ejemplo1: nombre del usuario para acceder a la BD.
	ejemplo2:es la clave de usuario.  
	La conexión para sqlite: (jsbc:sqlite:D:/ejempl.db")*/

 /* Preparamos la consulta. Lo hacemos con la interfaz Statement y para ello llamamos
		al método createStatement de un obejto conexión válido. El obejto obtenido tiene el método executeQuery() que sirve para realizar una consulta a la BD y se le pasa un staring en el que
		está la consulta SQL*/
            Statement sentencia = conexion.createStatement();
            ResultSet resul = sentencia.executeQuery("SELECT SUM(Complemento) FROM datos"); //hacemos el sumatorio del campo Complemento
            /*El resultado nos lo devuelve como un Resulset que es un objeto similar a una lista
		en la que está el resultado de la consulta. Cada elemento de la lista es uno de 
	los registros de la tabla "departamentos". Resulset no contiene todos los datos sino los                        que va consiguiendo de la BD según se van pidiendo.
		Resulset tiene internamente un puntero que apunta al primer registro de la lista.
		Mediante el método next el puntero avanzaal siguiente registro. Para recorrer la lista de registros usamos este método dentro de un bucle while que se ejecuta mientras next() devuelva true, 
		es decir, mientras haya registros*/

            // Recorremos el resultado para visualizar cada fila
            // Se hace un bucle mientras haya registros, se van visualizando
            while (resul.next()) {
                System.out.println("Gasto en complementos de la empresa  : " + resul.getString(1));
            }
            /*Los métodos getInt() y getString() van devolviendo los valores de los campos
		 de dichos registros. Entre paréntesis se pone la posiicón de la columna en la tabla.
		Tambien se puede poner una cadena que indica el nombre de la columna.*/

            //Se liberan todos los recursos y se cierra la conexión
            resul.close();    // Cerrar ResultSet
            sentencia.close();    // Cerrar Statement
            conexion.close();    //Cerrar conexion

        } catch (ClassNotFoundException cn) {
            cn.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }     //fin de main
}      //fin de la clase
