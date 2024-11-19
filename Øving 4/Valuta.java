public class Valuta {
    private final String navn;
    private final double kurs;

    public Valuta(String navn, double kurs){
        this.navn = navn;
        this.kurs = kurs;

    }
    public double tilNok(double penger){
        return penger * kurs;
    }

    public double fraNok(double penger){
        return penger / kurs;
    }

    public String getNavn() {
        return navn;
    }
}
