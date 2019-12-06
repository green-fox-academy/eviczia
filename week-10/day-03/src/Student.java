public class Student extends Person {

    private String previousOrganization;
    private int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        skippedDays = 0;
    }

    public Student() {
        super();
        this.previousOrganization = "The School of Life";
        skippedDays = 0;
    }

    public String getPreviousOrganization() {
        return previousOrganization;
    }

    public void setPreviousOrganization(String previousOrganization) {
        this.previousOrganization = previousOrganization;
    }

    public int getSkippedDays() {
        return skippedDays;
    }

    public void setSkippedDays(int skippedDays) {
        if (skippedDays >= 0) {
            this.skippedDays = skippedDays;
        }
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, I'm %s, a %d year old %s from %s who skipped %d days from the course already.\n", getName(), getAge(), getGender(), previousOrganization, skippedDays);
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }



}
