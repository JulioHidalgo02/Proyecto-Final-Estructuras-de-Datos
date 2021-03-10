package Proyecto_Final_Estructuras;

import javax.swing.JOptionPane;

public class Menu {
    SodaFide s = new SodaFide();
    private int opc;

    public void mostrarMenu() {
        opc = Integer.parseInt(JOptionPane.showInputDialog(null,
                "***BIENVENIDO A SODA FIDE***\n\n"
                + "1. Menú Administrador\n"
                + "2. Ingresar Datos\n"
                + "3. Ver Menú\n"
                + "4. Pedir cuenta\n"
                + "5. Salir de la aplicación\n\n"
                + "Digite su opción:"));
        switch (opc) {
            case 1: {
                int contraseña = Integer.parseInt(JOptionPane.showInputDialog("Digite la contraseña:"));
                if (contraseña == 178239) {
                    opc = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "----MENÚ ADMINISTRADOR---\n\n"
                            + "1. Comida disponible.\n"
                            + "2. Refrescos disponibles.\n"
                            + "3. Volver al menú."));
                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta!");
                }
                switch(opc){
                    case 1: {
                        
                        break;
                    }
                    case 2: {
                        
                        break;
                    }
                    default: {
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta!");
                    }
                }
                
                mostrarMenu();
                break;
            }
            case 2: {
                s.LlenarLista();
                mostrarMenu();
                break;
            }
            case 3: {

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
}
