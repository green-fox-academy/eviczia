import java.util.ArrayList;
import java.util.Arrays;

public class Matchmaking {
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // If someone has no pair, he/she should be the element of the list too
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    private static ArrayList<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys) {
        int girlsSize = girls.size();
        int boysSize = boys.size();
        int limit = Math.max(girlsSize, boysSize);

        ArrayList<String> girlsNboys = new ArrayList<>();
        for (int i = 0; i < limit; i++) {
            if (!(i >= girlsSize) & !(i >= boysSize)) {
                girlsNboys.add(girls.get(i));
                girlsNboys.add(boys.get(i));
            } else if (i >= girlsSize) {
                girlsNboys.add(boys.get(i));
            } else {
                girlsNboys.add(girls.get(i));
            }
        }
        return girlsNboys;
    }
}
