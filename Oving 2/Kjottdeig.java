import static javax.swing.JOptionPane.*;

public class Kjottdeig {

    public static void main(String[] args) {
        double prisA = 35.9;
        double prisB = 39.5;

        double vektA = 450;
        double vektB = 500;

        double prisPerKgA = (prisA / vektA) * 1000;
        double prisPerKgB = (prisB / vektB) * 1000;

        /* String prisALest = showMessageDialog("Pris kjøttdeig A:");
        String vektALest = showMessageDialog("Vekt kjøttdeig A:");

        String prisBLest = showMessageDialog("Pris kjøttdeig B:");
        String vektBLest = showMessageDialog("Vekt kjøttdeig B:");
         */
        /*
        String output = (prisPerKgA<prisPerKgB)?("A"):("B");
        showMessageDialog(null, "Den billigste er : " + output); */

        if(prisPerKgA < prisPerKgB) {
            showMessageDialog(null, "Kjøttdeig A er billigst med " + + prisPerKgA + " per kg");
        } else {

            showMessageDialog(null, "Kjøttdeig B er billigst med " + prisPerKgB + " per kg");
        }
    }
}
