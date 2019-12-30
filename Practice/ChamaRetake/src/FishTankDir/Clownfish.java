package FishTankDir;

public class Clownfish extends Fish {

    private String secondColor;


    public Clownfish(int weight, String color, String secondColor) {
        super(weight, color);
        this.secondColor = secondColor;
    }

    @Override
    public void feed() {
        this.setWeight(this.getWeight() + 1);

    }

    @Override
    public String status() {
        return super.status() + ", second color: " + secondColor;
    }
}
