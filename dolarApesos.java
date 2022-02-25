package algoritmia2253486;

import java.util.Scanner;

public class dolarApesos {

    public static void main(String[] args) {
        // Se usará Scanner para la lectura de datos
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables para almacenar los números de tipo entero
        int dolar, pesos;
        //se usa el System para pedir que ingrese los doleres y almacenarlo en dolar 
        System.out.println("Escriba la cantidad de dolares a converir a Pesos");
        dolar = teclado.nextInt();
        //Operación para covertir los dolares al pesos
        pesos = (dolar * 3850);
        //se usa el System para mostrar el resultado
        System.out.println("La cantidad de pesos colombianos son:  " + pesos);

    }
}
