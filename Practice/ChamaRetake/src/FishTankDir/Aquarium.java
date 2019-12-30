package FishTankDir;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    public static final int WEIGHT_LIMIT = 11;

    private List<Fish> myAquarium;

    public Aquarium() {
        myAquarium = new ArrayList<>();
    }

    public void addFish(Fish fish) {
        if (fish.getWeight() >= WEIGHT_LIMIT) {
            System.out.println("Fish too big for aquarium");
        } else {
            myAquarium.add(fish);
        }
    }

    public void feed() {
        for (Fish fish : myAquarium) {
            fish.feed();
        }
        removeFish();
    }

    public void removeFish() {
        List<Integer> removeIndexes = new ArrayList<>();
        for (int i = 0; i < myAquarium.size(); i++) {
            if (myAquarium.get(i).getWeight() >= WEIGHT_LIMIT) {
                removeIndexes.add(i - removeIndexes.size());
            }
        }
        for (int i : removeIndexes) {
            System.out.printf("Removed %s from aquarium.\n", myAquarium.get(i).getName());
            myAquarium.remove(i);
        }
    }

    public void getStatus() {
        for (Fish fish : myAquarium) {
            System.out.println(fish.status());
        }
        System.out.println();
    }


}
