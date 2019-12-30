package FishTankDir;

public class Tang extends Fish {

    private boolean suffersShortTermMemoryLoss;


    public Tang(int weight, String color, boolean suffersShortTermMemoryLoss) {
        super(weight, color);
        this.suffersShortTermMemoryLoss = suffersShortTermMemoryLoss;
    }

    @Override
    public void feed() {
        this.setWeight(this.getWeight() + 1);

    }

    @Override
    public String status() {
        return super.status() + ", short-term memory loss: " + suffersShortTermMemoryLoss;
    }

}
