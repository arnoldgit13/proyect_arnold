import java.util.Scanner;
public class gardosAfarenhei {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        
        int gcenti;
        int gfaren;
        
        System.out.println("Ingrese los grados centigrados:");
        gcenti=teclado.nextInt();
        gfaren=gcenti * 9/5 + 32;
        
        System.out.println("La convercion a grados farenheit es:" +gfaren);
    }
    
}
