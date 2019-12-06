package main.java.music;

public abstract class Instruments {
    protected String name;

    public Instruments(String name) {
        this.name = name;
    }

    public Instruments() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void play();

    public abstract String sound();

}
