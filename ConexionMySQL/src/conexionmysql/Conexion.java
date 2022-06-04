/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Danny
 */
public class Conexion {
   
    String driver = "com.mysql.jdbc.Driver";

    // Nombre de la base de datos
    String database = "databasemovies";

    // Host
    String hostname = "localhost";

    // Puerto
    String port = "3306";

    // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
    String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";

    // Nombre de usuario
    String username = "dani";

    // Clave de usuario
    String password = "1234";

 
    Connection conectarMySQL() {
        Connection conn = null;

        try {
            // Class.forName(driver);
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            
        } catch (ClassNotFoundException | SQLException e) {
                 e.printStackTrace();
        }
    
        return conn;
    }
    
    
   
}
