package Proyecto_Final_Estructuras;

public class NodoListaSC {

    private Trabajadores dato;
    private NodoListaSC siguiente;

    public NodoListaSC() {
        this.siguiente = null;

    }

    public Trabajadores getDato() {
        return dato;
    }

    public void setDato(Trabajadores dato) {
        this.dato = dato;
    }

    public NodoListaSC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaSC siguiente) {
        this.siguiente = siguiente;
    }

}
