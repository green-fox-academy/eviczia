import java.util.ArrayList;
import java.util.Arrays;

public class Shopping_list {
    //We are going to represent a shopping list in a list containing strings.//
    public static void main(String[] args) {
        //Create a list with the following items.
        //Eggs, milk, fish, apples, bread and chicken
        ArrayList<String> shoppingList = new ArrayList<>(Arrays.asList("Eggs", "milk", "fish", "apples", "bread", "chicken"));
        //Create an application which solves the following problems.
        //Do we have milk on the list?
        System.out.println(shoppingList.contains("milk"));
        doesContain(shoppingList, "milk");
        //Do we have bananas on the list?
        System.out.println(shoppingList.contains("bananas"));
        doesContain(shoppingList, "bananas");
    }

    public static void doesContain(ArrayList list, String item) {
        String well = "";
        if (list.contains(item)) {
            System.out.println("Yep, it's there");
        } else {
            System.out.println("Nope, it's not there");
        }
        ;
    }
}

