// WarApp
//Create a WarApp class with a main method
//Create 2 armadas, fill them with ships
//Have a war!
package Pirates;

public class WarApp {
    public static void main(String[] args) {
        Armada thisArmada = new Armada("This armada");
        Armada thatArmada = new Armada("That armada");

        thisArmada.fillArmada();
        thatArmada.fillArmada();

        thisArmada.war(thatArmada);

    }
}
