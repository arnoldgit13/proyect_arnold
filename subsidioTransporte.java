package algoritmia2253486;

import javax.swing.JOptionPane;

public class subsidioTransporte {

    public static void main(String[] args) {
        // Se pide escribir el sueldo en una ventana de dialogo
        String Sueldo = JOptionPane.showInputDialog(null, "Escriba su sueldo");
        //Se declaro la variable como entera para almacanar el numero y use el parseInt para convierte una cadena de texto en un número entero.
        int sueldo = Integer.parseInt(Sueldo); 
         //Se creo el if para cuando el sueldo sea mayor a 908525 por medio de la ventana del JOptionPane muestre si es o NO beneficiario
        if (sueldo <= 908525) {
            JOptionPane.showMessageDialog(null, "Usted es beneficiario del subsidio");

        } else {
            JOptionPane.showMessageDialog(null, "Usted NO es beneficiario del subsidio");
        }
    }

}
