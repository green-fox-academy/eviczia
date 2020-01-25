public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        this.setName("Jane Doe");
        this.setAge(30);
        this.setGender("female");
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
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender == "male" || gender == "female") {
            this.gender = gender;
        }
    }

    public void introduce() {
        System.out.printf("Hi, I'm %s, a %d year old %s.", this.name, this.age, this.gender);
    }

    public void  getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }
}
