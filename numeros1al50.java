package algoritmia2253486;

import javax.swing.JOptionPane;

public class numeros1al50 {

    public static void main(String[] args) {
        // Se usa el JOpitionPane para mostrar el mensaje
        JOptionPane.showMessageDialog(null, " se mostraran los numeros del 1al 50");
        int sum = 0; // Se usa el int para almacenas la variable entera
        //Se usa el for para realizar el conteo del 1 al 50 
        for (int i = 1; i <= 50; i++) {
            JOptionPane.showInternalMessageDialog(null, i);
            //se realiza la sumatoria de los numeros
            sum = i + sum;
        }// Se usa el JOpitionPane para mostrar el mensaje
        JOptionPane.showInternalMessageDialog(null, " la suma de los 50 numeros es: " + sum);

    }

}
