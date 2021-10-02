import static javax.swing.JOptionPane.*;

public class TekstanalyseKlient {
    public static void main(String[] args) {
        
        String tekstLest = showInputDialog("Skriv tekst");
        Tekstanalyse tekst = new Tekstanalyse(tekstLest);

        //antall forekomster av forskjellige bokstaver
        tekst.analyse();
        //System.out.println("Antall forskjellige bokstaver: " + tekst.antallForskjellige());
        System.out.println("Totalt antall bokstaver: " + tekst.totaltAntall());
        System.out.println(tekst.prosent());

        //antall forskjellige bokstaver

        
    }
}
