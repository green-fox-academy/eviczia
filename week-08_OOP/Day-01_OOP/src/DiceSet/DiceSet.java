package DiceSet;

import java.util.ArrayList;
import java.util.List;

public class DiceSet {
    ArrayList<Integer> dice = new ArrayList<>();

    public List<Integer> roll() {
        for (int i = 0; i < 6; i++) {
            dice.add((int) (Math.random() * 6) + 1);
        }
        return dice;
    }

    public List<Integer> getCurrent() {
        return dice;
    }

    public int getCurrent(int i) {
        return dice.get(i);
    }

/*    public void reroll() {
        for (int i = 0; i < dice.size(); i++) {
            dice.set(i, (int) (Math.random() * 6) + 1);
        }
    }

    public void reroll(int k) {
        dice.set(k, (int) (Math.random() * 6) + 1);
    }*/

    public void keepSixesReroll() {
        for (int i = 0; i < dice.size(); i++) {
            if (getCurrent(i) < 6) {
                dice.set(i, (int) (Math.random() * 6) + 1);
            } else {
                dice.set(i, 6);
            }
        }
    }

    public int repeatThrowTillAll6() {
        int counter =0;
        for (int i = 0; i < dice.size();) {
            if (getCurrent(i) != 6) {
                keepSixesReroll();
                System.out.println(getCurrent());
                counter ++;
            } else {
                i++;
            }
        } return counter;
    }


    public static void main(String[] args) {
        // You have a `DiceSet` class which has a list for 6 dice
        // You can roll all of them with roll()
        // Check the current rolled numbers with getCurrent()
        // You can reroll with reroll()
        // Your task is to roll the dice until all of the dice are 6

/*        DiceSet diceSet = new DiceSet();
        System.out.println(diceSet.getCurrent());
        System.out.println(diceSet.roll());
        System.out.println(diceSet.getCurrent());
        System.out.println(diceSet.getCurrent(5));
        diceSet.reroll();
        System.out.println(diceSet.getCurrent());
        diceSet.reroll(4);
        System.out.println(diceSet.getCurrent());*/

        DiceSet diceSet1 = new DiceSet();
        System.out.println(diceSet1.roll()); // roll the 6 dice
        int n = diceSet1.repeatThrowTillAll6(); // keep 6es, repeat throws till all are 6es
        System.out.println(n); // n shows the number of repeated throws
        System.out.println(diceSet1.getCurrent()); //show end result

    }
}