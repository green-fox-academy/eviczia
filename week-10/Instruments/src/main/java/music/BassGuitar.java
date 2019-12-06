package main.java.music;

public class BassGuitar extends StringedInstrument{

    public BassGuitar(int numberOfStrings) {
        super(numberOfStrings);
    }

    public BassGuitar(String name) {
        super(name);
        this.numberOfStrings = 4;
    }

    public BassGuitar() {
        this.numberOfStrings = 4;
    }


    @Override
    public String sound() {
        return "Duum-duum-duum";
    }
}
