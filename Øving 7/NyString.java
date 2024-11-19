
import java.util.Arrays;
import java.util.stream.Collectors;


public class NyString {
    private final String string;

    public NyString(String string){
        this.string = string;
    }
    public String getString(){
        return this.string;
    }
    public String forkortning(){
        String[] list = this.string.split(" ");
        //System.out.println(Arrays.toString(list));
        String result = Arrays.stream(list)
                              .map(word -> String.valueOf(word.charAt(0))) // Hent første bokstav
                              .collect(Collectors.joining()); // Kombiner dem til én streng

        return result;
    }
    public String fjernBokstav(String letter){
        String result = this.string;
        while (result.contains(letter)){
            int i = result.indexOf(letter);
            result = result.substring(0,i) + result.substring(i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        NyString test = new NyString("Pene etterspørsler nevnes ikke siden");
        System.out.println(test.forkortning());
        System.out.println(test.fjernBokstav("n"));
        System.out.println(test.getString());
    }

}
