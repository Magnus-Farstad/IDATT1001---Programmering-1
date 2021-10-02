import java.util.ArrayList;
import java.util.Iterator;
import static javax.swing.JOptionPane.*;

public class Meny {
    private ArrayList<Rett> retter;
    private int nummer;
    private double totalpris;

    public Meny(int nummer) {
        this.retter = new ArrayList<Rett>();
        this.nummer = nummer;
        this.totalpris = 0;
    }

    public ArrayList<Rett> getRetter() {
        return retter;
    }

    public double getTotalpris() {
        return totalpris;
    }

    /*public boolean sjekkRett(Rett rett) {
        Iterator<Rett> iterator = retter.iterator();
        while(iterator.hasNext()) {
            Rett a = iterator.next();
            if(a.getNavn().toLowerCase().equals(rett.getNavn().toLowerCase())) {
                return false;
            }
        } return true;
    }*/


    public void nyRett(Rett rett) {
        retter.trimToSize();
        retter.add(rett);
        totalpris += rett.getPris();
        /*if(sjekkRett(rett)) {
            retter.add(rett);
            totalpris += rett.getPris();
        }*/ //else throw new IllegalArgumentException("Denne retten eksisterer allerede"); trenger jeg dette?
    }

    public int antallRetter() {
        return retter.size();
    }

    @Override
    public String toString() {
        return "Meny: " + nummer + "\n" +
                retter +
                "\n\nMenypris = " + totalpris + "\n\n";
    }

    public static void main(String[] args) {
        Meny dishes = new Meny(3);
        dishes.nyRett(new Rett("Suppe", "Forrett", 75.9, "En dl melk, to ss soya, en dæsj salt og en neve med magnet"));
        dishes.nyRett(new Rett("Burger", "Hovedrett", 120.9, "Hemmelig oppskrift ;)"));

        showMessageDialog(null, dishes.toString());

    }
}
