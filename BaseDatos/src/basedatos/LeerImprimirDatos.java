/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos;

/**
 *
 * @author oski_
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class LeerImprimirDatos {

    public static void main(String[] args) {
        //aqui se va a explicar la conexion de mi programa
        try {
            //Cargar el driver. Necesitamaos carga el driver de MySQL. 

            Class.forName("org.sqlite.JDBC");
            //Para Sqlite es: "org.sqlite.JDBC"

            // Establecemos la conexion con la BD
            Connection conexion = DriverManager.getConnection("jdbc:sqlite:EmpresaCristian.db");
            /*jdbc:mysql:indica que estamos utilizando del driver JDBC para MySQL
             */
            //Establecemos la conexion con la base de datos nuestra 

            //preparamos la consulta a hacer para realizarla con Statement y llamamamos al metodo createStatement, el método executeQuery()  sirve para realizar una consulta a la BD y se le pasa un staring en el que	está la consulta SQL*/
            Statement sentencia = conexion.createStatement();
            ResultSet resul = sentencia.executeQuery("SELECT * FROM datos");
            // Resulset que es un objeto similar a una lista	en la que está el resultado de la consulta. Cada elemento de la lista es uno de 			los registros de la tabla "departamentos". Resulset no contiene todos los datos sino los                        que va consiguiendo de la BD según se van pidiendo.				Resulset tiene internamente un puntero que apunta al primer registro de la lista.

            // Recorremos el resultado para visualizar cada fila


            while (resul.next())//se eejcutaa ientras haya mas datos
            {//devolvemos los campos con los get de los valores y entre parentesisi le especificamo la posicion
                System.out.println(resul.getInt(1) + " " + resul.getString(2)+ " " + 
		    		 resul.getString(3) + " " + resul.getString(4) + " " + resul.getString(5));
		   }
		
		   
		
		//Se liberan todos los recursos y se cierra la conexión
		resul.close();    // Cerrar ResultSet
		sentencia.close();    // Cerrar Statement
  		 conexion.close();    //Cerrar conexion
  	   
	  } 
   catch (ClassNotFoundException cn) {cn.printStackTrace();} 
   catch (SQLException e) {e.printStackTrace();} 
 
}     //fin de main
}      //fin de la clase
