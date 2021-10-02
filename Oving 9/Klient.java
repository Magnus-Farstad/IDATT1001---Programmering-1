import static javax.swing.JOptionPane.*;

public class Klient {
    public static void main(String[] args) {
        Oppgaveoversikt oversikt = new Oppgaveoversikt();

        oversikt.registrerStudent("Magnus", 3);

        
        boolean a = true;
        while(a) {

                String valgLest = showInputDialog("Hva ønsker du å gjøre? \n1: Finn antall studenter registrert"
                + "\n2: Registrer ny student \n3: Finn antall oppgaver en student har løst"
                + "\n4: Øk antall oppgaver for en bestemt student \n5: Avslutt");    
                int valg = Integer.parseInt(valgLest);

            switch(valg) {
                case 1: 
                        showMessageDialog(null, "Det er registrert: " + oversikt.getAntStud() +  " studenter." + "\n\n" + oversikt.toString());
                        break;

                case 2: String nyStudentNavn = showInputDialog("Skriv inn navnet på den nye studenten");
                        if(oversikt.sjekk(nyStudentNavn) == false) {
                                showMessageDialog(null, "Studenten eksisterer allerede");
                        }
                        else {
                                String nyStudentOppg = showInputDialog("Hvor mange oppgaver er løst?");
                                int oppgLøst = Integer.parseInt(nyStudentOppg);

                                oversikt.nyStudent(nyStudentNavn, oppgLøst);
                        }
                        break;

                case 3: String navn = showInputDialog("Skriv inn studenten du vil sjekke");
                        if(oversikt.sjekk(navn) == true) {
                                showMessageDialog(null, "Studenten eksisterer ikke");
                        }
                        else {
                                showMessageDialog(null, navn + " har løst " + oversikt.oppgLost(navn));
                        } 
                        break;

                case 4: String navnLest = showInputDialog("Skriv inn studenten");
                        if(oversikt.sjekk(navnLest) == true) {
                                showMessageDialog(null, "Studenten eksisterer ikke");
                        }
                        else {

                                String oppgØk = showInputDialog("Hvor mange oppgaver vil du øke med?");
                                int oppg = Integer.parseInt(oppgØk);
        
                                oversikt.ökAntallOppgaver(navnLest, oppg);
                        }
                        break;

                case 5: a = false;
                        break;

                default: showMessageDialog(null, "Velg en av de fem mulighetene");

            }

        }
    }
}
