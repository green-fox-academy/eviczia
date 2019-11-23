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
        for (int i = 0; i < (int) (Math.random() * 11 + 4); i++) {
            armadaOfShips.add(i, new Ship("BigBadShip_" + i));
            armadaOfShips.get(i).fillShip();
        }
        return armadaOfShips;
    }
    public boolean war(Armada otherArmada) {
        while (this.myArmada.get(0).wonBattle & otherArmada.myArmada.get(0).wonBattle) {
            this.myArmada.get(myArmada.lastIndexOf(true)).battle(otherArmada.myArmada.get(otherArmada.myArmada.lastIndexOf(true)));
        }
        if (!otherArmada.myArmada.get(0).wonBattle) {
            System.out.println(this.name + " won the war");
            return true;
        } else if (!this.myArmada.get(0).wonBattle) {
            System.out.println(otherArmada.name + " won the war");
            return false;
        } else {
            System.out.println("The war could not be decided");
            return false;
        }
    }

    @Override
    public String toString() {
        String result = "The " + this.name + " ships: \n";
        for(int i = 0; i < this.myArmada.size(); i++) {
            result += (i+1) + ". " + this.myArmada.get(i).name + " was defeated: " + !this.myArmada.get(i).wonBattle + "\n";
        }
        return result;
    }

}
