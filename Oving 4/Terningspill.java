public class Terningspill {
    public static void main(String[] args) {
        
        Spiller spillerA = new Spiller();
        Spiller spillerB = new Spiller();

        int rundeNr = 0;
    
        while(!spillerA.erFerdig() && !spillerB.erFerdig()) {
            rundeNr ++;
            System.out.println("Runde nummer " + rundeNr);
            System.out.println("Spiller A kaster " + spillerA.kastTerningen() + ", og har " + spillerA.getSumPoeng());
            if(spillerA.erFerdig()) {
                break;
            }
            System.out.println("Spiller B kaster " + spillerB.kastTerningen() + ", og har " + spillerB.getSumPoeng());
        }
        if(spillerA.erFerdig()) {
            System.out.println("Spiller A vant med poeng: " + spillerA.getSumPoeng());
        }
        else if(spillerB.erFerdig()) {
            System.out.println("Spiller B vant med poeng: " + spillerB.getSumPoeng());
        }
    }
    
}
