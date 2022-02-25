package algoritmia2253486;

import java.util.Scanner;

public class leer4Numeros {

    public static void main(String[] args) {
        // Se usará Scanner para la lectura de datos
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables para almacenar los números de tipo entero
        int n1, n2, n3, n4;
        //Definimos las variables para almacenar los resultados de tipo entero
        int suma, mul, md;
        //se usa el System para pedir que ingrese el primer numero y almacenarlo en n1
        System.out.println("digite el primer numero");
        n1 = teclado.nextInt();
        //se usa el System para pedir que ingrese el segundo numero y almacenarlo en n2
        System.out.println("digite el segundo numero");
        n2 = teclado.nextInt();
        //se usa el System para pedir que ingrese el tercer numero y almacenarlo en n3
        System.out.println("digite el tercer numero");
        n3 = teclado.nextInt();
        //se usa el System para pedir que ingrese el ultimo numero y almacenarlo en n4
        System.out.println("digite el cuarto numero");
        n4 = teclado.nextInt();

        //Operaciones para la suma, multiplicacion y media
        suma = (n1 + n2 + n3 + n4);
        mul = (n1 * n2 * n3 * n4);
        md = (n1 + n2 + n3 + n4) / 4;

        //se usan los System para mostrar los diferentes resultados
        System.out.println("la suma de los 4 numeros es: " + suma);
        System.out.println("la multiplicacion de los 4 numeros es: " + mul);
        System.out.println("la media aritmetica de los 4 numeros es:  " + md);
    }

}
