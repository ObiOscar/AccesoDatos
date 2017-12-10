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
public class NombreYSueldoMAyorMenor {	
	public static void main(String[] args) {
	  try
	  {
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
		   //creamos dos consultas, una para el maximo y otra para el minimo
		   ResultSet resul = sentencia.executeQuery ("SELECT Nombre,Salario FROM datos WHERE Salario = ( SELECT MAX( Salario )  FROM datos) "); //consulta para sacar el maximo de los campos haciendo una subconsulta
		   Statement sentencia2 = conexion.createStatement();
		   ResultSet resul2 = sentencia2.executeQuery ("SELECT Nombre,Salario FROM datos WHERE Salario = ( SELECT MIN( Salario )  FROM datos) "); //consulta para sacar el minimo de los campos haciendo una subconsulta
		/*El resultado nos lo devuelve como un Resulset que es un objeto similar a una lista
		en la que está el resultado de la consulta. Cada elemento de la lista es uno de 
	los registros de la tabla "departamentos". Resulset no contiene todos los datos sino los                        que va consiguiendo de la BD según se van pidiendo.
		Resulset tiene internamente un puntero que apunta al primer registro de la lista.
		Mediante el método next el puntero avanzaal siguiente registro. Para recorrer la lista de registros usamos este método dentro de un bucle while que se ejecuta mientras next() devuelva true, 
		es decir, mientras haya registros*/    
		  
		 // Recorremos el resultado para visualizar cada fila
		  // Se hace un bucle mientras haya registros, se van visualizando
		   while (resul.next()) // para mostrar el maximo
		   {
		     System.out.println ( "Nombre empleado mejor pagado : " + resul.getString(1)+ " " +  "/" + " " +  "Salario : " + 
		    		 resul.getString(2));
		   }
		   while (resul2.next())//para mostra el minimo
		   {
		     System.out.println ("Nombre empleado peor pagado: " + resul2.getString(1)+ " " + "/" + " " + "Salario : " +
		    		 resul2.getString(2));
		   }
		 /*Los métodos getInt() y getString() van devolviendo los valores de los campos
		 de dichos registros. Entre paréntesis se pone la posiicón de la columna en la tabla.
		Tambien se puede poner una cadena que indica el nombre de la columna.*/
		   
		
		//Se liberan todos los recursos y se cierra la conexión
		resul.close();    // Cerrar ResultSet
		sentencia.close();    // Cerrar Statement
		resul2.close();    // Cerrar ResultSet
		sentencia2.close(); 
  		 conexion.close();    //Cerrar conexion
  	   
	  } 
   catch (ClassNotFoundException cn) {cn.printStackTrace();} 
   catch (SQLException e) {e.printStackTrace();} 
 
}     //fin de main
}      //fin de la clase
