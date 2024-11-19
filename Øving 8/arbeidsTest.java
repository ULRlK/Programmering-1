
import java.time.Year;

public class arbeidsTest {
    public static void main(String[] args) {
        Person person = new Person("Ola", "Nordmann", 1990);
        ArbTaker arbTaker = new ArbTaker(person, 12345, 2015, 30000, 25);

        // Test getPerson
        System.out.println(arbTaker.getPerson().getFornavn().equals("Ola"));
        System.out.println(arbTaker.getPerson().getEtternavn().equals("Nordmann"));
        System.out.println(arbTaker.getPerson().getFodselaar() == 1990);

        // Test getArbtakernr
        System.out.println(arbTaker.getArbtakernr() == 12345);

        // Test getAnsettelsesAar
        System.out.println(arbTaker.getAnsettelsesAar() == 2015);

        // Test getMaanedslonn
        System.out.println(arbTaker.getMaanedslonn() == 30000);

        // Test getSkatteprosent
        System.out.println(arbTaker.getSkatteprosent() == 25);

        // Test getNavn
        System.out.println(arbTaker.getNavn().equals("Ola Nordmann"));

        // Test skattPerMaaned
        System.out.println(arbTaker.skattPerMaaned() == 7500);

        // Test getAge
        System.out.println(arbTaker.getAge() == (Year.now().getValue() - 1990));

        // Test getYearsEmployed
        System.out.println(arbTaker.getYearsEmployed() == (Year.now().getValue() - 2015));

        // Test moreThanThreeYearsEmployed
        System.out.println(arbTaker.moreThanxYearsEmployed(3) == (arbTaker.getYearsEmployed() > 3));

        // Test getBruttoLonn
        System.out.println(arbTaker.getBruttoLonn() == (30000 * 11 + 30000 * 0.12 * 11));

        // Test getSkattetrekk
        System.out.println(arbTaker.getSkattetrekk() == (7500 * 10.5));
    }
}