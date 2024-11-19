import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

public class Øving2Oppgave2 {
    public static void main(String[] args) {
        Map.Entry<Double, Double> MerkeA = new AbstractMap.SimpleEntry<>(0.45, 35.90);
        Map.Entry<Double, Double> MerkeB = new AbstractMap.SimpleEntry<>(0.5, 39.50);
        System.out.println(MerkeA);
        System.out.println(MerkeB);
        Double kgPrisA = MerkeA.getValue() / MerkeA.getKey();
        Double kgPrisB = MerkeB.getValue() / MerkeB.getKey();

        System.out.println("Merke A har en kg pris på " + kgPrisA + " kroner");
        System.out.println("Merke B har en kg pris på " + kgPrisB + " kroner");
        
         
        if (Objects.equals(kgPrisA, kgPrisB)){
            System.out.println("Merke A og Merka B har lik kg pris.");
        }
        else if (kgPrisA > kgPrisB){
            System.out.println("Merke B er billigere enn merke A");
        }
        else {
            System.out.println("Merke A er billigere enn merke B");
        }

    }
}
