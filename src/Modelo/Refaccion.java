package Modelo;

public class Refaccion {
    private int id_refaccion;
    private String nombre;
    private String descripcion;

    public Refaccion() {
        this.id_refaccion = 0;
        this.nombre = "";
        this.descripcion = "";
    }

    public int getId_refaccion() {
        return id_refaccion;
    }

    public void setId_refaccion(int id_refaccion) {
        this.id_refaccion = id_refaccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
