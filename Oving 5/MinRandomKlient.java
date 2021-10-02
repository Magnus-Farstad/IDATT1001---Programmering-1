import static javax.swing.JOptionPane.*;

public class MinRandomKlient {
    public static void main(String[] args) {
        MinRandom tall = new MinRandom();

        String tallNedreLest = showInputDialog("Velg nedre grense");
        String tallOvreLest = showInputDialog("Velg øvre grense");

        int tallNedre = Integer.parseInt(tallNedreLest);
        int tallOvre = Integer.parseInt(tallOvreLest);
        
        for(int i = 0; i < 10; i++) {

            int heltall = tall.nesteHeltall(tallNedre, tallOvre);
            double des = tall.nesteDesimaltall(tallNedre, tallOvre);
    
            System.out.println("Heltatll: " + heltall + "\n" + "Desimaltall: " + des);
        }

        

    }
}
