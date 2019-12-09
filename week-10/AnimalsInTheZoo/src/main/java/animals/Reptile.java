package main.java.animals;

public class Reptile extends Animal  implements Oviparous {

    public Reptile(String name) {
        super(name);
    }

    @Override
    public String breed() {
        return "laying eggs";
    }

    @Override
    public void sleep() {

    }

    @Override
    public void makeSound() {
    }

    @Override
    public void move() {

    }

    @Override
    public String layEggs() {
        return null;
    }
}
