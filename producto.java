package algoritmia2253486;

import javax.swing.JOptionPane;

public class producto {

    public static void main(String[] args) {
        //Definimos las variables para almacenar los numeros de tipo entero
        String num1, num2;
        int n1, n2, res;
        //Se crearon estos JOptionPane para que aparezca la ventana de dialogo y poder digitar los numeros
        num1 = JOptionPane.showInputDialog(null, " digite un numero");
        num2 = JOptionPane.showInputDialog(null, " digite un numero");
        //Estos n son para almacenar los numeros escritos para ser usados despues
        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);
        //Se hace el proceso de multiplicaion y con JOptionPane para que aparezca la ventana y muestre el resultado
        res = n1 * n2;
        JOptionPane.showMessageDialog(null,"el producto de los dos numero es: " + res);
    }

}
