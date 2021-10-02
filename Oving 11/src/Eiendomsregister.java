import java.util.ArrayList;

/**
 * En klasse som administrerer flere eiendommer.
 * @author Magnus Farstad
 */

public class Eiendomsregister {
    private ArrayList<Eiendom> eiendommer;
    private int antallEiendommer;

    /**
     * Konstruktør
     */
    public Eiendomsregister() {
        this.eiendommer = new ArrayList<Eiendom>();
        this.antallEiendommer = 0;
    }

    /*
    public int test() {
        String navn1 = "Gunnar";
        String navn2 = "Airger";
        return navn1.compareTo(navn2);
    }*/

    /**
     * En metode som oppdaterer objektvariabelen "antallEiendommer".
     * Først trimmes lista til det faktiske antallet objekter den holder.
     * Deretter oppdateres objektvariabelen med lengden til lista.
     */
    public void oppdaterAntallEiendommer() {
        eiendommer.trimToSize();
        antallEiendommer = eiendommer.size();
    }

    /**
     *
     * @return - Returnerer antall eiendommer
     */
    public int getAntallEiendommer() {
        return antallEiendommer;
    }

    /**
     * En metode (hjelpemetode) som går gjennom alle eiendommene og sjekker om den eksisterer fra før,
     * basert på argumentene:
     * @param bruksnr - Bruksnummeret til eiendommen
     * @param gaardsnr - Gårdsnummeret til eiendommen
     * @param kommunenr - Kommunenummeret til eiendommen
     * @return - Returnerer boolean basert på om eiendommen eksisterer fra før eller ikke
     */
    private boolean sjekkEiendom(int bruksnr, int gaardsnr, int kommunenr) {
        boolean sjekk = false;
        eiendommer.trimToSize();
        for(int i = 0; i < eiendommer.size(); i++) {
            if(eiendommer.get(i).getKommunenummer() == kommunenr && eiendommer.get(i).getGaardsnummer() == gaardsnr && eiendommer.get(i).getBruksnummer() == bruksnr) {
                sjekk = true;
                break;
            }
        } return sjekk;
    }

    /**
     * En metode som oppretter og registrerer en ny eiendom i eiendomsregisteret, om eiendommen ikke eksisterer fra før.
     * Metoden oppdaterer også objektvariabelen antallEiendommer.
     * @param kommunenavn - Kommunenavnet til eiendommen
     * @param kommunenr - Kommunenummeret til eiendommen
     * @param gaardsnr - Gårdsnummeret til eiendommen
     * @param bruksnr - Bruksnummeret til eiendommen
     * @param bruksnavn - Bruksnavnet til eiendommen, om den har et
     * @param areal - Arealet til eiendommen
     * @param eier - Eieren av eiendommen
     * @return - Returnerer en boolean basert på om eiendommen eksisterer fra før eller ikke,
     * (dette sjekkes i hjelpemetoden sjekkEiendom, over)
     */
    public boolean registrerNyEiendom(String kommunenavn, int kommunenr, int gaardsnr, int bruksnr, String bruksnavn, double areal, String eier) {
        boolean eksistererFraFor = true;
        if(!sjekkEiendom(bruksnr, gaardsnr, kommunenr)) {
            eiendommer.add(new Eiendom(kommunenavn, kommunenr, gaardsnr, bruksnr, bruksnavn, areal, eier));
            eksistererFraFor = false;
            oppdaterAntallEiendommer();
        } /*else if(!sjekkEiendom(bruksnr, gaardsnr, kommunenr) && bruksnavn == null) {
            eiendommer.add(new Eiendom(kommunenavn, kommunenr, gaardsnr, bruksnr, areal, eier));
            eksistererFraFor = false;
            oppdaterAntallEiendommer();
        } */
        return eksistererFraFor;
    }

    /**
     * En metode som fjerner en eiendom fra registeret, basert på argumentene:
     * @param bruksnr - Bruksnummeret til eiendommen
     * @param gaardsnr - Gårdsnummeret til eiendommen
     * @param kommunenr - Kommunenummeret til eiendommen
     * @return - Returnerer en boolean basert på om eiendommen eksisterer eller ikke,
     * (dette sjekkes i hjelpemetoden sjekkEiendom, over)
     * Metoden oppdaterer også antallet eiendommer
     */
    public boolean fjernEiendom(int bruksnr, int gaardsnr, int kommunenr) {
        boolean eksistererFraFor = true;
        eiendommer.trimToSize();
        if(sjekkEiendom(bruksnr, gaardsnr, kommunenr)) {
            for(int i = 0; i < eiendommer.size(); i++) {
                if(eiendommer.get(i).getBruksnummer() == bruksnr) {
                    eiendommer.remove(i);
                    eksistererFraFor = false;
                    oppdaterAntallEiendommer();
                    break;
                }
            }
        } return eksistererFraFor;
    }

    /**
     * En metode som finner en eiendom basert på argumentene:
     * @param bruksnr - Bruksnummeret til eiendommen
     * @param gaardsnr - Gårdsnummeret til eiendommen
     * @param kommunenr - Kommunenummeret til eiendommen
     * @return - Returnerer eiendommen den har funnet, hvis den eksisterer.
     * Hvis ikke den returnerer dette, returnerer den null.
     */
    public Eiendom finnEiendom(int bruksnr, int gaardsnr, int kommunenr) {
        for(int i = 0; i < eiendommer.size(); i++) {
            if(eiendommer.get(i).getKommunenummer() == kommunenr && eiendommer.get(i).getGaardsnummer() == gaardsnr && eiendommer.get(i).getBruksnummer() == bruksnr) {
                return eiendommer.get(i);
            }
        } return null;
    }

    /**
     * En metode som finner alle eiendommer innenfor en gård og legger dette i en egen lokal liste
     * @param gaardsnummer - Gårdsnummeret til eiendommen
     * @return - Returnerer lista med eiendommene innenfor den bestemte gården
     */
    public ArrayList<Eiendom> finnEiendomIGaard(int gaardsnummer) {
        ArrayList<Eiendom> gaard = new ArrayList<Eiendom>();
        gaard.trimToSize();
        for(int i = 0; i < eiendommer.size(); i++) {
            if(eiendommer.get(i).getGaardsnummer() == gaardsnummer) {
                gaard.add(eiendommer.get(i));
            }
        }
        return gaard; // alltid på egen linje
    }

    /**
     * En metode som regner ut gjennomsnittsareal i kommunen (hele registeret)
     * @return - Returnerer en double gjennomsnittsareal
     */
    public double gjennomsnitsareal() {
        eiendommer.trimToSize();
        double gjennomsnitt = 0;
        for(int i = 0; i < eiendommer.size(); i++) {
            gjennomsnitt += eiendommer.get(i).getAreal();
        }
        return gjennomsnitt /= eiendommer.size();
    }

    /**
     *
     * @return - Returnerer alle eiendommer, deres respektive objektvariabler (med toString fra klassen eiendom),
     * og antall eiendommer i registeret
     */
    @Override
    public String toString() {
        return "Eiendomsregister" +
                "\nEiendommer = " + eiendommer +
                "\n\nAntall eiendommer = " + antallEiendommer;
    }
}
