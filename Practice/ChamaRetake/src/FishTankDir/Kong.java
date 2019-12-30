package FishTankDir;

public class Kong extends Fish implements Feedable {


    public Kong(int weight, String color) {
        super(weight, color);
    }

    @Override
    public void feed() {
        this.setWeight(this.getWeight() + 2);

    }
}
