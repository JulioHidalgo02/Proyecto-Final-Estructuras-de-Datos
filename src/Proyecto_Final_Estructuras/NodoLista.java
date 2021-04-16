package Proyecto_Final_Estructuras;

public class NodoLista {

    private DatosCliente elemento;
    private NodoLista siguiente;

    public NodoLista() {
        this.siguiente = null;
    }

    public DatosCliente getElemento() {
        return elemento;
    }

    public void setElemento(DatosCliente elemento) {
        this.elemento = elemento;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }

}
