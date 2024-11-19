/*
    Skriv et program som finner ut om et tall er et primtall. Et primtall er et tall som kun kan deles
    med 1 og med seg selv uten å få rest. Les inn tallet fra brukeren og la programmet repetere
    slik at flere tall kan analyseres.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Øving3Oppgave2 {
    public static void main(String[] args) {

        boolean start = true;
        int tempPrime;
        ArrayList<Integer> primesList = new ArrayList<>();
        
        try (Scanner getPrimes = new Scanner(System.in)){
            System.out.println("Input så mange positive integer du vil som er over 2, for å avslutte input delen, input '0'");
            while (start == true){
                
                tempPrime = getPrimes.nextInt();
                if (tempPrime == 0){
                    start = false;
                    getPrimes.close();
                }
                else if (tempPrime <= 2){
                    System.out.println("Det var en enkel instruks, du er skuffende.");
            
                }
                else{
                    primesList.add(tempPrime);
                }
            }
            
        } catch (Exception e) {
            System.out.println("Du skuffer meg noe indelig");
            
        }
        System.out.println("\n");
        System.out.println("--------");

        int size = primesList.size();
        //System.out.println(size +"Lengde på liste");
        for (int i = 0; i < (size); i++){
            //System.out.println(i + "dette er verdien til i");
            boolean primeCheck = false;
            for (int g = 2; g <= (primesList.get(i))-1; g++){
                //System.out.println(primesList.get(i) % g + "Utregning");
                if (primesList.get(i) % g == 0){
                    primeCheck = true;
                    
                }
                
            }
            if (primeCheck == false){
                System.out.println(primesList.get(i) + " Er ett primtall :)");
                System.out.println("--------");
            }
            else{
                System.out.println(primesList.get(i) + " Er ikke ett primtall :(");
                System.out.println("--------");
            }
            
            
        }
    }
}
