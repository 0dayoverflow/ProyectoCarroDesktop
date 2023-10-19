package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Conexion instance;
    private Connection con;

    private String base = "autos";
    private String user = "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost:3306/" + base;

    private Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            System.out.print("Conexion Exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.print("Error al conectar la base de datos");
            System.out.print(e.getCause());
            System.out.print(e.getMessage());
        }
    }

    public static Conexion getInstance() {
        if (instance == null) {
            synchronized (Conexion.class) {
                if (instance == null) {
                    instance = new Conexion();
                }
            }
        }
        return instance;
    }

    public Connection getConexion() {
        return con;
    }
}
//Test