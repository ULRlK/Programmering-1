import java.util.ArrayList;

public class oppgaveOversikt {
    private ArrayList<Student> studenter;
    private int antStud = 0;

    public oppgaveOversikt(ArrayList<Student> student, int antStud) {
        this.studenter = student;
        this.antStud = antStud;
    }
    public oppgaveOversikt(Student student) {
        this.studenter = new ArrayList<>();
        this.studenter.add(student);
        this.antStud = 1;
    }

    public oppgaveOversikt() {
    }

    public int getAntStud() {
        return this.antStud;
            }

    public int getAntOppgStud(String name) {
        for (Student stud : this.studenter) {
            if (stud.getName().equals(name)) {
                return stud.getAntOppg();
            }
        }
        return -1;
    }
    public void addStud(Student stud) {
        this.studenter.add(stud);
        this.antStud++;
        
    }
    public void okAntOppgStud(String name, int okning) {
        for (Student stud : this.studenter) {
            if (stud.getName().equals(name)) {
                stud.okAntOppg(okning);
            }
        }

    }
    public void printOversikt() {
        for(Student stud : this.studenter) {
            System.out.println(stud.toString());
        }
    }
}
