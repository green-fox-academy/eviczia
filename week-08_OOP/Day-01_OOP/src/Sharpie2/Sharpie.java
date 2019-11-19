package Sharpie2;

public class Sharpie {
    String color;
    float width;
    float inkAmount;

    public Sharpie() {
    }

    public Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
        this.inkAmount = 100;
    }

    public void use() {
        this.inkAmount -= 2;
        if (inkAmount <= 0) {
            inkAmount = 0;
        }
    }

    @Override
    public String toString() {
        return (color +  " has " + inkAmount);
    }
}
