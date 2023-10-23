package Modelo;

public class ServicioPorAuto {
    private int id;
    private String auto_ID_carro;
    private String estatus;
    private int cliente_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuto_ID_carro() {
        return auto_ID_carro;
    }

    public void setAuto_ID_carro(String auto_ID_carro) {
        this.auto_ID_carro = auto_ID_carro;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    
}
