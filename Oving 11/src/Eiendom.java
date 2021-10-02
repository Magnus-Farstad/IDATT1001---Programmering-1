import java.util.Objects;

/**
 * En klasse som representerer en eiendom.
 * @author Magnus Farstad
 */

public class Eiendom {
    private String kommunenavn;
    private int kommunenummer;
    private int gaardsnummer;
    private int bruksnummer;
    private String bruksnavn;
    private double areal;
    private String eier;

    /**
     *
     * @param kommunenavn - Navnet på kommunen
     * @param kommunenummer - Nummeret til kommunen
     * @param gaardsnummer - Nummeret til gården, som eiendommen er i
     * @param bruksnummer - Nummeret på bruket
     * @param bruksnavn - Navnet på bruket/eiendommen, hvis dette eksisterer
     * @param areal - Arealet til eiendommen
     * @param eier - Eieren av eiendommen
     */
    public Eiendom(String kommunenavn, int kommunenummer, int gaardsnummer, int bruksnummer, String bruksnavn, double areal, String eier) {
        this.kommunenavn = kommunenavn;
        this.kommunenummer = kommunenummer;
        this.gaardsnummer = gaardsnummer;
        this.bruksnummer = bruksnummer;
        this.bruksnavn = bruksnavn;
        this.areal = areal;
        this.eier = eier;
    }

    /*
    Konstruktør uten bruksnavn

    public Eiendom(String kommunenavn, int kommunenummer, int gaardsnummer, int bruksnummer, double areal, String eier) {
        this.kommunenavn = kommunenavn;
        this.kommunenummer = kommunenummer;
        this.gaardsnummer = gaardsnummer;
        this.bruksnummer = bruksnummer;
        this.areal = areal;
        this.eier = eier;
    } */

    /**
     *
     * @return - Returnerer kommunenummeret
     */
    public int getKommunenummer() {
        return kommunenummer;
    }

    /**
     *
     * @return - Returnerer gårdsnummeret, eiendommen er i
     */
    public int getGaardsnummer() {
        return gaardsnummer;
    }

    /**
     *
     * @return - Returnerer bruksnummeret til eiendommen
     */
    public int getBruksnummer() {
        return bruksnummer;
    }

    /**
     *
     * @return - Returnerer arealet til eiendommen
     */
    public double getAreal() {
        return areal;
    }

    /**
     *
     * @return - Returnerer kommunenummer, gårdsnummer og bruksnummer på et bestemt format
     */
    public String eiendomID() {
        return kommunenummer + "-" + gaardsnummer + "/" + bruksnummer;
    }

    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Eiendom)) return false;
        Eiendom eiendom = (Eiendom) o;
        return kommunenummer == eiendom.kommunenummer &&
                gaardsnummer == eiendom.gaardsnummer &&
                bruksnummer == eiendom.bruksnummer;
    } */

    @Override
    public int hashCode() {
        return Objects.hash(kommunenummer, gaardsnummer, bruksnummer);
    }

    /**
     *
     * @return - Returnerer alle objektvariablene til en eiendom
     */
    @Override
    public String toString() {
        return "Eiendom" +
                "\nkommunenavn = '" + kommunenavn + '\'' +
                ", kommunenummer = '" + kommunenummer + '\'' +
                ", gaardsnummer = '" + gaardsnummer + '\'' +
                ", bruksnummer = '" + bruksnummer + '\'' +
                ", bruksnavn = '" + bruksnavn + '\'' +
                ", areal = '" + areal + '\'' +
                ", eier = '" + eier + '\'';
    }

    /**
     * En testklient for klassen Eiendom
     */
    public static void main(String[] args) {
        //Eiendom eiendom = new Eiendom("Gloppen", 1445, 77, 631, 1017.6, "Jens Olsen");
        Eiendom eiendom2 = new Eiendom("Gloppen", 1445, 77, 131, "Syningom", 661.3, "Nicolay Madsen");

        //System.out.println(eiendom.eiendomID());
        System.out.println(eiendom2.eiendomID());
    }
}
