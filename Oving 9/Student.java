public class Student {
    private String navn;
    private int antOppgaver;

    public Student(String navn, int antOppgaver) {
        this.navn = navn;
        this.antOppgaver = antOppgaver;
    }

    public String getNavn() {
        return navn;
    }

    public int getAntOppgaver() {
        return antOppgaver;
    }

    public void økAntOppgaver(int økning) {
        antOppgaver += økning;
    }

    public String toString() {
        return "Navn: " + navn + "\nAntall oppgaver: " + antOppgaver;
    }

    public static void main(String[] args) {
        Student student = new Student("Magnus", 4);
        System.out.println(student.getAntOppgaver());
    }
}