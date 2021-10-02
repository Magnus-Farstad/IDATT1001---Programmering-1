public class Tekstanalyse {
    private int[] antallTegn = new int[30];
    private String tekst;

    public Tekstanalyse(String tekst) {
        this.tekst = tekst;
    }

    public void analyse() {
        for(int i = 0; i < tekst.length(); i++) {

            int bokstav = Character.toLowerCase(tekst.charAt(i)) - 97;

            if(0 <= bokstav && bokstav < 26) {
                antallTegn[bokstav] ++;
            } else {

                switch (bokstav) {
                    case 133:
                    bokstav -= 107;
                    antallTegn[bokstav] ++;
                    break;
    
                    case 151:
                    bokstav -= 124;
                    antallTegn[bokstav] ++;
                    break;
    
                    case 132:
                    bokstav -= 104;
                    antallTegn[bokstav] ++;
                    break;
    
                    default:
                    bokstav = 0;
                    antallTegn[29] ++;
    
                }
            }
        }
        for(int i = 0; i < 30; i++) {
            System.out.println(antallTegn[i]);
        }
    }

    public int antallForskjellige() {
        int forskjellige = 0;

        for(int i = 0; i < 29; i++) {
            
            if(antallTegn[i] != 0) {
                forskjellige ++;
            }
        }
        return forskjellige;
    }

    public int totaltAntall() {
        int antall = 0;
        for(int i = 0; i < 29; i++) {
            antall += antallTegn[i]; 
        }
        //antall =- antallTegn[29];
        return antall;
    }

    public double prosent() {
        
        if(antallTegn[29] >= 0) {
            return 0.0;
        } else {

            double percent = (antallTegn[29] / (antallTegn[29] + totaltAntall())) * 100;
            return percent;
        }
    }
    public String toString() {
        return "Hei";
    }
}