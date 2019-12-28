import java.util.ArrayList;
import java.util.List;

public class Carrier {

    private List<Aircraft> carrier;
    private int ammoStorage;
    private int healthPoints;

    public Carrier(int ammoStorage, int healthPoints) {
        carrier = new ArrayList<>();
        this.ammoStorage = ammoStorage;
        this.healthPoints = healthPoints;
    }


    public void add(Aircraft aircraft) {
        if (aircraft.isPriority()) {
            carrier.add(0, aircraft);
        } else {
            carrier.add(aircraft);
        }
//        Collections.sort(carrier);
    }

    public int getAircraftCount() {
        int aircraftCounter = 0;
        for (int i = 0; i < this.carrier.size(); i++) {
            aircraftCounter++;
        }
        return aircraftCounter;
    }


    public int getTotalDamage() {
        int carrierDealtDamage = 0;
        for (int i = 0; i < this.carrier.size(); i++) {
            carrierDealtDamage += this.carrier.get(i).getAllDamage();
        }
        return carrierDealtDamage;
    }

    public void fill() throws ZeroAmmoException {
        if (ammoStorage == 0) {
            throw new ZeroAmmoException();
        }

        for (int i = 0; i < carrier.size(); i++) {
            ammoStorage = carrier.get(i).refill(ammoStorage);
        }

    }

    public void fight(Carrier enemy) {
        for (int i = 0; i < this.carrier.size(); i++) {
            int damageCaused = this.carrier.get(i).fight();
            enemy.healthPoints -= damageCaused;
            if (enemy.healthPoints <= 0) {
                enemy.healthPoints = 0;
                System.out.println("It's dead Jim :(");
                break;
            }
        }
    }

    public String getStatus() {
        if (healthPoints == 0) {
            return "It's dead Jim :(";
        } else {
            StringBuilder carrierStatus = new StringBuilder();
            carrierStatus.append("HP: " + this.healthPoints + ", Aircraft count: " + getAircraftCount() + ", Ammo Storage: " + ammoStorage + ", Total damage: " + getTotalDamage() + "\nAircrafts:\n");
            for (int i = 0; i < this.carrier.size(); i++) {
                carrierStatus.append(this.carrier.get(i).getStatus());
            }
            return carrierStatus.toString();
        }
    }
}
