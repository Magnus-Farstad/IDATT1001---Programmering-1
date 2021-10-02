import static javax.swing.JOptionPane.*;

public class Gangetabell {
    public static void main(String[] args) {

        String startLest = showInputDialog("Hvor vil du begynne?");
        String sluttLest = showInputDialog("Hvor vil du slutte?");

        int start = Integer.parseInt(startLest);
        int slutt = Integer.parseInt(sluttLest);

        for(int i=1; i <= 10; i++) {
            int result = start * i;
            System.out.println(start + " * " + i + " = " + result);

            if(i >= 10){
                start ++;
                i = 0;
                
            } 
            if(start > slutt) {break;
                 
            }


        }
        

    }
}