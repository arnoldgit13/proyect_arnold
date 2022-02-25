
package algoritmia2253486;


public class primos {

   
    public static void main(String[] args) {
        // System para mostar por consola
        System.out.println("Se mostraran los 10 primero numeros primos numeros primos");
        int sum=0;
        //for para el conteo del 1 al 29   
        for(int i=1; i<=29; i++){
        //Se usa el while para validar los numeros que sean primos    
            int x = 1, cont = 0;
            while (x<=i) {
                if ((i % x) == 0) {
                    cont++;
                }
                x++;
            }
            if (cont == 2) {
                //System para mostar por consola cada primo
                System.out.println(i + " es primo");
                sum=i+sum;
                
            }
        }//System para mostar por consola la sumatoria de primos
        System.out.println("Y la suma de ellos es "+sum);
    }
    
}
