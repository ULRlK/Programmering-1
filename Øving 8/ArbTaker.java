import java.time.Year;


public class ArbTaker {
    Person person;
    int arbtakernr;
    int ansettelsesAar;
    double maanedslonn;
    double skatteprosent;
    

    public ArbTaker(Person person, int arbtakernr, int ansettelsesAar, double maanedslonn, double skatteprosent) {
        this.person = person;
        this.arbtakernr = arbtakernr;
        this.ansettelsesAar = ansettelsesAar;
        this.maanedslonn = maanedslonn;
        this.skatteprosent = skatteprosent;
    }

    public Person getPerson() {
        return person;
    }

    public int getArbtakernr() {
        return arbtakernr;
    }

    public int getAnsettelsesAar() {
        return ansettelsesAar;
    }

    public double getMaanedslonn() {
        return maanedslonn;
    }

    public double getSkatteprosent() {
        return skatteprosent;
    }

    public String getNavn() {
        return person.getFornavn() + " " + person.getEtternavn();
    }

    public double skattPerMaaned() {
        return maanedslonn * skatteprosent / 100;
    }

    public int getAge() {
        return Year.now().getValue() - person.getFodselaar();
    }

    public int getYearsEmployed() {
        return Year.now().getValue() - ansettelsesAar;
    }

    public boolean moreThanxYearsEmployed(int x) {
        return getYearsEmployed() > x;
    }

    public double getBruttoLonn() {
        return maanedslonn * 11 + maanedslonn * 0.12 *11;
    }

    public double getSkattetrekk() {
        return skattPerMaaned() * 10.5;
    }

    public void printAll(){
        System.out.println("Navn: " + this.getNavn());
        System.out.println("Fødselsår: " + this.person.getFodselaar());
        System.out.println("Arbeidstakernummer: " + arbtakernr);
        System.out.println("Ansettelsesår: " + ansettelsesAar);
        System.out.println("Månedslønn: " + maanedslonn);
        System.out.println("Skatteprosent: " + skatteprosent);
        System.out.println("Skatt per måned: " + this.skattPerMaaned());
        System.out.println("Alder: " + this.getAge());
        System.out.println("Antall år ansatt: " + this.getYearsEmployed());
        System.out.println("Bruttolønn: " + this.getBruttoLonn());
        System.out.println("Skattetrekk: " + this.getSkattetrekk());
    }    
}
