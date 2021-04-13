package Proyecto_Final_Estructuras;

import javax.swing.JOptionPane;

public class SodaFide {
    private int b=0;
    private DatosCliente sorteo[] = new DatosCliente[5];
    private NodoCola inicio;
    private NodoCola fin;
    private NodoPila cima;
    private NodoLista comienzo;
    private NodoListaDoblementeEnlazada cabeza;
    private NodoListaDoblementeEnlazada ultimo;
    
    public SodaFide(){
        this.inicio = null;
        this.fin = null;
        this.cima = null;
        this.comienzo = null;
        this.cabeza = null;
        this.ultimo = null;
    }

    private boolean esVaciaC() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    private boolean esVaciaP() {
        if (cima == null) {
            return true;
        } else {
            return false;
        }
    }

    private boolean esVaciaL() {
        if (comienzo == null) {
            return true;
        } else {
            return false;
        }
    }
    private boolean esVaciaListaDoblementeEnlazada(){
       if (cabeza == null) {
            return true;
        } else {
            return false;
        } 
    }
     public static int randomWithRange(int min, int max) {
     int range = (max - min) + 1;
     return (int) (Math.random() * range) + min;
}

    public void LlenarVector(DatosCliente datos) {
        for (int i = 0; i < sorteo.length; i++) {
            sorteo[i] = datos;
        }
    }

