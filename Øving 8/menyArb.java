import java.util.Scanner;

public class menyArb {
    public static void main(String[] args) {
        Person person = new Person("Ola", "Nordmann", 1990);
        ArbTaker arbTaker = new ArbTaker(person, 12345, 2015, 30000, 25);
        try (Scanner scanner = new Scanner(System.in)) {
            String input = "0";
            
            while (!input.equals("3")){
                System.out.println("1: Print ut alt om arbeidstaker");
                System.out.println("2: Forandre noe ved arbeidstaker");
                System.out.println("3: Avslutt");
                
                input = scanner.nextLine();
                
                if (input.equals("1")){
                    arbTaker.printAll();
                }
                else if (input.equals("2")){
                    System.out.println("Hva vil du endre?");
                    System.out.println("1: Fornavn");
                    System.out.println("2: Etternavn");
                    System.out.println("3: Fødselsår");
                    System.out.println("4: Ansettelsesår");
                    System.out.println("5: Månedslønn");
                    System.out.println("6: Skatteprosent");
                    int change = scanner.nextInt();
                    
                    switch (change){
                        case 1 -> {
                            System.out.println("Skriv inn nytt fornavn");
                            arbTaker.getPerson().fornavn = scanner.nextLine();
                        }
                        case 2 -> {
                            System.out.println("Skriv inn nytt etternavn");
                            arbTaker.getPerson().etternavn = scanner.nextLine();
                        }
                        case 3 -> {
                            System.out.println("Skriv inn nytt fødselsår");
                            arbTaker.getPerson().fodselaar = scanner.nextInt();
                        }
                        case 4 -> {
                            System.out.println("Skriv inn nytt ansettelsesår");
                            arbTaker.ansettelsesAar = scanner.nextInt();
                        }
                        case 5 -> {
                            System.out.println("Skriv inn ny månedslønn");
                            arbTaker.maanedslonn = scanner.nextInt();
                        }
                        case 6 -> {
                            System.out.println("Skriv inn ny skatteprosent");
                            arbTaker.skatteprosent = scanner.nextInt();
                        }
                        default -> System.out.println("Din retard, skriv et fukcings tall ikke noe annet");
                    }
                }
            }
        }
        System.out.println("Hade bra");
    
    }
}
