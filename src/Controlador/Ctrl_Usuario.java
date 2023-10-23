package Controlador;

/**
 * operaciones de la base de datos
 */
import Conexion.Conexion;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class Ctrl_Usuario {

    public boolean loginUser(Usuario objeto) {
        boolean respuesta = false;
        Conexion conexion = Conexion.getInstance();
        Connection cn = conexion.getConexion();
        Statement st;       
        String sql = "SELECT usuario, contrasena from login WHERE usuario = '"+objeto.getUsuario()+"' and contrasena = '"+objeto.getContrasena()+"'";

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                respuesta = true;
                
                
                
            }//Fin del while que muestra los datos
            

        } catch (SQLException e) {
            System.out.println("Error al iniciar sesoin ");
            JOptionPane.showMessageDialog(null, "Error al hacer login");

        }//Fin del try catch

        return respuesta;
    }//Fin de la funcion de login

}
