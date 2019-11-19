package TeacherStudent;

public class TeacherStudentMain {
    public static void main(String[] args) {
        Teacher NoraNeni = new Teacher("Nóra néni");
        Student Bandi = new Student("Bandi");

        Bandi.question(NoraNeni);

        NoraNeni.teach(Bandi);
    }
}
