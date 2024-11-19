/*
 *Lag et program som skriver ut en del av multiplikasjonstabellen, for eksempel fra 13-15. Da
 *skal utskriften se omtrent slik ut (prikkene skal erstattes med regnestykker)
 */

import java.util.Scanner;

public class Øving3Oppgave1 {
    public static void main(String[] args) {

        int startValue;
        int endValue;
        
        try (Scanner getStartValue = new Scanner(System.in)) {
            System.out.println("Skriv en positiv integer!");
            startValue = getStartValue.nextInt();
            System.out.println("Skriv en positiv integer som er større eller lik den forrige!");
            endValue = getStartValue.nextInt();
            getStartValue.close();
            if (endValue < startValue){
                endValue = startValue + 5;
                System.out.println("Du klarte ikke skrive ett større tall enn det forrige, det ble derfor byttet til et tall 5 større enn det første.");
            }
            System.out.println("----------");
            for (int i = startValue; i <= endValue; i++) {
                for (int g = 0; g <= 10; g++){
                    System.out.println(  i + "*" + g + "=" + i * g);
                }
              }
        }
        catch(Exception f) {
            System.err.println("Du klarte ikke følge en simpel beskjed :<");
        }
      


    }
}
