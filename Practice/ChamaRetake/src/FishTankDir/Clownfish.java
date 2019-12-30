package FishTankDir;

public class Clownfish extends Fish implements Feedable {

    private String secondColor;


    public Clownfish(int weight, String color, String secondColor) {
        super(weight, color);
        this.secondColor = secondColor;
    }

    @Override
    public void feed() {
        this.setWeight(this.getWeight() + 1);

    }
}
