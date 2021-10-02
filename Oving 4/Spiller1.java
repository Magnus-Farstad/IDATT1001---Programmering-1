import java.util.Random.*;

class Spiller1 {
    
    private Random rand;
    private int sumPoeng;

    public Spiller1() {
        this.sumPoeng = 0;
        this.rand = new Random();
    }

    public int getSumPoeng() {
        return sumPoeng;
    }
    public int kastTerningen() {
        int terningKast = rand.nextInt(6) + 1;
        if(terningKast == 1) {
            sumPoeng = 0;
        } else sumPoeng += terningKast;

        return terningKast;
    }
    public boolean erFerdig() {
        return sumPoeng >= 100;
    }



}
