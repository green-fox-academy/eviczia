package main.java.music;

public abstract class StringedInstrument extends Instruments {

    protected int numberOfStrings;


    public StringedInstrument(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
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
        String stringedInstrument = "";
        if (this instanceof BassGuitar) {
            stringedInstrument = "Bass Guitar";
        } else if (this instanceof ElectricGuitar) {
            stringedInstrument = "Electric Guitar";
        } else if (this instanceof Violin) {
            stringedInstrument = "Violin";
        }
        System.out.printf("%s, a %d-stringed instrument that goes %s\n", stringedInstrument, numberOfStrings, this.sound());
    }
}
