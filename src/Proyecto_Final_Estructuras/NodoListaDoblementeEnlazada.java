
package Proyecto_Final_Estructuras;

public class NodoListaDoblementeEnlazada {
 private Comidas dato;
 private NodoListaDoblementeEnlazada siguiente;
private NodoListaDoblementeEnlazada anterior;

public NodoListaDoblementeEnlazada(){
    this.siguiente = null;
    this.anterior = null;
}

    public Comidas getDato() {
        return dato;
    }

    public void setDato(Comidas dato) {
        this.dato = dato;
    }

    public NodoListaDoblementeEnlazada getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaDoblementeEnlazada siguiente) {
        this.siguiente = siguiente;
    }

    public NodoListaDoblementeEnlazada getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoListaDoblementeEnlazada anterior) {
        this.anterior = anterior;
    }

}
