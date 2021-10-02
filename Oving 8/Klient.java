import static javax.swing.JOptionPane.*;

public class Klient {
    public static void main(String[] args) {
        ArbTaker person1 = new ArbTaker("Magnus", "Farstad", 1999, 12345, 2015, 30562, 30.5);

        System.out.println(person1.getPersonalia());
        System.out.println(person1.formellNavn());
        System.out.println(person1.getArbTakerNr());
        System.out.println("Du er: " + person1.alder() + " år");
        System.out.println("Skattetrekket per måned er på: " + person1.skattetrekk());
        System.out.println("Skattetrekk per år er på: " + person1.skattetrekkÅr());
        System.out.println("Bruttolønn er på: " + person1.bruttolønn());
        System.out.println("Du har vært ansatt i: " + person1.antallÅrAnsatt() + " år");
        System.out.println(person1.gittAntallÅr(4));

        boolean valg = true;
        while(valg) {
            String endreLest = showInputDialog("Hva vil du endre? \n1: Skatteprosent \n2: Månedslønn \n3: Ansatt lenger enn ... år \n4: Avslutt");
            int endre = Integer.parseInt(endreLest);

            switch(endre) {

                case 1:
                    String nySkattLest = showInputDialog("Hva vil du endre skatteprosenten til?");
                    double nySkatt = Double.parseDouble(nySkattLest);
                    person1.setSkatteprosent(nySkatt);
                    System.out.println("Ny skatteprosent er: " + person1.getSkatteprosent());
                    break;
                case 2:
                    String nyLønnLest = showInputDialog("Hva vil du endre månedslønnen til?");
                    double nyLønn = Double.parseDouble(nyLønnLest);
                    person1.setMånedslønn(nyLønn);
                    System.out.println("Ny månedslønn er: " + person1.getMånedslønn());
                    break;
                case 3:
                    String ansattLengerEnnLest = showInputDialog("Sjekk om du har vært ansatt lenger enn ... år");
                    int ansattLengerEnn = Integer.parseInt(ansattLengerEnnLest);
                    System.out.println(person1.gittAntallÅr(ansattLengerEnn));
                    break;
                case 4:
                    valg = false;
                    break;
                default:
                    showMessageDialog(null,"Velg et gyldig alternativ eller avslutt");
            }
        }
        System.out.println(person1.formellNavn());
        System.out.println("Du er: " + person1.alder() + " år");
        System.out.println("Skattetrekket per måned er på: " + person1.skattetrekk());
        System.out.println("Skattetrekk per år er på: " + person1.skattetrekkÅr());
        System.out.println("Bruttolønn er på: " + person1.bruttolønn());
        System.out.println("Du har vært ansatt i: " + person1.antallÅrAnsatt() + " år");
        System.out.println(person1.gittAntallÅr(4));

    }
}
