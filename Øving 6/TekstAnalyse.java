
import java.util.Arrays;

public class TekstAnalyse {
    private final int[] tabell = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    private final int[] mestTabell = Arrays.copyOf(tabell, tabell.length - 1);
    private int[] change;
    private final String alphabet = "abcdefghijklmnopqrstuvwxyzæøå";
    int sum;

    public TekstAnalyse(String tekst){
        tekst = tekst.toLowerCase();
        for (int i = 0; i < tekst.length(); i++) {
            change = Arrays.copyOf(tabell, tabell.length);
            for (int k = 0; k < tabell.length - 1; k++) {
                if (tekst.charAt(i) == alphabet.charAt(k)){
                    tabell[k] += 1;
                }   
            }
            if (Arrays.equals(change, tabell)) {
                tabell[29]+=1;
            }
        }
    }
    public String forskjelligeBokstaver(){
        sum = 0;
        for (int i = 0; i < tabell.length - 1; i++) {
            if (tabell[i] != 0){
                sum+=1;
            }
        }
        return "Det er " + sum + " forskjellige bokstaver";
    }
    public String totaltBokstaver(){
        sum = 0;
        for (int i = 0; i < tabell.length - 1; i++){
            sum+= tabell[i];
        }
        return "det er " + sum + " bokstaver";
    }
    public String prosentIkkeBokstaver(){
        sum = 0;
        double ikkeBokstaver = tabell[29];
        for (int i = 0; i < tabell.length; i++){
            sum+= tabell[i];
        }
        ikkeBokstaver = (ikkeBokstaver / sum) * 100;
        return ikkeBokstaver + "% av karakterene er ikke bokstaver";
    }
    public String hvorMange(String letter){
        sum = 0;
        for (int i = 0; i < tabell.length -1; i++) {
            if (alphabet.charAt(i) == letter.charAt(0)){
                sum = tabell[i];
            }
            
        }
        return "Det er " + sum + " " + letter + "er";
    }
    public String forekommerMest(){
        sum = 0;
        String streng = "";
        for (int i = 0; i < tabell.length - 1; i++) {
            if (tabell[i] > sum){
                sum = tabell[i];
            }
        }
        for (int i = 0; i < tabell.length - 1; i++) {
            if (sum == tabell[i]){
                mestTabell[i] = 1;
            }
        }
        for (int i = 0; i < tabell.length - 1; i++) {
            if (mestTabell[i] != 0){
                streng += "Det er " + sum + " " + alphabet.charAt(i) + "-er\n";
            }
        }
        streng += "Det er disse/denne bokstaven som forekommer mest";
        return streng;
    }

    public static void main(String[] args) {
        TekstAnalyse fart = new TekstAnalyse("1aaaabbbcccdesdsaa1234b7");
        System.out.println(fart.totaltBokstaver());
        System.out.println(fart.forskjelligeBokstaver());
        System.out.println(fart.hvorMange("b"));
        System.out.println(fart.prosentIkkeBokstaver());
        System.out.println(fart.forekommerMest());
        
        
        
        
        
    }
}
