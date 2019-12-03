import java.util.ArrayList;

public class Candyshop {
    public static void main(String... args) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        // Accidentally we added "2" and "false" to the list.
        // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
        // No, don't just remove the lines
        // Create a method called sweets() which takes the list as a parameter.

        System.out.println(sweets(arrayList));
        // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"
    }

    private static ArrayList<String> sweets(ArrayList<Object> arrayList) {
        ArrayList<String> newArrayList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(2)) {
                newArrayList.add(i, "Croissant");
            } else if (arrayList.get(i).equals(false)) {
                newArrayList.add(i, "Ice cream");
            } else {
                newArrayList.add(i, arrayList.get(i).toString());
            }
        }
        return newArrayList;
    }
}