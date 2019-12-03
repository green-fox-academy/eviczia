import java.util.ArrayList;
import java.util.Arrays;

public class ElementFinder {
    public static void main(String... args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(containsSeven1(arrayList));
        System.out.println(containsSeven2(arrayList));
        System.out.println(containsSeven3(arrayList));
        System.out.println(containsSeven4(arrayList));
        // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
        // The output should be: "Noooooo"
        // Do this again with a different solution using different list methods!

    }

    private static String containsSeven4(ArrayList<Integer> arrayList) {
        String contains7 = "Noooooo";
        for (Integer element : arrayList) {
            if (element == 7) {
                contains7 = "Hoorray";
            }
        }
        return contains7;
    }

    private static String containsSeven3(ArrayList<Integer> arrayList) {
        String contains7 = "Noooooo";
        if (arrayList.indexOf(7) != -1) {
            contains7 = "Hoorray";
        }
        return contains7;
    }

    private static String containsSeven2(ArrayList<Integer> arrayList) {
        String contains7 = "Noooooo";
        if (arrayList.contains(7)) {
            contains7 = "Hoorray";
        }
        ;
        return contains7;
    }

    private static String containsSeven1(ArrayList<Integer> arrayList) {
        String contains7 = "Noooooo";
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(7)) {
                contains7 = "Hoorray";
            }
        }
        return contains7;
    }
}