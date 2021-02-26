package Proyecto_Final_Estructuras;

public class RefrescosPila {

    private String Marca;
    private String Tipo;
    private int cantidad;

    public RefrescosPila() {
        this.Marca = "";
        this.Tipo = "";
        this.cantidad = 0;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
