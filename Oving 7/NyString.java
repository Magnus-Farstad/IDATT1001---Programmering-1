public class NyString {
    private  String tekst;
    

    public NyString(String string) {
        this.tekst = string;
    }

    public String getTekst() {
        return tekst;
    }

    public String forkort() {
        String[] forkort = tekst.split(" ");

        String forkortet = " ";
        for(int i = 0; i < forkort.length; i++) {
            forkortet += forkort[i].charAt(0); 
        }
        
        return forkortet;
    }

    public String fjern(String a) {
        String[] bokstaver = tekst.split(a);
        //int index = tekst.indexOf(a);
        String fjernet = "";
        for(int i = 0; i < bokstaver.length; i++) {
            fjernet += bokstaver[i];
        }
        return fjernet;
    }

}