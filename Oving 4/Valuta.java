public class Valutaa {
    // Objektvariabler
    private String navn;
    private double kurs;

    // Konstruktlr
    public Valuta(String navn, double kurs){
        this.navn = navn;
        this.kurs = kurs;

    }

    //Get- og setmetoder
    public String getNavn() {
        return navn;
    }
    public double getKurs() {
        return kurs;
    }
    public static void main(String[] args){

        Valuta nok = new Valuta("nok", 10.8);

        System.out.println(nok.getNavn() + " " + nok.getKurs());
    }
}