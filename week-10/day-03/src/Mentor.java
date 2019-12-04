public class Mentor extends Person {

    String level;

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor() {
        super();
        level = "intermediate";
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        if (level.equals("junior") || level.equals("intermediate") ||level.equals("senior")) {
            this.level = level;
        }
    }

    @Override
    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm name, a age year old gender level mentor.");
    }
}
