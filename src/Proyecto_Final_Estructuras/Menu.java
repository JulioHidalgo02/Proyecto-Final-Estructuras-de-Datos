package Proyecto_Final_Estructuras;

import javax.swing.JOptionPane;

public class Menu {
 private int opc;

   public void mostrarMenu(){
      opc=Integer.parseInt(JOptionPane.showInputDialog(null,
              "***MENÚ PRINCIPAL***\n\n"
                      + "1.Agregar elemento a la pila\n"
                      + "2.Copiar Pila a Lista\n"
                      + "3.Mostrar Pila\n"
                      + "4.Mostrar Lista\n"
                      + "5.Salir del sistema\n\n"
                      + "Digite su opción:"));
      switch(opc){
          case 1:{
           
            mostrarMenu();
            break;
          }
          case 2:{
           
            mostrarMenu();
            break;
          }
          case 3:{
           
            mostrarMenu();
            break;
          }
          case 4:{
           
            mostrarMenu();
            break;
          }
          case 5:{
            System.exit(0);
            break;
          }
          default:{
            JOptionPane.showMessageDialog(null,
                    "Opción incorrecta!"); 
          }
      }
   }     
}
