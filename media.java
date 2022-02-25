package algoritmia2253486;

import java.util.*;

public class media {

    public static void main(String[] args) {
        //Se declara la variable que es decimal 
        double media;
        // Se usara Scanner para la lectura de datos
        Scanner sc = new Scanner(System.in);
        //se usa el System para mostrar el mensaje
        System.out.println("Escriba la cantidad de numeros");
        //Esta n es para almacenar el número escrito para ser usado después
        int n = sc.nextInt();
        // crear un array para alamcenar el valor
        int numeros[] = new int[n];
        //for para el conteo de 0 hasta el valor de n y usarlo en en mensaje
        for (int i = 1; i < n; i++) {
            //se usa el System para mostrar el mensaje del numero a digitar
            System.out.println("ingrese el numero:" + i);
            //Los numeros ingresados se guardan en este array
            numeros[i] = sc.nextInt(0);
        }   //Se declara la variable suma como entero con el valor de cero
        int suma = 0;
        //for para el conteo los numeros almacenados el array  anterior
        for (int i = 0; i < n; i++) {
            //Se hace la operacion de suma con los numeros digitados
            suma = suma + numeros[i];
        }
        //Se hace la operacion para la media
        media = suma / n;
        //se usa el System para mostrar el mensaje con el resultado
        System.out.println("la media es :" + media);
    }

}
