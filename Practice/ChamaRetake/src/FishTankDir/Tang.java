package FishTankDir;

public class Tang extends Fish implements Feedable {

    private boolean suffersShortTermMemoryLoss;


    public Tang(int weight, String color, boolean suffersShortTermMemoryLoss) {
        super(weight, color);
        this.suffersShortTermMemoryLoss = suffersShortTermMemoryLoss;
    }

    @Override
    public void feed() {
        this.setWeight(this.getWeight() + 1);

    }
}
