import java.util.ArrayList;
import java.util.Arrays;

public class List_introduction_2 {
    public static void main(String[] args) {

    //Create a list ('List A') which contains the following values
        ArrayList<String> List_A = new ArrayList<>();
    //Apple, Avocado, Blueberries, Durian, Lychee
        List_A.add("Apple");
        List_A.add("Avocado");
        List_A.add("Blueberries");
        List_A.add("Durian");
        List_A.add("Lychee");
    //Create a new list ('List B') with the values of List A
        ArrayList<String> List_B = new ArrayList<>();
        List_B.addAll(List_A);
    //Print out whether List A contains Durian or not
        System.out.println(List_A.contains("Durian"));
    //Remove Durian from List B
        List_B.remove(3);
    //Add Kiwifruit to List A after the 4th element
        List_A.add(4, "Kiwifruit");
    //Compare the size of List A and List B
        if (List_A.size() == List_B.size()) {
            System.out.println("equal size arrays");
        } else if (List_A.size() > List_B.size()) {
            System.out.println("List_A is bigger");
        } else {
            System.out.println("List_B is bigger");
        }
    //Get the index of Avocado from List A
        System.out.println("index of Avocado is " + List_A.indexOf("Avocado"));
    //Get the index of Durian from List B
        System.out.println("index of Durian is " + List_B.indexOf("Durian"));
    //Add Passion Fruit and Pomelo to List B in a single statement
        List_B.addAll(Arrays.asList("Passion Fruit", "Pomelo"));
    //Print out the 3rd element from List A


        System.out.println();
        System.out.println(List_A);
        System.out.println(List_B);
    }
}
