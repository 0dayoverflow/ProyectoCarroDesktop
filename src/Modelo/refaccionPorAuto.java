
package Modelo;


public class refaccionPorAuto {
        private int id;
    private String  auto_ID_carro;
    private int servicio_id;
    private int refaccion_id;

    public refaccionPorAuto() {
        this.id = 0;
        this.auto_ID_carro = "";
        this.servicio_id = 0;
        this.refaccion_id = 0;
    }

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

    public int getServicio_id() {
        return servicio_id;
    }

    public void setServicio_id(int servicio_id) {
        this.servicio_id = servicio_id;
    }

    public int getRefaccion_id() {
        return refaccion_id;
    }

    public void setRefaccion_id(int refaccion_id) {
        this.refaccion_id = refaccion_id;
    }
}
