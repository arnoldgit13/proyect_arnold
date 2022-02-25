package algoritmia2253486;

import javax.swing.JOptionPane;

public class dias {

    public static void main(String[] args) {
        //Definimos la variable para almacenar el número de tipo entero
        int dato;
        //el numero escrito por medio del JOptionPane se almacenara en dato
        dato = Integer.parseInt(JOptionPane.showInputDialog("Escriba el numero del 1 al 7"));
        // por medio del switch al ingresar un numero se mostrara un mensaje corresponiente al numero
        switch (dato) {

            case 1:
                JOptionPane.showMessageDialog(null, "El No. 1 es el dia lunes");
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "El No. 2 es el dia martes");
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "El No. 3 es el dia miercoles");
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "El No. 4 es el dia jueves");
                break;

            case 5:
                JOptionPane.showMessageDialog(null, "El No. 5 es el dia viernes");
                break;

            case 6:
                JOptionPane.showMessageDialog(null, "El No. 6 es el dia sabado");
                break;

            case 7:
                JOptionPane.showMessageDialog(null, "El No. 7 es el dia domingo");
                break;
            // Cuando se escriba un numero que pase el 7 se mostrara esto
            default:
                JOptionPane.showMessageDialog(null, "Este numero de dia no existe");

        }
    }

}
