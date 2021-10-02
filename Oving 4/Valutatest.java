public class Valutatest {
    private String navn;
    private double kurs;

    public Valutatest(String navn, double kurs) {
        this.navn = navn;
        this.kurs = kurs;
    }

    public double tilNok(double input) {
        return input * kurs;
    }
    public double fraNok(double input) {
        return input / kurs;
    }

    public String toString() {
        return "navn: " + navn + "kurs" + kurs;
    }
    
}
