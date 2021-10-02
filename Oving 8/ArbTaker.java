import java.util.Calendar;

public class ArbTaker {
    private Person personalia;
    private int arbTakerNr;
    private int ansettelsesår;
    private double månedslønn;
    private double skatteprosent;
    private java.util.GregorianCalendar kalender;
    private int år;

    public ArbTaker(String fornavn, String etternavn, int fodselsar, int arbTakerNr, int ansettelsesår, double månedslønn, double skatteprosent) {
        this.personalia = new Person(fornavn, etternavn, fodselsar);
        this.arbTakerNr = arbTakerNr;
        this.ansettelsesår = ansettelsesår;
        this.månedslønn = månedslønn;
        this.skatteprosent = skatteprosent;
        this.kalender = new java.util.GregorianCalendar();
        this.år = kalender.get(Calendar.YEAR);

    }
    //get-metoder
    public String getPersonalia() {
        return personalia.toString();
    }
    public int getArbTakerNr() {
        return arbTakerNr;
    }
    public int getAnsettelsesår() { return ansettelsesår; }
    public double getMånedslønn() {
        return månedslønn;
    }
    public double getSkatteprosent() {
        return skatteprosent;
    }

    //set-metoder
    public void setAnsettelsesår(int ansettelsesår) {
        this.ansettelsesår = ansettelsesår;
    }
    public void setArbTakerNr(int arbTakerNr) {
        this.arbTakerNr = arbTakerNr;
    }
    public void setMånedslønn(double månedslønn) {
        this.månedslønn = månedslønn;
    }
    public void setSkatteprosent(double skatteprosent) {
        this.skatteprosent = skatteprosent;
    }

    //mutasjonsmetoder
    public double skattetrekk() {

        return månedslønn * (skatteprosent / 100);
    }

    public double bruttolønn() {

        return månedslønn * 12;
    }

    public double skattetrekkÅr() {

        return ((skatteprosent / 100) * månedslønn) * 10.5;
    }

    public String formellNavn() {

        return personalia.getEtternavn() + ", " + personalia.getFornavn();
    }



    public int alder() {
        return år - personalia.getFodselsar();
    }

    public int antallÅrAnsatt() {
        return år - ansettelsesår;
    }

    public String gittAntallÅr(int aar) {
        if(antallÅrAnsatt() > aar) {
            return "Du har vært ansatt lenger enn " + aar;
        } else { return "Du har ikke vært ansatt lenger enn " + aar; }
    }

    @Override
    public String toString() {
        return "ArbTaker{" +
                "personalia=" + personalia +
                ", arbTakerNr=" + arbTakerNr +
                ", ansettelsesår=" + ansettelsesår +
                ", månedslønn=" + månedslønn +
                ", skatteprosent=" + skatteprosent +
                ", alder=" + alder() +
                '}';
    }
}
