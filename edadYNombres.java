package algoritmia2253486;

import javax.swing.JOptionPane;

public class edadYNombres {

    public static void main(String[] args) {
        //JOptionPane para que aparezca la ventana con el mensaje de pedir los nombre
        String nom1 = JOptionPane.showInputDialog(null, "ingrese el nombre de la primera persona");
        String nom2 = JOptionPane.showInputDialog(null, "ingrese el nombre de la segunda persona");
        //JOptionPane para que aparezca la ventana con el mensaje de pedir la edad
        String ed1 = JOptionPane.showInputDialog(null, "ingrese la edad de " + nom1);
        String ed2 = JOptionPane.showInputDialog(null, "ingrese la edad de " + nom2);
        // se cambiara la variable de String a entero 
        int edad1 = Integer.parseInt(ed1);
        int edad2 = Integer.parseInt(ed2);
        //Se creo el if para validar quien es mayor, menor o iguales y sera mostrado atraves del JOptionPane
        if (edad1 > edad2) {
            JOptionPane.showMessageDialog(null, nom1 + " es mayor que " + nom2);
        } else if (edad1 < edad2) {
            JOptionPane.showMessageDialog(null, nom2 + " es mayor que " + nom1);
        } else if (edad1 == edad2) {
            JOptionPane.showMessageDialog(null, nom1 + " y " + nom2 + " tienen la misma edad");
        }
    }

}
