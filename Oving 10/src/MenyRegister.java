import java.util.ArrayList;
import java.util.Iterator;

public class MenyRegister {
    private ArrayList<Meny> menyer;

    public MenyRegister() {
        this.menyer = new ArrayList<Meny>();
    }

    public int antallMenyer() { //kunne dette vært en objektvariabel?
        return menyer.size();
    }

    public boolean sjekkRett(int nummer, Rett rett) {
        if(menyer.get(nummer - 1).getRetter().contains(rett)) {
            return true;
        } return false;
    }

    public void kopierRett(int nummer, String navn) {
        if(!sjekkRett(nummer, finnRett(navn))) {
            menyer.get(nummer - 1).nyRett(finnRett(navn));

        }
    }

    public void registrerNyRett(int nummer, Rett rett) {

        if(!sjekkRett(nummer, rett)) {
            menyer.get(nummer - 1).nyRett(rett);

        }
    }

    public void registrerNyMeny(Meny meny) {
        menyer.add(meny);
    }

    public Rett finnRett(String navn) {
        menyer.trimToSize();
        for(int i = 0; i < menyer.size(); i++) {
            for(int u = 0; u < menyer.get(i).antallRetter(); u++) {
                if(menyer.get(i).getRetter().get(u).getNavn().toLowerCase().equals(navn.toLowerCase())) {
                    return menyer.get(i).getRetter().get(u);
                }
            }
        } return null;
    }

    public ArrayList<Rett> finnType(String type) {
        menyer.trimToSize();
        ArrayList<Rett> liste = new ArrayList<Rett>();
        for(int i = 0; i < menyer.size(); i++) {
            for (int u = 0; u < menyer.get(i).antallRetter(); u++) {
                if(menyer.get(i).getRetter().get(u).getType().toLowerCase().equals(type.toLowerCase())) { //kunne dette vært egen metode?
                    liste.add(menyer.get(i).getRetter().get(u));
                }
            }
        } return liste;
    }

    public ArrayList<Meny> finnMenyerIntervall(int nedre, int øvre) {
        ArrayList<Meny> liste = new ArrayList<Meny>();
        for(int i = 0; i < menyer.size(); i++) {
            if(menyer.get(i).getTotalpris() > nedre && menyer.get(i).getTotalpris() < øvre) { //kunne dette vært egen metode?
                liste.add(menyer.get(i));
            }
        } return liste;
    }

    @Override
    public String toString() {
        return "MenyRegister: \n" +
                "Menyer = " + menyer;
    }
}
