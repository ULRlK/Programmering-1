public class TekstBehandling {
    String tekst;
    
    public TekstBehandling(String tekst){
        this.tekst = tekst;
    }

    public String getTekst(){
        return this.tekst;
    }

    public int antallOrd(){
        return this.tekst.split(" ").length;
    }
    public String bigLetters(){
        return this.tekst.toUpperCase();
    }
    public double ordLengde(){
        String regex = "[\\.\\s+\\?\\!]";
        String[] ordListe = this.tekst.split(regex);
        double bokstav = 0;
        double ord = 0;
        for (String s : ordListe){
            if (!s.isEmpty()){
                bokstav += s.trim().length();
                ord += 1;
            }

        }
    
        bokstav /= ord;
        return bokstav;
    }
    public double setningLengde() {
        String regex = "[\\.\\?\\!]"; // Punktum, spørsmålstegn, utropstegn som setningsskiller
        String[] ordListe = this.tekst.split(regex); // Splitter setninger
    
        double ord = 0;
        int setninger = 0;
    
        for (String s : ordListe) {
            String trimmetSetning = s.trim();
            if (!trimmetSetning.isEmpty()) {  // Ignorerer tomme strenger
                String[] ordArray = trimmetSetning.split("\\s+"); // Splitter ord basert på mellomrom
                ord += ordArray.length;
                setninger++;
            }
        }
    
        return setninger == 0 ? 0 : ord / setninger; // Unngår deling på 0
    }
    public String byttUtOrd(String nyttOrd, String gammeltOrd){
        /*String regex = "[\\.\\s+\\?\\!]";
        String[] ordListe = this.tekst.split(regex);
        String result = "";
        for (int i = 0; i < ordListe.length; i++) {
            if (ordListe[i].equals(gammeltOrd)){
                ordListe[i] = nyttOrd;
            }
        }
        for (String s : ordListe){
            result += s+" ";
        }
        return result;*/
        String regex = "\\b" + gammeltOrd + "\\b"; // Matcher kun hele ordet (unngår å treffe deler av ord)
        return this.tekst.replaceAll(regex, nyttOrd);
    }
    

    public static void main(String[] args) {
        TekstBehandling test = new TekstBehandling("Jeg er dum. Jeg er dum. Jeg er dum.");
        System.out.println(test.ordLengde());
        System.out.println(test.setningLengde());
        System.out.println(test.byttUtOrd("meow", "er"));
        System.out.println(test.antallOrd());
        System.out.println(test.bigLetters());
        System.out.println(test.getTekst());
    }
}
