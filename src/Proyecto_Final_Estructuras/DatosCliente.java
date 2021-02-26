package Proyecto_Final_Estructuras;

public class DatosCliente {
  private String nombre;
  private String cedula;
private double temperatura;

public DatosCliente(){
    this.nombre = "";
    this.cedula = "";
    this.temperatura = 0.00;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

}
