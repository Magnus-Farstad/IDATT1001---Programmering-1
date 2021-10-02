import static javax.swing.JOptionPane.*;

public class Kjottdeig2 {
    
    public static void main(String[] args) {

        String prisALest = showInputDialog("Pris kjøttdeig A:");
        String vektALest = showInputDialog("Vekt kjøttdeig A (kg):");

        String prisBLest = showInputDialog("Pris kjøttdeig B:");
        String vektBLest = showInputDialog("Vekt kjøttdeig B (kg):");

        double prisA = Double.parseDouble(prisALest); //35.9;
        double prisB = Double.parseDouble(prisBLest); //39.5;
        
        double vektA = Double.parseDouble(vektALest); //450;
        double vektB = Double.parseDouble(vektBLest); //500;

        double prisPerKgA = (prisA / vektA);
        double prisPerKgB = (prisB / vektB);

        if(vektA <= 0 || vektB <= 0) {
            showMessageDialog(null, "Ugyldig");

        } else {
            if(prisPerKgA == prisPerKgB) {
                showMessageDialog(null, "Prisen per kg er lik for begge.");
            } else {
                if(prisPerKgA < prisPerKgB) {
                    showMessageDialog(null, "Kjøttdeig A er billigst med " + prisPerKgA + " per kg");
                } else {
                    showMessageDialog(null, "Kjøttdeig B er billigst med " + prisPerKgB + " per kg");
                }
            }
            
        }
        /*
        String output = (prisPerKgA<prisPerKgB)?("A"):("B");
        showMessageDialog(null, "Den billigste er : " + output); */



            /* if(prisPerKgA < prisPerKgB) {
                showMessageDialog(null, "Kjøttdeig A er billigst med " + prisPerKgA + " per kg");
            } 
            else { 
    
                showMessageDialog(null, "Kjøttdeig B er billigst med " + prisPerKgB + " per kg");
            } */
        
    }
}