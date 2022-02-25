
package algoritmia2253486;

import java.util.*;

public class palindromas {

    public static void main(String[] args) {
        //se usa el System para pedir que ingrese un palabra y almacenarlo en palin
        System.out.println("Escriba una palabra y sabras si es palindroma o no");
        String palin=in.nextLine();
        //Definimos las variables 
        int Vf=palin.length()-1;
        int Vi=0;
        int res=0;
        //for para 
        for(int i=Vf; i>=0; i--){
            if (palin.charAt(i)==palin.charAt(Vi)){
                Vi++;    
        }else{
            res++;   
        }    
    }
    if (res==0){
        System.out.println("La palabra es palindroma");
    }else{
        System.out.println("La palabra no es palindroma");
    }  
    }
    
}
    
    