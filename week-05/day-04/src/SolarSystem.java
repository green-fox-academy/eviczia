import java.util.ArrayList;
import java.util.Arrays;

public class SolarSystem {
    public static void main(String... args) {
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));

        // Saturn is missing from the planetList
        // Insert it into the correct position
        // Create a method called putSaturn() which has list parameter and returns the correct list.

        System.out.println(putSaturn(planetList));
        // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"
    }

    private static ArrayList<String> putSaturn(ArrayList<String> planetList) {
        if (!(planetList.contains("Saturn"))) {
            planetList.add((planetList.indexOf("Jupiter") + 1), "Saturn");
        }
        return planetList;
    }
}