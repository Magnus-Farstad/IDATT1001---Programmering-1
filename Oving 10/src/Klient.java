import static javax.swing.JOptionPane.*;


public class Klient {
    public static void main(String[] args) {
        MenyRegister menyer = new MenyRegister();
        menyer.registrerNyMeny(new Meny(1));
        menyer.registrerNyMeny(new Meny(2));
        menyer.registrerNyRett(1, new Rett("Pizza", "Hovedrett", 145, "Alle kan lage pizza..."));
        menyer.registrerNyRett(2, new Rett("Burger", "Dessert", 200, "Dette er den beste burgeren"));

        showMessageDialog(null, menyer.toString());

        boolean run = true;
        while(run) {
            String valgLest = showInputDialog("Velg hva du vil gjøre. " +
                    "\n1: Registrer en ny rett" +
                    "\n2: Finn en rett med navn " +
                    "\n3: Finn alle retter av en type " +
                    "\n4: Registrer en meny, med retter" +
                    "\n5: Finn alle menyer med totalpris innenfor et intervall" +
                    "\n6: Finn alle retter" +
                    "\n7: Avslutt");
            int valg = Integer.parseInt(valgLest);

            switch(valg) {
                case 1: String nummerLest = showInputDialog("Hvilken meny vil du legge retten til i? Det er " +
                        menyer.antallMenyer() +
                        " menyer å velge mellom");
                        int nummer = Integer.parseInt(nummerLest);

                        String navn = showInputDialog("Hva heter retten?");
                        if(menyer.finnRett(navn) != null) {
                            menyer.kopierRett(nummer, navn);
                        } else {
                            String type = showInputDialog("Hva slags type?");
                            String prisLest = showInputDialog("Hva koster den?");
                            String oppskrift = showInputDialog("Skriv en oppskrift");

                            int pris = Integer.parseInt(prisLest);

                            menyer.registrerNyRett(nummer, new Rett(navn, type, pris, oppskrift));
                            showMessageDialog(null, menyer.toString());
                        }

                        break;

                case 2: String finnNavn = showInputDialog("Hvilken rett vil du finne?");
                        showMessageDialog(null, menyer.finnRett(finnNavn));
                        break;

                case 3: String finnType = showInputDialog("Hvilken type rett vil du finne?");
                        showMessageDialog(null, menyer.finnType(finnType));
                        break;

                case 4: String menyNrLest = showInputDialog("Gi menyen et nummer. Det er foreløpig " + menyer.antallMenyer() + " menyer");
                        int menyNr = Integer.parseInt(menyNrLest);

                        menyer.registrerNyMeny(new Meny(menyNr));
                        String antallNyeRetterLest = showInputDialog("Hvor mange retter vil du legge til?");
                        int antallNyeRetter = Integer.parseInt(antallNyeRetterLest);
                        for(int i = 0; i < antallNyeRetter; i++) {
                            String nyttNavn = showInputDialog("Hva heter retten?");
                            if(menyer.finnRett(nyttNavn) != null) {
                                menyer.kopierRett(menyNr, nyttNavn);
                            } else {

                                String nyType = showInputDialog("Hvilken type rett er det?");
                                String nyPrisLest = showInputDialog("Hva er prisen?");
                                String nyOppskrift = showInputDialog("Skriv en oppskrift");

                                int nyPris = Integer.parseInt(nyPrisLest);
                                menyer.registrerNyRett(menyNr, new Rett(nyttNavn, nyType, nyPris, nyOppskrift));
                        }
                    }

                        break;

                case 5: String nedreGrenseLest = showInputDialog("Skriv inn nedre grense for intervallet");
                        String øvreGrenseLest = showInputDialog("Skriv inn øvre grense for intervallet");

                        int nedreGrense = Integer.parseInt(nedreGrenseLest);
                        int øvreGrense = Integer.parseInt(øvreGrenseLest);

                        showMessageDialog(null, menyer.finnMenyerIntervall(nedreGrense, øvreGrense));
                        break;

                case 6: showMessageDialog(null, menyer.toString());
                        break;
                case 7: run = false;
                        break;
                default: showMessageDialog(null, "Velg et av de 7 valgene");

            }
        }

    }
}
