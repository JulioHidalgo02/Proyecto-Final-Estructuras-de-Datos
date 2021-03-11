package Proyecto_Final_Estructuras;

public class RefrescosPila {

    private String Marca;
    private String Tipo;
    private String cantidad;

    public RefrescosPila() {
        this.Marca = "";
        this.Tipo = "";
        this.cantidad ="";
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

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

}
