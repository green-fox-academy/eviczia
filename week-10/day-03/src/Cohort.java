import java.util.ArrayList;
import java.util.List;

public class Cohort {

    private String name;
    private List<Student> students;
    private List<Mentor> mentors;

    public Cohort(String name) {
        this.name = name;
        students = new ArrayList<>();
        mentors = new ArrayList<>();
    }

    private void addStudent(Student newStudent) {
        students.add(newStudent);
    }

    private void addMentor(Mentor newMentor) {
        mentors.add(newMentor);
    }

    private void info() {
        System.out.printf("The %s cohort has %d students and %d mentors.", name, students.size(), mentors.size());
    }


}
