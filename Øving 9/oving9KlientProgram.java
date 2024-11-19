
import static javax.swing.JOptionPane.showInputDialog;


public class oving9KlientProgram {
    public static void main(String[] args) {
        Student student1 = new Student("Ola", 5);
        Student student2 = new Student("Kari", 3);
        Student student3 = new Student("Per", 7);
        oppgaveOversikt oversikt = new oppgaveOversikt(student1);
        oversikt.addStud(student2);
        oversikt.addStud(student3);
        oversikt.printOversikt();
        System.out.println(oversikt.getAntOppgStud("Ola"));
        oversikt.okAntOppgStud("Ola", 2);
        oversikt.printOversikt();
        System.out.println(oversikt.getAntOppgStud("Ola"));

        while (true) {
            String navn = showInputDialog("Skriv inn navn på studenten: ");
            if (navn == null) {
                break;
            }
            String antOppg = showInputDialog("Skriv inn antall oppgaver: ");
            if (antOppg == null) {
                break;
            }
            int antOppgInt = Integer.parseInt(antOppg);
            Student student = new Student(navn, antOppgInt);
            oversikt.addStud(student);
            oversikt.printOversikt();
        }
    }
}
