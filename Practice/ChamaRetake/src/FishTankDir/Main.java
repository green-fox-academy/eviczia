package FishTankDir;

public class Main {

    public static void main(String[] args) {

        Aquarium dentistsAquarium = new Aquarium();

        dentistsAquarium.addFish(new Clownfish("Nemo", 3, "white", "orange"));
        dentistsAquarium.addFish(new Clownfish("Marlin", 7, "white", "orange"));
        dentistsAquarium.addFish(new Tang("Dory", 5, "blue", true));
        dentistsAquarium.addFish(new Kong("KingKong", 8, "purple"));
        dentistsAquarium.addFish(new Kong("MegaKong", 10, "purple"));

        System.out.println("Before feeding: ");

        dentistsAquarium.getStatus();

        dentistsAquarium.feed();

        dentistsAquarium.removeFish();

        System.out.println("\nAfter feeding: ");
        dentistsAquarium.getStatus();


    }


}
