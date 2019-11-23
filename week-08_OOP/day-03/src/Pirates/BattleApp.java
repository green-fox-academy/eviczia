// BattleApp
//Create a BattleApp class with a main method
//Create 2 ships, fill them with pirates
//Have a battle!
package Pirates;

public class BattleApp {
    public static void main(String[] args) {
        Ship jollyRoger = new Ship("Jolly Roger");
        Ship whydah = new Ship("Whydah");

        jollyRoger.fillShip();
        whydah.fillShip();

        jollyRoger.captain.drinkSomeRum();

        whydah.thePirateCrew.get(0).drinkSomeRum();
        whydah.thePirateCrew.get(0).drinkSomeRum();
        whydah.thePirateCrew.get(0).drinkSomeRum();

        whydah.captain.drinkSomeRum();
        whydah.thePirateCrew.get(3).drinkSomeRum();
        whydah.thePirateCrew.get(0).drinkSomeRum();
        whydah.thePirateCrew.get(4).drinkSomeRum();
        whydah.thePirateCrew.get(0).brawl(jollyRoger.thePirateCrew.get(3));
        System.out.println();
        whydah.thePirateCrew.get(4).passOut();

        jollyRoger.captain.howsItGoingMate();


        jollyRoger.thePirateCrew.get(3).die();

        System.out.println("The captain: " + jollyRoger.captain.toString());
        System.out.println(jollyRoger.toString());

        System.out.println("The captain: " + whydah.captain.toString());
        System.out.println(whydah.toString());

        jollyRoger.battle(whydah);

        System.out.println("The captain: " + jollyRoger.captain.toString());
        System.out.println(jollyRoger.toString());

        System.out.println("The captain: " + whydah.captain.toString());
        System.out.println(whydah.toString());

    }
}
