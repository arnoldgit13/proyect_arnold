package algoritmia2253486;

import java.util.Scanner;

public class mcdEuclides {

    public static void main(String[] args) {
        // Se usara Scanner para la lectura de datos
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables para almacenar los números de tipo entero
        int a, b;
        //se usa el System para mostrar el mensaje de ingresar los numeros y que sean almacenados en a y b
        System.out.println("Ingrese primer numero:");
        a = teclado.nextInt();
        System.out.println("Ingrese segundo numero:");
        b = teclado.nextInt();
        //Se usa el mientras para que a sea diferente a b 
        while (a != b) //if para validar de si a es mayor que b y realizar la operacion
        {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        //se usa el System para mostrar la respuesta
        System.out.println("El MCD es:" + a);
    }

}
