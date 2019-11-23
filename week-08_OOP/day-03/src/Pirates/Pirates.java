// Create a Pirate class. While you can add other fields and methods, you must have these methods:-
//
//drinkSomeRum() - intoxicates the Pirate some
//howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
//0 to 4 times, "Pour me anudder!"
//else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.
//If you manage to get this far, then you can try to do the following.
//
//die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
//brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3 chance, 1 dies, the other dies or they both pass out.
//And... if you get that far...
//
//Add a parrot.
package Pirates;

public class Pirates {

    boolean isDead;
    boolean isPassedOut;
    int intoxicationLevel;


    public Pirates() {
        this.isDead = false;
        this.isPassedOut = false;
        this.intoxicationLevel = 0;
    }

    public void drinkSomeRum() {
        if (isDead) {
            System.out.println("he's dead");
        } else {
            this.intoxicationLevel ++;
            if (intoxicationLevel >= 4) {
                this.passOut();
            }
        }
    }

    public void howsItGoingMate() {
        if (isDead) {
            System.out.println("he's dead");
        } else if (this.intoxicationLevel <= 4) {
            System.out.println("Pour me anudder!");
            drinkSomeRum();
            this.intoxicationLevel++;
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            passOut();
        }
    }

    public void passOut() {
        this.isPassedOut = true;
    }

    public void die() {
        this.isDead = true;
    }

    @Override
    public String toString() {
        if (!isDead & !isPassedOut) {
            return "pirate is alive and well (intoxication level " + this.intoxicationLevel + "/4)";
        } else if (isPassedOut) {
            return "pirate passed out (had too much rum)";
        } else return "pirate died";
    }
}
