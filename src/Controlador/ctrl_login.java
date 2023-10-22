package Controlador;

import Modelo.Login;
import Modelo.Conexion;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class ctrl_login {

    public boolean loginUser(Login objeto) {

        boolean respuesta = false;

        Conexion cn = Conexion.getInstance();

        String sql = "select * from loign";
        Statement st;

        try  {
            st = cn.getConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                respuesta = true;
            
            }

        } catch (SQLException e) {
            System.out.println("Error al iniciar sesion");
            
        }
        return respuesta;

    }

}
