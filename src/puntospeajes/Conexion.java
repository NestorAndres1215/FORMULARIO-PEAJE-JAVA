package puntospeajes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    String user = "root";
    String pasww = "12345";
    Connection cx;

    public Connection conectar() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdpeajes", user, pasww);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error de conexion" + ex.getMessage());
        }
        return cx;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Conexion objC = new Conexion();
        if (objC.conectar() != null) {
            System.out.println("Se conectó a peajes");
        }
    }

}
