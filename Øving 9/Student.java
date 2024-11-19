public class Student {
    private final String navn;
    private int antOppg;

    public Student(String navn, int antOppg){
        this.navn = navn;
        this.antOppg = antOppg;
    }

    public String getName() {
        return this.navn;
    }

    public int getAntOppg() {
        return this.antOppg;
    }

    public void okAntOppg(int okning) {
        this.antOppg += okning;
    }
    @Override
    public String toString() {
        return this.navn + " " + this.antOppg;
    }
}
