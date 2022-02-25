package algoritmia2253486;

import java.util.Scanner;

public class areaVolumenCilindro {

    public static void main(String[] args) {
        // Se usará Scanner para la lectura de datos
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables para almacenar números de tipo decimal
        double ra, h, are, vo;
        //se usa el System para pedir que ingrese el radio y almacenarlo en ra
        System.out.println("Digite el radio  ");
        ra = teclado.nextInt();
        //se usa el System para pedir que ingrese la altura y almacenarlo en h
        System.out.println("Digite la altura ");
        h = teclado.nextInt();
        //Operación para hallar el area y el volumen
        are = 2 * 3.1416 * ra * (ra* h);
        vo = 3.1416 * (ra * ra) * h;
        //se usan los System para mostrar los resultados
        System.out.println("El valor del area del cilindro es: " + are);
        System.out.println("El valor del cilindro es:  " + vo);
    }

}
