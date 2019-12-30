package FishTankDir;

public class Fish {

    private String name;
    private int weight;
    private String color;

    public Fish(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
