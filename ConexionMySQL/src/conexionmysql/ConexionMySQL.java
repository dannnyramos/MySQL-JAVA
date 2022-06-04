package conexionmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {
    
    
    public static void main(String[] args) {
        
        Conexion conexion = new Conexion();
        conexion.conectarMySQL();
        
    }
}