package main.java.animals;

public class Mammal extends Animal {
    int gestationDays;
    boolean isPredator;

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return "pushing miniature versions out.";
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("making sound");
    }

    @Override
    public void move() {

    }
}
