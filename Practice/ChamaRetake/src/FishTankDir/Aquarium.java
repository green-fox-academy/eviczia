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
        for (Fish fish:myAquarium) {
            fish.feed();
        }
    }

    public void removeFish() {
        for (Fish fish:myAquarium) {
            if (fish.getWeight() >= WEIGHT_LIMIT) {
                myAquarium.remove(fish);
            }
        }
    }

    public void getStatus() {
        for (Fish fish:myAquarium) {
            System.out.println(fish.status());

        }


    }


}
