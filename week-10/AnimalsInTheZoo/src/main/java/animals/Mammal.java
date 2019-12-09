package main.java.animals;

public class Mammal extends Animal implements FourLegged{
    int gestationDays;
    boolean isPredator;

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return "by pushing miniature versions out.";
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("sleeping");
    }

    @Override
    public void move() {

    }
}
