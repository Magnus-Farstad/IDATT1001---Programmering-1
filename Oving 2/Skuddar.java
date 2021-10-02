import static javax.swing.JOptionPane.*;

public class Skuddar {
    public static void main(String[] args) {
        
        String arstallLest = showInputDialog("Årstall:"); //Lager boks der bruker legger inn ønsket år, og lagrer verdien.

        int arstall = Integer.parseInt(arstallLest); //Gjør om verdien til et heltall.


        if(arstall % 400 == 0) {
            showMessageDialog(null, arstall + " er et skuddår.");

        } else {

            if(arstall % 4 == 0 && arstall % 100 != 0){
                showMessageDialog(null, arstall + " er et skuddår.");
            } else {
                showMessageDialog(null, arstall + " er ikke et skuddår");
            }
            
        }

    }
}