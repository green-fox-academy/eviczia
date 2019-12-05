public class Flower extends Plant {

    public Flower(String color) {
        super(color);
    }

    public Flower() {
    }

    public int getThirstLimit() {
        return 5;
    }

    public float getAbsorptionLevel() {
        return 0.75f;
    }

    @Override
    public void status() {
        if (!isThirsty()) {
            System.out.printf("The %s Flower doesn't need water.\n", getColor());
        } else {
            System.out.printf("The %s Flower needs water.\n", getColor());
        }
    }

    @Override
    public void beWatered(int waterAmount) {
        setWaterLevel(getWaterLevel() + waterAmount * getAbsorptionLevel());
        if (getWaterLevel() >= getThirstLimit()) {
            setThirsty(false);
        }
    }
}
