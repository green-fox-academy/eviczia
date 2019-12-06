package main.java.music;

public abstract class StringedInstrument extends Instruments {

    protected int numberOfStrings;

/*    public StringedInstrument(String name, int numberOfStrings) {
        super(name);
        this.numberOfStrings = numberOfStrings;
    }*/

    public StringedInstrument(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public StringedInstrument(String name) {
        super(name);
    }

    public StringedInstrument() {
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public abstract String sound();

    public void play() {
        System.out.println("Play");
        System.out.printf("%s, a %d-stringed instrument that goes %s\n", getName(), numberOfStrings, this.sound());
    }



}
