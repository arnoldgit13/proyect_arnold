package algoritmia2253486;

import java.util.Scanner;

public class centigradosAfarenheit {

    public static void main(String[] args) {
        // Se usará Scanner para la lectura de datos
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables para almacenar los números de tipo entero
        int gcenti;
        int gfaren;
        //se usa el System para pedir que ingrese los centigrados
        System.out.println("Ingrese los grados centigrados:");
        gcenti = teclado.nextInt();
        //Operacion para la conversion de grados
        gfaren = gcenti * 9 / 5 + 32;
        //se usa el System para mostrar el resultado
        System.out.println("La convercion a grados farenheit es:" + gfaren);
    }

}
