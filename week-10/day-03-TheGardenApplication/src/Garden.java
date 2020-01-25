import java.util.ArrayList;
import java.util.List;

public class Garden {

    private List<Plant> myPlants;

    public Garden() {
        this.myPlants = new ArrayList<>();
    }

    public void addPlant(Plant newPlant) {
        myPlants.add(newPlant);
    }

    public void showGarden() {
        for (int i = 0; i < myPlants.size(); i++) {
            myPlants.get(i).status();
        }
    }

    public int countThirstyPlants() {
        int thirstyPlantCounter = 0;
        for (int i = 0; i < myPlants.size(); i++) {
            if (myPlants.get(i).isThirsty()) {
                thirstyPlantCounter++;
            }
        }
        return thirstyPlantCounter;
    }

    public void waterPlants(int waterAmount) {
        System.out.println("\nWatering with " + waterAmount);
        int plantsToWater = countThirstyPlants();
        if (plantsToWater == 0) return;
        for (int i = 0; i < myPlants.size(); i++) {
            if (myPlants.get(i).isThirsty()) {
                myPlants.get(i).beWatered(waterAmount / plantsToWater);
            }
        }
    }
}
