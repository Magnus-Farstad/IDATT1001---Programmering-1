import static javax.swing.JOptionPane.*;

public class Valutaklient {
    public static void main(String[] args) {

        Valutatest dollar = new Valutatest("dollar", 8.9);
        Valutatest euro = new Valutatest("euro", 10.6);
        Valutatest sek = new Valutatest("sek", 1.02);

        String valutaValgLest = showInputDialog("Velg en valuta: \n1 - Dollar \n2 - Euro \n3 - SEK \n4 - Avslutt");
        int valutaValg = Integer.parseInt(valutaValgLest);
        
        while(valutaValg != 4) {
            String omgjoringLest = showInputDialog("Velg hvilken retning: \n1 - Til NOK \n2 - Fra NOK");
            int omgjoring = Integer.parseInt(omgjoringLest);
            
            switch(valutaValg) {
                
                case 1:
                if(omgjoring == 1) {
                    String dollarLest = showInputDialog("Hvor mye?");
                    double dollarTall = Double.parseDouble(dollarLest);
                    double dollarTilNok = dollar.tilNok(dollarTall);
                    showMessageDialog(null, dollarLest + " dollar er " + dollarTilNok + " NOK");
                }
                else if(omgjoring == 2) {
                    String nokLest = showInputDialog("Hvor mye?");
                    double nokTall = Double.parseDouble(nokLest);
                    double nokTilDollar = dollar.fraNok(nokTall);
                    showMessageDialog(null, nokLest + " NOK er " + nokTilDollar + " dollar");
                }
                break;
                
                case 2:
                if(omgjoring == 1) {
                    String euroLest = showInputDialog("Hvor mye?");
                    double euroTall = Double.parseDouble(euroLest);
                    double euroTilNok = euro.tilNok(euroTall);
                    showMessageDialog(null, euroLest + " Euro er " + euroTilNok + " NOK");
                }
                else if(omgjoring == 2) {
                    String nokLest = showInputDialog("Hvor mye?");
                    double nokTall = Double.parseDouble(nokLest);
                    double nokTilEuro = euro.fraNok(nokTall);
                    showMessageDialog(null, nokLest + " NOK er " + nokTilEuro + " Euro");
                }
                break;
                
                case 3:
                if(omgjoring == 1) {
                    String sekLest = showInputDialog("Hvor mye?");
                    double sekTall = Double.parseDouble(sekLest);
                    double sekTilNok = sek.tilNok(sekTall);
                    showMessageDialog(null, sekLest + " SEK er " + sekTilNok + " NOK");
                }
                else if(omgjoring == 2) {
                    String nokLest = showInputDialog("Hvor mye?");
                    double nokTall = Double.parseDouble(nokLest);
                    double nokTilSek = sek.fraNok(nokTall);
                    showMessageDialog(null, nokLest + " NOK er " + nokTilSek + " SEK");
                }
                break;
                
                default:
                showMessageDialog(null, "Feil input!");
            }
            valutaValgLest = showInputDialog("Velg en valuta: \n1 - Dollar \n2 - Euro \n3 - SEK \n4 - Avslutt");
            valutaValg = Integer.parseInt(valutaValgLest);
        }
    }
}
