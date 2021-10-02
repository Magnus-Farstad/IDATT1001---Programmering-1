import java.util.Random;

public class MinRandom {
    private Random tilfeldig;

    public MinRandom() {
        this.tilfeldig = new Random();
    }

    public Random getTilfeldig() {
        return tilfeldig;
    }

    public int nesteHeltall(int nedre, int ovre) {
        int hTall = tilfeldig.nextInt(ovre - nedre + 1) + nedre;
        return hTall;
    
    }

    public double nesteDesimaltall(double nedre, double ovre) {
        double desimal = tilfeldig.nextDouble() * (ovre - nedre) + nedre;
        return desimal;

    }
}
