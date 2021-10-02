import java.util.Objects;

public class Rett {
    private String navn;
    private String type;
    private double pris;
    private String oppskrift;

    public Rett(String navn, String type, double pris, String oppskrift) {
        this.navn = navn;
        this.type = type;
        this.pris = pris;
        this.oppskrift = oppskrift;
    }

    public String getNavn() {
        return navn;
    }

    public String getType() {
        return type;
    }

    public double getPris() {
        return pris;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Rett)) return false;
        Rett rett = (Rett) o;
        return Objects.equals(navn.toLowerCase(), rett.navn.toLowerCase());
    }


    @Override
    public String toString() {
        return "Navn = '" + navn + '\'' +
                "\nType = '" + type + '\'' +
                "\nPris = " + pris +
                "\nOppskrift = '" + oppskrift + "\n\n";
    }
}
