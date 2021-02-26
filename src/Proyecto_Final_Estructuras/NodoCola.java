package Proyecto_Final_Estructuras;

public class NodoCola {

    private DatosCliente elemento;
    private NodoCola siguiente;

    public NodoCola() {
        this.siguiente = null;
    }

    public DatosCliente getElemento() {
        return elemento;
    }

    public void setElemento(DatosCliente elemento) {
        this.elemento = elemento;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }

}
