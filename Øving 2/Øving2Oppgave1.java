import java.util.Scanner;

public class Øving2Oppgave1 {
    public static void main(String[] args) {

        int year ;
        try (Scanner getYear = new Scanner(System.in)) {
            System.out.println("Skriv inn ett årstall!");
            year = getYear.nextInt();
            getYear.close();
        }
        catch(Exception f) {
            System.err.println("Du klarte ikke følge en simpel beskjed, året ble derfor 10 :<");
            year = 10;
        }
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " er ett skuddår :)");
            }
            else {
                System.out.println(year + " er ikke ett skuddår :(");
            }
        }
        else{
            if (year % 4 == 0){
                System.out.println(year + " er ett skuddår :)");
                
            }
            else{
                System.out.println(year + " er ikke ett skuddår :(");
            }
        }
         
    }
}
