package algoritmia2253486;

import java.util.Scanner;

public class ValorNeto20 {

    public static void main(String[] args) {
        // Se usará Scanner para la lectura de datos 
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables para almacenar los números de tipo entero
        int sueldo;
        int auxt;
        int salud;
        int pension;
        int sueldot;
        //se usa el System para pedir que ingrese el sueldo y almacenarlo sueldo   
        System.out.println("Por favor escriba su sueldo");
        sueldo = teclado.nextInt();
        //Operación para hallar lo que nos piden
        auxt = sueldo + 32000;
        salud = -(sueldo * 12 / 100);
        pension = -(sueldo * 16 / 100);
        sueldot = auxt + salud + pension;
        //se usa el System para mostrar los resultados
        System.out.println("Salud: $" + salud);
        System.out.println("Pension: $" + pension);
        System.out.println("Total con solo auxilio de transporte es: $" + auxt);
        System.out.println("El valor total de su sueldo es: $" + sueldot);

    }

}
