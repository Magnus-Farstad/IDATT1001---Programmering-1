import static javax.swing.JOptionPane.*;

public class Valuta1 {
    public static void main(String[] args) {
        
        String valutaLest = showInputDialog("Velg en valuta. \n1 = Dollar \n2 = Euro");
        int valuta = Integer.parseInt(valutaLest);

        switch (valuta) {
            case 1:

            showMessageDialog(null, valuta + " kr er ");
            break;
            
            case 2:
            
            System.out.println("Heiiii");
            break;

            default:
            System.out.println("Heiiiiiiiiii");


        }
    }
}
