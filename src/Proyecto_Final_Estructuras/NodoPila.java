package Proyecto_Final_Estructuras;

public class NodoPila {
    
    private NodoPila siguiente;
    private RefrescosPila elemento;
    public NodoPila(){
        this.siguiente = null;
    }  

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }

    public RefrescosPila getElemento() {
        return elemento;
    }

    public void setElemento(RefrescosPila elemento) {
        this.elemento = elemento;
    }

}
