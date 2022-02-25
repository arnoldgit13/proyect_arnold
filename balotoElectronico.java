package algoritmia2253486;

import java.util.Random;

public class balotoElectronico {

    public static void main(String[] args) {
        // 
        Random baloto1 = new Random();
        int n1 = baloto1.nextInt(10);

        Random baloto2 = new Random();
        int n2 = baloto2.nextInt(10);

        Random baloto3 = new Random();
        int n3 = baloto3.nextInt(10);

        Random baloto4 = new Random();
        int n4 = baloto4.nextInt(10);

        Random baloto5 = new Random();
        int n5 = baloto5.nextInt(10);

        Random baloto6 = new Random();
        int n6 = baloto6.nextInt(10);
        System.out.println("Su numeró de balote es:" + n1 + n2 + n3 + n4 + n5 + n6);
    }

}
