// Armada
//Create an Armada class
//Contains Ship-s as a list
//Have a armada.war(otherArmada) method where two armada can engage in war
//it should work like merge sort
//first ship from the first armada battles the first of the other
//the loser gets skipped so the next ship comes in play from that armada
//whichever armada gets to the end of its ships loses the war
//return true if this is the winner
package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Armada {
    List<Ship> myArmada = new ArrayList<Ship>();
    String name;

    public Armada() {
    }
    public Armada(String name) {
        this.name = name;
    }

    public List<Ship> fillArmada() {
        List<Ship> armadaOfShips = new ArrayList<Ship>();
        for (int i = 0; i < (int)(Math.random()*11 + 4); i++) {
            armadaOfShips.add(i, new Ship("BigBadShip" + i));
        }
        return armadaOfShips;
    }

    public boolean war(List<Ship> otherArmada) {
        int nextOtherShipAtWar = 0;
        for (int i = 0; i < this.myArmada.size();) {
            for (int j = nextOtherShipAtWar; j < otherArmada.size();) {
                this.myArmada.get(i).battle(otherArmada.get(j));
                if (!this.myArmada.get(i).wonBattle & !otherArmada.get(j).wonBattle) {
                    nextOtherShipAtWar++;
                    j++;
                    i++;
                    if (j==otherArmada.size() & i==this.myArmada.size()) {
                        System.out.println("draw");
                        return false;
                    } else if (j==otherArmada.size()) {
                        System.out.println(this.name + " won");
                        return true;
                    } else {
                        System.out.println(this.name + " lost");
                        return false;
                    }
                } else if (this.myArmada.get(i).wonBattle) {
                    nextOtherShipAtWar++;
                    j++;
                    if (j==otherArmada.size()) {
                        System.out.println(this.name + " won");
                        return true;
                    }
                } else {
                    i++;
                    if (i==this.myArmada.size()) {
                        System.out.println(this.name + " won");
                        return true;
                    }
                }
            }
        }
    }
}
