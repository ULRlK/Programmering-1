
import java.util.Random;






public class Spiller {
    private final String navn;
    public  int sumPoeng = 0;
    public  int antallKast = 0;
    Random die = new Random();
    

    public Spiller(String navn){
        this.navn = navn;
        this.sumPoeng = 0;
        this.antallKast = 0;
        
    }
    public String getNavn() {
        return navn;
    }
    public boolean  erFerdig(){
        return sumPoeng >= 100;
    }
    public int getSumPoeng(){
        return sumPoeng;
    }
    public void kastTerningen(){
        int randomNumber = die.nextInt(6) + 1;
        if (randomNumber == 1){
            sumPoeng = 0;
        }
        else{
            sumPoeng += randomNumber;
        }
        antallKast++;
    }
    
}
