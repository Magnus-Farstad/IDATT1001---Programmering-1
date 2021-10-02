import static javax.swing.JOptionPane.*;

public class NyStringKlient {
    public static void main(String[] args) {

        String tekstLest = showInputDialog("Skriv inn teksten");
        NyString tekst = new NyString(tekstLest);

        System.out.println(tekst.getTekst() + " - blir: " + tekst.forkort());

        String fjernLest = showInputDialog("Hvilken bokstav vil du fjerne?");

        System.out.println(tekst.getTekst() + " - blir: " + tekst.fjern(fjernLest));
    }
}
