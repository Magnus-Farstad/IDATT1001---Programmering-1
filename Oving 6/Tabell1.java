import java.util.Random;

public class Tabell1 {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();

        int[] antall = new int[10];

        for(int i = 0; i < 1000; i++) {
                
            int tall = random.nextInt(10);
            antall[tall] += 1; 
        }

        for(int i = 0; i < antall.length; i++) {

            System.out.println("Rundenummer: " + i);
            System.out.println("Tall: " + i + " - " + antall[i]);
            System.out.println();
        }

        System.out.println();
        
        
    }
} //Tabell1