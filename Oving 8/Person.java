public class Person {
    private String fornavn;
    private String etternavn;
    private int fodselsar;

    public Person(String fornavn, String etternavn, int fodselsar) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.fodselsar = fodselsar;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public int getFodselsar() {
        return fodselsar;
    }

    @Override
    public String toString() {
        return "Person {" +
                "fornavn = '" + fornavn + '\'' +
                ", etternavn = '" + etternavn + '\'' +
                ", fodselsar = " + fodselsar +
                '}';
    }
}