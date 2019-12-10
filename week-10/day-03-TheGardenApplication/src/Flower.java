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
    public void beWatered(int waterAmount) {
        setWaterLevel(getWaterLevel() + waterAmount * getAbsorptionLevel());
        if (getWaterLevel() >= getThirstLimit()) {
            setThirsty(false);
        }
    }
}
