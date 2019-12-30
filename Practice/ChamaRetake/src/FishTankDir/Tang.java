package FishTankDir;

public class Tang extends Fish {

    private boolean suffersShortTermMemoryLoss;


    public Tang(String name, int weight, String color, boolean suffersShortTermMemoryLoss) {
        super(name, weight, color);
        this.suffersShortTermMemoryLoss = suffersShortTermMemoryLoss;
    }


    @Override
    public String status() {
        return super.status() + ", short-term memory loss: " + suffersShortTermMemoryLoss;
    }

}
