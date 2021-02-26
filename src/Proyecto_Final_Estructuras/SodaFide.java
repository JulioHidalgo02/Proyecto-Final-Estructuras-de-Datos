package Proyecto_Final_Estructuras;

import javax.swing.JOptionPane;

public class SodaFide {

    private DatosCliente sorteo[] = new DatosCliente[5];
    private NodoCola inicio;
    private NodoCola fin;
    private NodoPila cima;
    private NodoLista comienzo;

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

    public void LlenarVector(DatosCliente datos) {
        for (int i = 0; i < sorteo.length; i++) {
            sorteo[i] = datos;
        }
    }

    public void LLenarCola() {
        DatosCliente d = new DatosCliente();
        d.setNombre("Juan");
        d.setCedula("154841585");
        d.setTemperatura(37.5);
        NodoCola nuevo = new NodoCola();
        nuevo.setElemento(d);
        if (esVaciaC()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    public void LLenarPila() {
        RefrescosPila d = new RefrescosPila();
        d.setMarca("Coca Cola");
        d.setTipo("Gaseosa");
        d.setCantidad(600);
        NodoPila nuevo=new NodoPila();
      nuevo.setElemento(d);
      if(esVaciaP()){
         cima=nuevo;
      }else{
         nuevo.setSiguiente(cima);
         cima=nuevo;
      }
    }
    public void LlenarLista(){
        DatosCliente d = new DatosCliente();
        d.setNombre("Juan");
        d.setCedula("11582858");
        d.setTemperatura(38);
        NodoLista nuevo=new NodoLista();
      nuevo.setElemento(d);
      if(esVaciaL()){
         comienzo=nuevo;
      }else if(d.getNombre().compareTo(comienzo.getElemento().getNombre())<0){
         nuevo.setSiguiente(comienzo);
         comienzo=nuevo;
      }else if(comienzo.getSiguiente()==null){
         comienzo.setSiguiente(nuevo);
      }else{
         NodoLista aux=comienzo;
         while((aux.getSiguiente()!=null)
                 &&(aux.getSiguiente().getElemento().
                 getNombre()).compareTo(d.getNombre())<0){
            aux=aux.getSiguiente();
         }
         nuevo.setSiguiente(aux.getSiguiente());
         aux.setSiguiente(nuevo);
      }
    }

}
