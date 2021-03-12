
package Proyecto_Final_Estructuras;

public class Comidas {
    private String comida;
    private String acompañamientos;
    private int numeroDecomida;
    
    public Comidas(){
        this.comida = "";
        this.acompañamientos = "";
        this.numeroDecomida =0;
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
        
}
