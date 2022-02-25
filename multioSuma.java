
package algoritmia2253486;

public class multioSuma {

    public static void main(String[] args) {
        //Definimos las variables para almacenar los números de tipo entero y se le asigna el valor de 6
        int num1 = 6;
        int num2 = 6;
        int res;
        //Se creo el if para validar si el primer numero es mayor se multipliquen
        if (num1 > num2) {
            res = num1 * num2;//Se hace la operacion de multiplicación y luego con el System el resultado sea mostrado por consola
            System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es: " + res);
        }
        //De lo contrario se sumen
        else{
           res = num1 + num2;//Se hace la operacion de suma y luego con el System el resultado sea mostrado por consola
            System.out.println("La suma de " + num1 + " y " + num2 + " es: " + res); 
        }
        // Y este if para validar cuando los dos sean cero por Systen diga que son iguales
        if (num1==num2);
            res=num1/num2;
            System.out.println("Los numeros son iguales:" + res); 
           }

}
