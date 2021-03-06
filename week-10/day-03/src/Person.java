public class Person implements Cloneable{

    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 & age < 100) {
            this.age = age;
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.equals("female") || gender.equals("male")) {
            this.gender = gender;
        }
    }

    public void introduce() {
        System.out.printf("Hi, I'm %s, a %d year old %s.\n", name, age, gender);
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("cloning in process");
        return super.clone();
    }

}
