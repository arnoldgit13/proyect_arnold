
package algoritmia2253486;

import java.util.Scanner;

public class cPosNeg {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner num =new Scanner(System.in);
       int numeros[]=new int [5];
       int neg=0, pos=0, cero=0;
      
     for (int i=0; i<5; i++){
         System.out.print("ingrese un numero"+(i+1)+ " : " );
         numeros[i] =num.nextInt();
         if (numeros[i]<0){
             neg++;   
             System.out.print("\n los numeros negativos son : "+neg);
         }
         if (numeros[i]>0){
             pos++;
             System.out.print("\n los numeros positivos son : "+pos); 
         }
         if (numeros[i]==0){
             cero++;
             
         }
     }
     System.out.print("\n los numeros negativos son : "+neg);
     System.out.print("\n los numeros positivos son : "+pos); 
     System.out.print("\n los numeros ceros son : "+cero);
    }
     
}
