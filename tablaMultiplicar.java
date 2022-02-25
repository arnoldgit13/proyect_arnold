package algoritmia2253486;

import java.util.Scanner;

public class tablaMultiplicar {

    public static void main(String[] args) {
        // Se usará Scanner para la lectura de datos
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables para almacenar los números de tipo entero
        int res;
        int i;
        int n;
        //se usa el System para pedir que ingrese numero y almacenarlo en n 
        System.out.println("Digite un numero del cual desee conocer su tabla de multiplicar");
        n = teclado.nextInt();
        //for para el conteo del 1 al 10
        for (i = 0; i <= 10; i++) {
            //Operación para la multiplicación
            res = i * n;
            //se usa el System para mostrar la tabla pedida
            System.out.println(+n + "x" + i + "=" + res);
        }
    }

}
