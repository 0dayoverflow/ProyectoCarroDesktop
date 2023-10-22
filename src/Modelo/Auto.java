
package Modelo;


public class Auto {
    private int idCarro;
    private String marca;
    private String modeloi;
    private int idCliente;

    public Auto(int idCarro, String marca, String modeloi, int idCliente) {
        this.idCarro = idCarro;
        this.marca = marca;
        this.modeloi = modeloi;
        this.idCliente = idCliente;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModeloi() {
        return modeloi;
    }

    public void setModeloi(String modeloi) {
        this.modeloi = modeloi;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    
}
