package FishTankDir;

public class Clownfish extends Fish {

    private String secondColor;


    public Clownfish(String name, int weight, String color, String secondColor) {
        super(name, weight, color);
        this.secondColor = secondColor;
    }


    @Override
    public String status() {
        return super.status() + ", second color: " + secondColor;
    }
}
