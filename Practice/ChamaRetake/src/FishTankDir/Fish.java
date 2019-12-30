package FishTankDir;

public class Fish {

    private String name;
    private int weight;
    private String color;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void feed() {
        this.setWeight(this.getWeight() + 1);
    }

    public String status() {
        return name + ", weight: " + weight + ", color: " + color;
    }
}