    public void LLenarCola() {
        
        if(b<=2){
        DatosCliente d = new DatosCliente();
        d.setNombre(JOptionPane.showInputDialog(null, "Digite su nombre completo:"));
        d.setCedula(JOptionPane.showInputDialog(null, "Digite su número de cédula:"));
        int temperatura = randomWithRange(33, 39); 
        JOptionPane.showMessageDialog(null, "Su temperatura es: " + temperatura);
        if( temperatura >= 37){
            JOptionPane.showMessageDialog(null, "Tiene la temperatura mayor a 37, no puede entrar");
            Menu m = new Menu();
            m.mostrarMenu();
        }else{
            JOptionPane.showMessageDialog(null, "Bienvenido, pase adelante");
            b++;
        }
        
        d.setTemperatura(temperatura);
        NodoCola nuevo = new NodoCola();
        nuevo.setElemento(d);
        
        if (esVaciaC()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
        }else{
            JOptionPane.showMessageDialog(null, "En este momento estamos en la capacidad maxima de la soda, por lo tanto no te podemos atender");
        }
        
    }

    public void LLenarPila() {
        for (int x = 0; x < 3; x++) {
            
        RefrescosPila d = new RefrescosPila();
        d.setMarca(JOptionPane.showInputDialog(null, "Digite la marca del refresco:"));
        d.setTipo(JOptionPane.showInputDialog(null, "Digite el tipo de refresco, ya sea gaseoso o natural:"));
        d.setCantidad(JOptionPane.showInputDialog(null, "Digite el tamaño de la bebida, ya sea 500ml, 1L o 3L:"));
        NodoPila nuevo = new NodoPila();
        nuevo.setElemento(d);
        if (esVaciaP()) {
            cima = nuevo;
        } else {
            nuevo.setSiguiente(cima);
            cima = nuevo;
        }
        }
}
public void desapilar(String comida){
    String mensajeFinal = "";
    
    if(!esVaciaP()){   
    mensajeFinal = comida + "\n Refresco:  " + cima.getElemento().getMarca() + " " + cima.getElemento().getTipo() + " " + cima.getElemento().getCantidad();
        JOptionPane.showMessageDialog(null, "Pronto le traeremos su comida:\n Detalle: " + mensajeFinal);
        cima = cima.getSiguiente();
    }else{
        JOptionPane.showMessageDialog(null, "No se puede mostrar, ya que la pila esta vacia");
        
    }
}
        

    public void LlenarLista(DatosCliente d) {
        
        NodoLista nuevo = new NodoLista();
        nuevo.setElemento(d);
        if (esVaciaL()) {
            comienzo = nuevo;
        } else if (d.getNombre().compareTo(comienzo.getElemento().getNombre()) < 0) {
            nuevo.setSiguiente(comienzo);
            comienzo = nuevo;
        } else if (comienzo.getSiguiente() == null) {
            comienzo.setSiguiente(nuevo);
        } else {
            NodoLista aux = comienzo;
            while ((aux.getSiguiente() != null)
                    && (aux.getSiguiente().getElemento().
                            getNombre()).compareTo(d.getNombre()) < 0) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }
    }
    
    public void LlenarListaDobleEnlazada(){
        for(int x = 0; x < 3; x++){
        Comidas c = new Comidas();
        c.setComida(JOptionPane.showInputDialog(null, "Digite el nombre de la comida"));
        c.setAcompañamientos(JOptionPane.showInputDialog(null, "Digite los acompañamientos que tiene la comida"));
        c.setNumeroDecomida(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero de comida")));
        c.setPrecio(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el precio de la comida")));
        NodoListaDoblementeEnlazada nuevo = new NodoListaDoblementeEnlazada();
        nuevo.setDato(c);
        if(esVaciaListaDoblementeEnlazada()){
            cabeza = nuevo;
            ultimo = nuevo;
            ultimo.setSiguiente(cabeza);
            cabeza.setAnterior(ultimo);
        }else if(c.getNumeroDecomida()<cabeza.getDato().getNumeroDecomida()){
            nuevo.setSiguiente(cabeza);
            cabeza = nuevo;
            ultimo.setSiguiente(cabeza);
            cabeza.setAnterior(ultimo);
        }else if(c.getNumeroDecomida()>=ultimo.getDato().getNumeroDecomida()){
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
            ultimo.setSiguiente(cabeza);
            cabeza.setAnterior(ultimo);
        }else{
            NodoListaDoblementeEnlazada aux = cabeza;
            while(aux.getSiguiente().getDato().getNumeroDecomida()<c.getNumeroDecomida()){
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
            nuevo.getSiguiente().setAnterior(nuevo);
        }
        }
    }
    
    public void copiarColaALista() {
        if (!esVaciaC()) {
            NodoCola aux = inicio;
            while (aux != null) {
                LlenarLista(aux.getElemento());
                aux = aux.getSiguiente();
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "No se puede copiar, cola vacía!");
        }
    }
    public void copiarColaAVector(){
        if(!esVaciaC()){
            NodoCola aux = inicio;
            while(aux != null){
                LlenarVector(aux.getElemento());
                aux = aux.getSiguiente();
            }
        }
    }
    
    
    public void mostrarElementosPila(){
    if(!esVaciaP()){
       String s = "";
       NodoPila aux = cima;
       while(aux!=null){
        s = s +"Refresco Marca: " + aux.getElemento().getMarca() + "-- Tipo: " + aux.getElemento().getTipo() + " -- Cantidad: " + aux.getElemento().getCantidad() + "\n ";
        aux = aux.getSiguiente();
    }
       JOptionPane.showMessageDialog(null, "Los Refrescos Disponibles son: \n " + s);
    }else{
        JOptionPane.showMessageDialog(null, "No hay Refrescos Disponibles");
    }
    

}
    public void mostarElementosListaDoblementeEnlazada(){
         String s="";
       if(!esVaciaListaDoblementeEnlazada()){
          NodoListaDoblementeEnlazada aux=cabeza;
          s=s+"# " + aux.getDato().getNumeroDecomida() + "Comida: " + aux.getDato().getComida() + "  Acompañamientos: " + aux.getDato().getAcompañamientos() +" Precio: ₡" + aux.getDato().getPrecio() + " <==> ";
          aux=aux.getSiguiente();
          while(aux!=cabeza){
          s=s+"# " + aux.getDato().getNumeroDecomida() + "Comida: " + aux.getDato().getComida() + "  Acompañamientos: " + aux.getDato().getAcompañamientos() + " Precio: ₡" + aux.getDato().getPrecio() + " <==> ";
             aux=aux.getSiguiente();
          }
          JOptionPane.showMessageDialog(null,
                  "El menu que tenemos a su disposición es el Siguiente:\n"+s);
       }else{
          JOptionPane.showMessageDialog(null,
                  "No se puede mostrar, lista vacía!");
       }
    }
    public void mostrarLista(){
        if (!esVaciaL()) {
            String s = "";
            NodoLista aux = comienzo;
            while (aux != null) {
                s = s + "[" + aux.getElemento().getNombre()+ " " + aux.getElemento().getCedula()+ " "
                        + aux.getElemento().getTemperatura()+"]<--";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null,
                    "La lista contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No se puede mostrar elementos, lista vacía!");

        }
    }
    public void Sorteo(){
        copiarColaAVector();
        JOptionPane.showMessageDialog(null, "A continuación se procederá a dar el ganador del sorteo");
        JOptionPane.showMessageDialog(null, "El ganador es: " + sorteo[randomWithRange(0, 2)].getNombre() +"!!!\nFelicidades gano, un almuero para dos personas");
    }
}
