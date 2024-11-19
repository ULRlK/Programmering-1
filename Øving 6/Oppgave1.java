import java.util.Random;
public class Oppgave1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] antall = {0,0,0,0,0,0,0,0,0,0};
        int tall;
        String test;

        for (int i = 0; i < 100; i++) {
            tall = random.nextInt(10);
            antall[tall] += 1;
        }
        for (int i = 0; i < 10; i++) {
            test = "";
            for (int k = 0; k < ((antall[i] + 5) /10); k++) {
                test += "*";
            }
            System.out.println(i + "   " + antall[i] + "   " + test);
            

        }
    }
}
