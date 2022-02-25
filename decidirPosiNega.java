package algoritmia2253486;

import java.util.Scanner;

public class decidirPosiNega {

    /**
     * Codigo para decidir que numero es positivo y negativo
     */
    public static void main(String[] args) {
        // Se usara Scanner para la lectura de datos
        Scanner n = new Scanner(System.in);
        int num; //Se declaro la variable como entera para almacanar el numero
        //se usa el System para mostrar el mensaje 
        System.out.println(" Digite un numero positivo o negativo");
        num = n.nextInt();
        //Se creo el if para la decisión de si es menor o mayor que cero
        if (num < 0) {
            //se usa el System para mostrar el mensaje 
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es postivo");
        }
    }

}
