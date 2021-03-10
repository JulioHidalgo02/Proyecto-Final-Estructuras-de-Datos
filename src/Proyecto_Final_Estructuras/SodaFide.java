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
        d.setMarca(JOptionPane.showInputDialog(null, "Digite la marca del refresco:"));
        d.setTipo(JOptionPane.showInputDialog(null, "Digite el tipo de refresco, ya sea gaseoso o natural:"));
        d.setCantidad(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el tamaño de la bebida, ya sea 500ml, 1L o 3L:")));
        NodoPila nuevo = new NodoPila();
        nuevo.setElemento(d);
        if (esVaciaP()) {
            cima = nuevo;
        } else {
            nuevo.setSiguiente(cima);
            cima = nuevo;
        }
    }

    public void LlenarLista() {
        DatosCliente d = new DatosCliente();
        d.setNombre(JOptionPane.showInputDialog(null, "Digite su nombre completo:"));
        d.setCedula(JOptionPane.showInputDialog(null, "Digite su número de cédula:"));
        d.setTemperatura(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite la temperatura indicada:")));
        
    //Agregué el texto del JOptionPane
        
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

}
