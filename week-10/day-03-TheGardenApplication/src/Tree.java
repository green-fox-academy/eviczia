public class Tree extends Plant {

    public Tree(String color) {
        super(color);
    }

    public Tree() {
        super();
    }

    public int getThirstLimit() {
        return 10;
    }

    public float getAbsorptionLevel() {
        return 0.4f;
    }



    @Override
    public void beWatered(int waterAmount) {
        setWaterLevel(getWaterLevel() + waterAmount * getAbsorptionLevel());
        if (getWaterLevel() >= getThirstLimit()) {
            setThirsty(false);
        }
    }

}
