package Modelo;

public class Auto {

    private String ID_carro;
    private String marca;
    private String modelo;

    public Auto() {
        
        this.ID_carro ="";
        this.marca ="";
        this.modelo="";
    }

    public String getID_carro() {
        return ID_carro;
    }

    public void setID_carro(String ID_carro) {
        this.ID_carro = ID_carro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    

}
