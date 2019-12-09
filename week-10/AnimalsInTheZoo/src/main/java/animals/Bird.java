package main.java.animals;

public class Bird extends Animal implements Oviparous, Flyable{
    public Bird(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return "laying eggs";
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("makes bird sound");
    }

    @Override
    public void move() {

    }
}
