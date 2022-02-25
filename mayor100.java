
package algoritmia2253486;

import java.util.Scanner;

public class mayor100 {

    /**
     * 
     */
    public static void main(String[]args) {
        // Se usara Scanner para la lectura de datos
        Scanner n= new Scanner(System.in);
        int num; //Se declaro la variable como entera para almacanar el numero
        //se usa el System para mostrar el mensaje
        System.out.println(" Digite un numero");
        num=n.nextInt();
        //Se creo el if para la decisión de si es menor o mayor que 100
        if (num<100){//se usan los System para mostrar el mensaje si es o no mayor
            System.out.println("el numero es menor a 100");
        }
        else {
            System.out.println(" el numero es mayor a 100");
        }
    }
    
}
