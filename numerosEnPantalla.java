package algoritmia2253486;

import java.util.*;
/**
 *
 * @author HP - PC
 */
public class numerosEnPantalla {

    public static void main(String[] args) {
        //Clase escaner guarda la entrada del numero escrito
        Scanner Teclado = new Scanner(System.in);
        int i = 1;
        int contador;

        System.out.println("Escriba cuantos numeros quiere ver en pantalla");
        //Se guarda en la variable contador el numero digitado
        contador = Teclado.nextInt();

        while (i <= contador) {
            System.out.println(i);
            i++;
        }
    }

}
