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
    public void status() {
        if (!isThirsty()) {
            System.out.printf("The %s Tree doesn't need water.\n", getColor());
        } else {
            System.out.printf("The %s Tree needs water.\n", getColor());
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
