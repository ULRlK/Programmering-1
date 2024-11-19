public class Øving1Oppgave3 {
    public static void main(String[] args) {
        int totSec = 194636;

        int hours = (totSec - (totSec % 3600)) / 3600;

        int minutes = ((totSec % 3600) - ((totSec % 3600) % 60)) / 60;

        int seconds = (totSec % 3600) % 60;

        System.out.println(hours + "t, " +  minutes + "min, " + seconds + "sek");


    }
}
