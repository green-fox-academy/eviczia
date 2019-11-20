package Animal;

import Farm.Farm;

import java.util.ArrayList;
import java.util.List;

public class AnimalMain {
    public static void main(String[] args) {
        Farm myFarmAnimals = initializeAnimals();
        System.out.println(myFarmAnimals.slot);
        assignHungerValues(myFarmAnimals);
        myFarmAnimals.slaughter();
        myFarmAnimals.slaughter();
        myFarmAnimals.slaughter();
        System.out.println(myFarmAnimals.slot);
        myFarmAnimals.breed();
        myFarmAnimals.breed();
        myFarmAnimals.breed();
        myFarmAnimals.breed();
        myFarmAnimals.breed();
        myFarmAnimals.breed();
        System.out.println(myFarmAnimals.slot);


    }

    private static void assignHungerValues(Farm myFarmAnimals) {
        for (int i = 0; i < myFarmAnimals.animals.size() ; i++) {
            myFarmAnimals.animals.get(i).hunger = (int) (Math.random()*100);
        }
    }

    public static Farm initializeAnimals() {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());
        animals.add(new Animal());

        Farm myFarm = new Farm(animals);
        return myFarm;
    }
}
