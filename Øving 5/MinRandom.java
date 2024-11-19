import java.util.Random;


public class MinRandom {
    Random random;

    public MinRandom(Random obj){
        this.random = obj;
    }
    public int nesteHeltall(int nedre, int ovre){
        if (nedre >= ovre){
            throw new IllegalArgumentException("Åpenbart må øvre være større enn nedre");
        }
        int diff = ovre - nedre;
        return this.random.nextInt(diff) + nedre;
    }
    public double nesteDesimaltall(double nedre, double ovre){
        if (nedre >= ovre){
            throw new IllegalArgumentException("Åpenbart må øvre være større enn nedre");
        }
        double diff = ovre - nedre;
        return this.random.nextDouble() * diff + nedre;
    }
    public static void main(String[] args) {
        Random test = new Random();
        MinRandom test1 = new MinRandom(test);

        System.out.println(test1.nesteDesimaltall(5, 10));
        System.out.println(test1.nesteHeltall(1, 10));
        System.out.println(test1.nesteDesimaltall(5, 1));
    }

    
    
}
