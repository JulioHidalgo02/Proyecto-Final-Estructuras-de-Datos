
package Proyecto_Final_Estructuras;

public class Comidas {
    private String comida;
    private String acompañamientos;
    private int numeroDecomida;
    private double precio;
    
    public Comidas(){
        this.comida = "";
        this.acompañamientos = "";
        this.numeroDecomida =0;
        this.precio = 0.00;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getAcompañamientos() {
        return acompañamientos;
    }

    public void setAcompañamientos(String acompañamientos) {
        this.acompañamientos = acompañamientos;
    }

    public int getNumeroDecomida() {
        return numeroDecomida;
    }

    public void setNumeroDecomida(int numeroDecomida) {
        this.numeroDecomida = numeroDecomida;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
        
}
