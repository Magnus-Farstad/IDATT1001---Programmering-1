import java.util.Random;

public class Spiller {
    // Objektvariabler
    private Random rand;
    private int sumPoeng;
  
    //Konstruktør
    public Spiller() {
      this.sumPoeng = 0;
      this.rand = new Random();
    }
  
    // get-metode
    public int getSumPoeng() {
      return sumPoeng;
    }
    //Metode for å kaste terning
    public int kastTerningen() {
      int kast = rand.nextInt(6)+1;
      if (kast == 1) {
        sumPoeng = 0;
      } else if(sumPoeng < 100) {

          sumPoeng += kast;
      } else if (sumPoeng > 100) {
          sumPoeng -= kast;
      }
      return kast;
    }
    //Metode for ferdig spill
    public boolean erFerdig() {
      return sumPoeng == 100;
    }

    public String toString() {
      return "Random generator: " + rand + "Poengsum; " + sumPoeng;
    }
  }
  
