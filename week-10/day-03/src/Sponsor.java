public class Sponsor extends Person {

    private String company;
    private int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        hiredStudents = 0;
    }

    public Sponsor() {
        super();
        this.company = "Google";
        hiredStudents = 0;
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, I'm %s, a %d year old %s who represents %s and hired %d students so far.\n", getName(), getAge(), getGender(), company, hiredStudents);
    }

    public void hire() {
        hiredStudents++;
    }

    @Override
    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }
}