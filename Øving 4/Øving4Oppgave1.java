
import java.util.Scanner;

public class Øving4Oppgave1 {
    public static void main(String[] args) {

        Valuta dollar = new Valuta("dollar", 10.83);
        Valuta euro = new Valuta("euro", 11.94);
        Valuta sek = new Valuta("sek", 1.05);
        Valuta valuta;
        String valg;
        double belop;
        String poopy = "ja";
        
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                
                System.out.println("Velg valuta!");
                System.out.println("Du kan velge mellom 'dollar', 'euro' og 'sek'");
                valg = scanner.next();
                switch (valg) {
                    case "dollar" -> {
                        valuta = dollar;
                    }
                    case "euro" -> {
                        valuta = euro;
                    }
                    case "sek" -> {
                        valuta = sek;
                    }
                    default -> {
                        System.out.println("Du klarte ikke velge så det ble dollar");
                        valuta = dollar;
                    }
                    
                }
                System.out.println("Vil du regne fra eller til norske kroner?");
                valg = scanner.next();
                System.out.println("Hva er beløpet?");
                belop = scanner.nextDouble();
                switch (valg){
                    case "fra" -> {
                        System.out.println(valuta.fraNok(belop));
                    }
                    case "til" -> {
                        System.out.println(valuta.tilNok(belop));
                    }
                    default -> System.out.println("du er retard");
                }
                System.out.println("Vil du regne ut et nytt beløp? ja/nei");
                valg = scanner.next();
            } while (poopy.equalsIgnoreCase(valg));
        }
    }
}

