
package algoritmia2253486;

import java.util.Scanner;

public class votaciones {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Los candidatos a votar son: Rosa 1, Victor 2, Omar 3, Dante 4");
        System.out.println("Y para que su voto sea valido tiene que poner el numero de su candidato. EJ: 1=Rosa");
        
        int v1=0, v2=0, v3=0, v4=0, v5=0;
        int Rosa=1, Victor=2, Omar=3 ,Dante=4;
        
        System.out.println("Votante 1");
        v1 = teclado.nextInt();
        
        System.out.println("Votante 2");
        v2 = teclado.nextInt();
        
        System.out.println("Votante 3");
        v3 = teclado.nextInt();
        
        System.out.println("Votante 4");
        v4 = teclado.nextInt();
        
         System.out.println("Votante 5");
        v5 = teclado.nextInt();
       
        
        if (Rosa>3) {System.out.println("Rosa gano las votaciones");}
        if (Victor>3) {System.out.println("Victor gano las votaciones");}
        if (Omar>3) {System.out.println("Omar gano las votaciones");}
        if (Dante>3) {System.out.println("Dante gano las votaciones");}
    }
    
}
