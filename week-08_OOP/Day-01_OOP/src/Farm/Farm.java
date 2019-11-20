package Farm;

import Animal.Animal;
import java.util.ArrayList;
import java.util.List;

public class Farm {
    public List<Animal> animals = new ArrayList<>();
    public int slot;

    public Farm(List<Animal> animals) {
        this.animals = animals;
        this.slot = 3;
    }

    public void breed() {
        if (slot > 0) {
            Animal pig = new Animal();
            animals.add(pig);
            slot--;
        }
    }

    public Animal leastHungry() {
        int max = 0;
        Animal leastHungry = new Animal();
        for (int i = 0; i < animals.size(); i++) {
            max = Math.max(animals.get(i).hunger, max);
            if (animals.get(i).hunger == max) {
                leastHungry = animals.get(i);
            }
        }
        return leastHungry;
    }

    public void slaughter() {
       animals.remove(leastHungry());
       slot ++;
    }

//Farm
//Reuse your Animal class
//Create a Farm class
//it has list of Animals
//it has slots which defines the number of free places for animals
//breed() -> creates a new animal if there's place for it
//slaughter() -> removes the least hungry animal


}