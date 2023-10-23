package Modelo;

public class Usuario {
    
    private String usuario;
    private String contrasena;

    //Constructor de la clases
    public Usuario() {
        this.usuario = "";
        this.contrasena = "";
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
}
