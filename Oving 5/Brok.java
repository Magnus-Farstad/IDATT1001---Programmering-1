public class Brok {
    private int teller;
    private int nevner;

    public Brok(int teller, int nevner) {
        if(nevner == 0) {
            throw new IllegalArgumentException("Nevner kan ikk være lik 0");
        }
        this.teller = teller;
        this.nevner = nevner;
    }
    
    public Brok(int teller) {
        this.teller = teller;
        this.nevner = 1;
    }

    public int getTeller() {
        return teller;
    }

    public int getNevner() {
        return nevner;
    }

    public void add(int a, int b) {
        this.teller = (teller * b) + (a * nevner); 
        this.nevner = nevner * b;
    }

    public void sub(int a, int b) {
        this.teller = (teller * b) - (a * nevner);
        this.nevner = nevner * b;
    }

    public void div(int a, int b){
        this.teller = teller * b;
        this.nevner = nevner * a;
    }
    
    public void mult(int a, int b) {
        this.teller = teller * a;
        this.nevner = nevner * b;
    }

    public String toString(){
        return "Teller: " + teller + "\nNevner: " + nevner;
    }

}


class Brokklient {
    public static void main(String[] args) {
        try {
            Brok brk = new Brok(1, 4);
            Brok brk1 = new Brok(2, 0);
            Brok brk2 = new Brok(3, 5);
            Brok brk3 = new Brok(4, 7);

            //summere
            brk.add(2, 7);
            int teller = brk.getTeller();
            int nevner = brk.getNevner();

            System.out.println("Summert: " + "\n" + teller + "\n" + "--" + "\n" + nevner);
            System.out.println();

            brk1.sub(2, 7);
            int teller1 = brk1.getTeller();
            int nevner1 = brk1.getNevner();

            System.out.println("Subtrahert: " + "\n" + teller1 + "\n" + "--" + "\n" + nevner1);
            System.out.println();
            
            brk2.mult(1, 3);
            int teller2 = brk2.getTeller();
            int nevner2 = brk2.getNevner();

            System.out.println("Multiplisert: " + "\n" + teller2 + "\n" + "--" + "\n" + nevner2);
            System.out.println();
            
            brk3.div(5, 7);
            int teller3 = brk3.getTeller();
            int nevner3 = brk3.getNevner();

            System.out.println("Dividert: " + "\n" + teller3 + "\n" + "--" + "\n" + nevner3);

        } catch(IllegalArgumentException u) {
            System.out.println("Nevner kan ikke være lik 0");
        }
       

    }
}