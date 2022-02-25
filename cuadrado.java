package algoritmia2253486;

import java.util.Scanner;

public class cuadrado {

    public static void main(String[] args) {
        // Se usará Scanner para la lectura de datos
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables para almacenar el números y el resultado de tipo entero
        int num, res;
        //se usa el System para pedir que ingrese un numero y almacenarlo en num
        System.out.println("digite un numero ");
        num = teclado.nextInt();
        //Operacion para hallar el cuadrado de un numero
        res = (num * num);
        //se usa el System para mostrar el resultado
        System.out.println("el cuadrado de " + num + " es : " + res);
    }

}
