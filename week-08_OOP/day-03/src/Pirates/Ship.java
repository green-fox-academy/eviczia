// The Pirate Ship
//The place for the Pirates
//
//Create a Ship class.
//The Ship stores Pirate-s instances in a list as the crew and has one captain who is also a Pirate.
//When a ship is created it doesn't have a crew or a captain.
//The ship can be filled with pirates and a captain via fillShip() method.
//Filling the ship with a captain and random number of pirates.
//Ships should be represented in a nice way on command line including information about
//captains consumed rum, state (passed out / died)
//number of alive pirates in the crew
//Ships should have a method to battle other ships: ship.battle(otherShip)
//should return true if the actual ship (this) wins
//the ship should win if its calculated score is higher
//calculate score: Number of Alive pirates in the crew - Number of consumed rum by the captain
//The loser crew has a random number of losses (deaths).
//The winner captain and crew has a party, including a random number of rum :)
package Pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    List<Pirates> thePirateCrew = new ArrayList<Pirates>();
    Pirates captain = new Pirates();
    boolean wonBattle;

    public Ship() {
    }

    public void fillShip() {
        this.captain = new Pirates();
        this.thePirateCrew = new ArrayList<Pirates>();
        for (int i = 0; i < (int) (Math.random()*30) + 5 ; i++) {
            thePirateCrew.add(new Pirates());
        }
    }public int countLivePirates(List<Pirates> thePC) {
        int livePirateCounter = 0;
        for (int i = 0; i < thePC.size(); i++) {
            if (!thePC.get(i).isDead) {
                livePirateCounter ++;
            }
        }
        return livePirateCounter;
    }

    public int calculateScore () {
        int score = 0;
        score = this.countLivePirates(this.thePirateCrew) - this.captain.intoxicationLevel;
        return score;
    }

    public boolean battle(Ship otherShip) {
        if (this.calculateScore() > otherShip.calculateScore()) {
             this.wonBattle = true;
             otherShip.wonBattle = false;
        } else if (this.calculateScore() < otherShip.calculateScore()) {
            this.wonBattle = false;
            otherShip.wonBattle = true;
        }
        this.afterBattle();
        otherShip.afterBattle();
        return this.wonBattle;

    }

    public void afterBattle() {
        if (this.wonBattle) {
            System.out.println(this.captain + " and " + this.thePirateCrew + " won a battle, they may party");
            for (int i = 0; i < 1 + (int) (Math.random() * 4); i++) {
                this.captain.drinkSomeRum();
                for (int i = 0; i < thePirateCrew.size(); i++) {
                    this.thePirateCrew.get(i).drinkSomeRum();
                }
            }
        } else {
            for (int i = 0; i < thePirateCrew.size(); i++) {
                if (!thePirateCrew.get(i).isDead) {
                    if ((int) (Math.random() * 2) == 0) {
                        thePirateCrew.get(i).isDead = true;
                    }
                }
            }
        }
    }


    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i < thePirateCrew.size(); i++) {
            result += (i+1) + ". " + thePirateCrew.get(i) + "\n";
        }
        return result;
    }
}
