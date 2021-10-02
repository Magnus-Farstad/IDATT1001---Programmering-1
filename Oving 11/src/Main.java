import java.util.ArrayList;
import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[] args) {
        Eiendomsregister eiendommer = new Eiendomsregister();

        eiendommer.registrerNyEiendom("Gloppen", 1445, 77, 631, "", 1017.6, "Jens Olsen");
        eiendommer.registrerNyEiendom("Gloppen", 1445, 77, 131, "Syningom", 661.3, "Nicolay Madsen");
        showMessageDialog(null, eiendommer.toString());

        //showMessageDialog(null, eiendommer.test());

        boolean run = true;
        while (run) {
            String valgLest = showInputDialog("Velg hva du vil gjøre. " +
                    "\n1: Registrer en eiendom" +
                    "\n2: Slett eiendom fra liste" +
                    "\n3: Finn antall eiendommer i register " +
                    "\n4: Finn eiendom basert på kommunenr, gårdsnummer og bruksnr" +
                    "\n5: Finn gjennomsnittsareal i kommunen" +
                    "\n6: Finn alle eiendommer innenfor en gård" +
                    "\n7: Finn alle eiendommer i registeret" +
                    "\n8: Avslutt");
            int valg = Integer.parseInt(valgLest);

            switch (valg) {
                case 1:
                    showMessageDialog(null, eiendommer.toString());
                    String kommunenavnLest = showInputDialog("Kommunenavn");
                    String kommunenrLest = showInputDialog("Kommunenr");
                    String gaardsnrLest = showInputDialog("Gårdsnr");
                    String bruksnrLest = showInputDialog("Bruksnr");
                    String bruksnavnLest = showInputDialog("Bruksnavn, hvis eiendommen har. Ikke skriv noe hvis den ikke har navn");
                    String arealLest = showInputDialog("Areal");
                    String eierLest = showInputDialog("Eier");

                    int kommunenr = Integer.parseInt(kommunenrLest);
                    int gaardsnr = Integer.parseInt(gaardsnrLest);
                    int bruksnr = Integer.parseInt(bruksnrLest);
                    double areal = Double.parseDouble(arealLest);


                    if(eiendommer.registrerNyEiendom(kommunenavnLest, kommunenr, gaardsnr, bruksnr, bruksnavnLest, areal, eierLest)) {
                        showMessageDialog(null, "Eiendommen eksisterer fra før");
                    }

                    showMessageDialog(null, eiendommer.toString());
                    break;

                case 2:
                    showMessageDialog(null, eiendommer.toString());
                    String slettKommunenrLest = showInputDialog("Skriv kommunenr eiendommen har");
                    String slettGaardsnrLest = showInputDialog("Skriv gårdsnr eiendommen har");
                    String slettBruksnrLest = showInputDialog("Skriv inn bruksnr på eiendommen du vil slette");

                    int slettBruksnr = Integer.parseInt(slettBruksnrLest);
                    int slettGaardsnr = Integer.parseInt(slettGaardsnrLest);
                    int slettKommunenr = Integer.parseInt(slettKommunenrLest);

                    if(eiendommer.fjernEiendom(slettBruksnr, slettGaardsnr, slettKommunenr)) {
                        showMessageDialog(null, "Eiendommen er ikke registrert fra før");
                    }
                    showMessageDialog(null, eiendommer.toString());
                    break;

                case 3:
                    showMessageDialog(null, eiendommer.getAntallEiendommer());
                    break;

                case 4:
                    kommunenrLest = showInputDialog("Skriv inn kommunenummer");
                    gaardsnrLest = showInputDialog("Skriv inn gårdsnummer");
                    bruksnrLest = showInputDialog("Skriv inn bruksnummer");

                    int finnKommunenr = Integer.parseInt(kommunenrLest);
                    int finnGaardsnr = Integer.parseInt(gaardsnrLest);
                    int finnBruksnr = Integer.parseInt(bruksnrLest);

                    showMessageDialog(null, eiendommer.finnEiendom(finnBruksnr, finnGaardsnr, finnKommunenr));
                    break;

                case 5:
                    showMessageDialog(null, eiendommer.gjennomsnitsareal());
                    break;

                case 6:
                    gaardsnrLest = showInputDialog("Skriv inn gårdsnr");
                    gaardsnr = Integer.parseInt(gaardsnrLest);

                    if(!eiendommer.finnEiendomIGaard(gaardsnr).isEmpty()) {
                        showMessageDialog(null, eiendommer.finnEiendomIGaard(gaardsnr));
                    } else {
                        showMessageDialog(null, "Ingen eiendommer i denne gården");
                    }
                    break;

                case 7:
                    showMessageDialog(null, eiendommer.toString());
                    break;

                case 8:
                    run = false;
                    break;

                default:
                    showMessageDialog(null, "Ugyldig valg. Velg en av de 8");
            }


        }
    }
}
