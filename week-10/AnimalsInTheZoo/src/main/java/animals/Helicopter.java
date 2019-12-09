package main.java.animals;

public class Helicopter extends Vehicle implements Flyable {


    @Override
    public void takeOff() {
        System.out.println("Start propellers and lift-off");
    }

    @Override
    public void fly() {
        System.out.println("tak-tak-tak-tak-tak");
    }

    @Override
    public void land() {
        System.out.println("Land, stop propellers");
    }
}
