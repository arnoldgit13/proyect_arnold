
package algoritmia2253486;

import java.util.Scanner;

public class arregloDosMayores {

    public static void main(String[] args) {
       
        Scanner in=new Scanner(System.in);
        int N[]=new int[6];
        
        for(int i=0; i<=5; i++){
            System.out.println("Digite un numero para la posicion "+i);
            N[i]=in.nextInt();
        }
       int n1=0, n2=0;
       for(int i=0; i<=5; i++){
           if(N[i]>n1){
               n2=n1;
               n1=N[i];
           }else if(N[i]>n2){
               n2=N[i];
           }
       }
       System.out.println("El numero mas grande es "+n1);
       System.out.println("El segundo numero mas grande es "+n2);
    }
    
}
