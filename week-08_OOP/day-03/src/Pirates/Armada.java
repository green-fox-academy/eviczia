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
import java.util.Arrays;
import java.util.List;

public class Armada {
    List<Ship> myArmada = new ArrayList<Ship>();
    String name;

    public Armada() {
    }

    public Armada(String name) {
        this.name = name;
    }

    public void fillArmada() {
        for (int i = 0; i < (int) (Math.random() * 11) + 4; i++) {
            this.myArmada.add(i, new Ship("BigBadShip_" + i));
            this.myArmada.get(i).fillShip();
        }
    }
    public boolean war(Armada otherArmada) {
        int i = this.myArmada.size()-1;
        int j = otherArmada.myArmada.size()-1;
        while (this.myArmada.get(0).wonBattle & otherArmada.myArmada.get(0).wonBattle) {
            if (this.myArmada.get(i).wonBattle & otherArmada.myArmada.get(j).wonBattle) {
                System.out.println("combat: "+ this.name + i + this.myArmada.get(i).wonBattle + " vs " + j + otherArmada.myArmada.get(j).wonBattle);
                this.myArmada.get(i).battle(otherArmada.myArmada.get(j));
            } else if (this.myArmada.get(i).wonBattle) {
                j--;
            } else {
                i--;
            }
        }
        if (!otherArmada.myArmada.get(0).wonBattle & !this.myArmada.get(0).wonBattle) {
            System.out.println("The war could not be decided\n");
            return false;
        } else if (!otherArmada.myArmada.get(0).wonBattle) {
            System.out.println(this.name + " won the war\n");
            return true;
        } else {
            System.out.println(otherArmada.name + " won the war\n");
            return false;
        }
    }

    @Override
    public String toString() {
        String result = "The " + this.name + " ships: \n";
        for(int i = 0; i < this.myArmada.size(); i++) {
            result += (i+1) + ". " + this.name + this.myArmada.get(i).name + " is undefeated: " + this.myArmada.get(i).wonBattle + "\n";
        }
        return result;
    }

}
