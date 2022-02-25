
package algoritmia2253486;

import java.util.Scanner;

public class contarPositivosNegativos {
    
    public static void main(String[] args) {
      // Se usa el Scanner para recojer lo datos ingresados por teclado
      Scanner num = new Scanner(System.in);
      int numeros[]= new int [6];
      //Definimos las variables para almacenar los números de tipo entero y su valor sera cero
      int neg=0, pos=0, cero=0;
     //for para el conteo del 1 al 29  
     for (int i=0; i<6; i++){
         System.out.print("ingrese un numero: " );
         numeros[i] = num.nextInt ();
         if (numeros[i]<0){
             neg++;   
             System.out.print("los numeros negativos son : "+neg);
         }
         if (numeros[i]>0){
             pos++;
             System.out.print("los numeros positivos son : "+pos); 
         }
         if (numeros[i]==0){
             cero++;
             
         }
     }
     System.out.print("los numeros negativos son : "+neg);
     System.out.print("los numeros positivos son : "+pos); 
     System.out.print("los numeros ceros son : "+cero);
    }
    
}
