import static javax.swing.JOptionPane.*;

public class Oppgaveoversikt {
    private Student[] studenter;
    private int antStud;

    public Oppgaveoversikt() {
        this.studenter = new Student[1];
        this.antStud = 0;
    }

    public int getAntStud() {
        return antStud;
    }
    public Student[] getStudenter() {
        return studenter;
    }

    public int oppgLost(String a){
        int oppg = 0;
        for(int i = 0; i < antStud; i++) {
            if(sjekk(a) == false) {
                oppg = studenter[i].getAntOppgaver();
            }
        }
        return oppg;
    }

    public boolean sjekk(String a) { //sjekker om navnet eksisterer fra før av
        for(int i = 0; i < antStud; i++) {
            if(a.toLowerCase().equals(studenter[i].getNavn().toLowerCase())) {
                return false;
            }
        }
        return true;
    }

    public void nyStudent(String a, int b) { //hjelpemetode for registrering av student
        if(sjekk(a) == true) {

            registrerStudent(a, b);
        }
    }

    public void registrerStudent(String a, int b) { //registrering av ny student
        for(int u = 0; u < antStud + 1; u++) {
            studenter[antStud] = new Student(a, b);
        }
                
        antStud += 1;
        if(studenter.length == antStud) {
            utvidTabell();
        }

    }

    public void utvidTabell() {
        Student[] nyTabell = new Student[studenter.length + 1];
            for(int i = 0; i < studenter.length; i++) {
                nyTabell[i] = studenter[i];
            }
            
            studenter = nyTabell;
    }

    public int ökAntallOppgaver(String a, int b) {
        int antallOppgaver = 0;
        for(int i = 0; i < antStud; i++) {
            if(sjekk(a) == false) {
                studenter[i].økAntOppgaver(b);
            }
            antallOppgaver = studenter[i].getAntOppgaver();
        }

        return antallOppgaver;
    }

    @Override
    public String toString() {
        String student = "Studenter: ";
        for(int i = 0; i < antStud; i++) {
            student += "\n";
            student += studenter[i].toString();
            student += "\n";
        }
        return student;
    }

    public static void main(String[] args) {
        Oppgaveoversikt a = new Oppgaveoversikt();
        //System.out.println(a.oppgLost(showInputDialog("Skriv navn")));
        a.nyStudent("Magnus", 4);
        a.nyStudent("Simen", 5);

        System.out.println(a.getAntStud());
        System.out.println(a.toString());
    }
}
