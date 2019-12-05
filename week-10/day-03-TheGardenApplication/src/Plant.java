abstract public class Plant {

    private String color;
    private float waterLevel;
    private boolean isThirsty;


    public Plant(String color) {
        this.color = color;
        waterLevel = 0;
        isThirsty = true;
    }

    public Plant() {
        waterLevel = 0;
        isThirsty = true;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(float waterLevel) {
        this.waterLevel = waterLevel;
    }

    public boolean isThirsty() {
        return isThirsty;
    }

    public void setThirsty(boolean thirsty) {
        isThirsty = thirsty;
    }

    public abstract void status();

    public abstract void beWatered(int waterAmount);
}
