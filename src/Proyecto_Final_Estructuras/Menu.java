package Proyecto_Final_Estructuras;

import javax.swing.JOptionPane;

public class Menu {

    SodaFide s = new SodaFide();
    private int opc;

    public void mostrarMenu() {
        opc = Integer.parseInt(JOptionPane.showInputDialog(null,
                "                                    ***BIENVENIDO A SODA FIDE***\n"
                + "POR RAZONES DE PANDEMIA SOLO PODEMOS ATENDER A 3 PERSONAS \n"
                + "AGRADECEMOS SU COMPRENSIÓN!\n \n"
                + "1. Menú Administrador\n"
                + "2. Tomar Datos de la persona\n"
                + "3. Ver Menú\n"
                + "4. Pedir Comida\n"
                + "5. Realizar Sorteo \n"         
                + "6. Salir de la aplicación\n\n"
                + "Digite su opción:"));
        switch (opc) {
            case 1: {

                MenuAdministrador(0);
                mostrarMenu();
                break;
            }
            case 2: {
                s.LLenarCola();
                mostrarMenu();
                break;
            }
            case 3: {
                s.mostarElementosListaDoblementeEnlazada();
                mostrarMenu();
                break;
            }
            case 4: {
                PedirComida();
                mostrarMenu();
                break;
            }
            case 5: {
                s.Sorteo();
                mostrarMenu();
                break;
            }
            case 6: {
                System.exit(0);
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null,
                        "Opción incorrecta!");
            }
        }
    }

    public void MenuAdministrador(int b) {
        int contraseña = Integer.parseInt(JOptionPane.showInputDialog("Digite la contraseña:"));
        int opc2 = 0;
        int b1 = b;
        if (contraseña == 123) {
            do {
                opc2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "----MENÚ ADMINISTRADOR---\n\n"
                        + "1. Ingresar horarios de trabajadores.\n" 
                        + "2. Ver los horarios de los trabajadores.\n"         
                        + "3. Ingresar Refrescos.\n"
                        + "4. Refrescos disponibles.\n"
                        + "5. Añadir los platillos que se van servir el dia de hoy.\n"  
                        + "6. Generar Reporte. \n"
                        + "7. Mostrar reporte. \n"       
                        + "8. Volver al menú."));

                switch (opc2) {
                    case 1: {
                        s.LlenarLSC();
                        break;
                    }
                     case 2: {
                        s.mostrarElementosLSC();
                        break;
                    }
                    case 3: {
                        s.LLenarPila();
                        break;
                    }
                    case 4: {
                        s.mostrarElementosPila();
                        break;
                    }
                    case 5: {
                        s.LlenarListaDobleEnlazada();
                        break;
                    }
                     case 6: {
                        s.copiarColaALista();
                        break;
                    }
                    case 7: {
                        s.mostrarLista();
                        break;
                    }
                    case 8: {
                        mostrarMenu();
                    }
                    default: {
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta!");
                    }
                }
            } while (opc2 != 6);
        } else {
            b1 = b1 + 1;
            if (b1 == 3) {
                 JOptionPane.showMessageDialog(null, "Excedió los intentos disponibles, volviendo al menu de usuario");
               mostrarMenu(); 
  
            }
              JOptionPane.showMessageDialog(null, "Contraseña incorrecta! Digitela de nuevo");
                MenuAdministrador(b1); 
           
            

        }

    }
    public void PedirComida(){
        String mensajeFinal;
        String comida = JOptionPane.showInputDialog("Digite lo que desea comer");
        s.desapilar(comida);
    }
}
