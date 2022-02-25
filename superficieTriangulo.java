package algoritmia2253486;

import java.util.Scanner;

public class superficieTriangulo {

    public static void main(String[] args) {
        // Se usara Scanner para la lectura de datos
        Scanner teclado = new Scanner(System.in);
        //Se definieron las variables para area,base y altura de tipo decimal
        float area, base, altura;
        //System para mostrar el mensaje para ingresar la base
        System.out.println("digite la base del triangulo ");
        base = teclado.nextInt();
        //System para mostrar el mensaje para ingresar la base
        System.out.println("digite la altura del triangulo ");
        altura = teclado.nextInt();
        //Operacion para multipicar y dividir y asi encontara el area
        area = (base * altura) / 2;
        //System para mostrar el resultado
        System.out.println("el area del triangulo es:  " + area);
    }

}
