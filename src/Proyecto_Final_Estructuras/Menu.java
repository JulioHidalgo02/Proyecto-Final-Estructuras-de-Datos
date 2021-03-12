package Proyecto_Final_Estructuras;

import javax.swing.JOptionPane;

public class Menu {

    SodaFide s = new SodaFide();
    private int opc;

    public void mostrarMenu() {
        opc = Integer.parseInt(JOptionPane.showInputDialog(null,
                "                                    ***BIENVENIDO A SODA FIDE***\n"
                + "POR RAZONES DE PANDEMIA SOLO PODEMOS ATENDER A 5 PERSONAS \n"
                + "AGRADECEMOS SU COMPRENSIÓN!\n \n"
                + "1. Menú Administrador\n"
                + "2. Tomar Datos de la persona\n"
                + "3. Ver Menú\n"
                + "4. Pedir cuenta\n"
                + "5. Salir de la aplicación\n\n"
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

                mostrarMenu();
                break;
            }
            case 5: {
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
        if (contraseña == 178239) {
            do {
                opc2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "----MENÚ ADMINISTRADOR---\n\n"
                        + "1. Ingresar Refrescos.\n"
                        + "2. Refrescos disponibles.\n"
                        + "3. Añadir los platillos que se van servir el dia de hoy.\n"  
                        + "4. Generar Reporte. \n"
                        + "5. Mostrar reporte. \n"       
                        + "6. Volver al menú."));

                switch (opc2) {
                    case 1: {
                        s.LLenarPila();
                        break;
                    }
                    case 2: {
                        s.mostrarElementosPila();
                        break;
                    }
                    case 3: {
                        s.LlenarListaDobleEnlazada();
                        break;
                    }
                     case 4: {
                        s.copiarColaALista();
                        break;
                    }
                    case 5: {
                        s.mostrarLista();
                        break;
                    }
                    case 6: {
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
}
