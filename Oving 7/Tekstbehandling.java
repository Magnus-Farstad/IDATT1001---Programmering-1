import static javax.swing.JOptionPane.*;

public class Tekstbehandling {
    private String text;

    public Tekstbehandling(String string) {
        this.text = string;
    }

    public String getText() {
        return text;
    }

    public double antallOrd() {
        String[] antall = text.split(" ");
        return antall.length;
    }

    public double ordlengde() {
        String[] antall = text.split(" ");
        double antallBokstaver = 0;
        for(int i = 0; i < text.length(); i++) {
            if(Character.isLetter(text.charAt(i))) {
                antallBokstaver++;
            }
        }
        return antallBokstaver / antall.length;
    }

    public double ordPeriode(){
        String[] gjOrd = text.split("\\.|\\!|\\:|\\?");
        
        return antallOrd() / gjOrd.length;
    }
    

    public String byttOrd(String a, String b) {
        return text.replace(a, b);
    }


    public static void main(String[] args) {

        String tekstLest = showInputDialog("Skriv inn tekst");
        Tekstbehandling tekst = new Tekstbehandling(tekstLest);

        System.out.println(tekst.getText());

        //System.out.println(tekst.getText().toUpperCase());
        System.out.println(tekstLest.toUpperCase());
        System.out.println();

        System.out.println(tekst.antallOrd());
        System.out.println();

        System.out.println("Gjennomsnittlig ordlengde er: " + tekst.ordlengde());
        System.out.println();

        System.out.println(tekst.ordPeriode());
        System.out.println();

        String bytt = showInputDialog("Hvilket ord vil du bytte ut?");
        String byttet = showInputDialog("Hvilket ord vil du bytte inn?");

        String nyTekst = tekst.byttOrd(bytt, byttet);
        System.out.println(nyTekst);
    }
}
