public class Plant {

    private String color;
    private int waterLevel;

    public Plant(String color, int waterLevel) {
        this.color = color;
        waterLevel = 0;
    }

    public Plant() {
        waterLevel = 0;
    }

    public void water(int waterAmount) {
        waterLevel += waterAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(int waterLevel) {
        this.waterLevel = waterLevel;
    }
}
