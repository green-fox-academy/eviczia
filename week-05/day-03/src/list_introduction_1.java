import java.util.ArrayList;

public class list_introduction_1 {
    public static void main(String[] args) {
        //Create an empty list which will contain names (strings)
        ArrayList<String> namesList = new ArrayList<>();

        //Print out the number of elements in the list
        System.out.println(namesList.size());

        //Add William to the list
        namesList.add("William");

        //Print out whether the list is empty or not
        System.out.println(namesList.isEmpty());

        //Add John to the list
        namesList.add("John");

        //Add Amanda to the list
        namesList.add("Amanda");

        //Print out the number of elements in the list
        System.out.println(namesList.size());

        //Print out the 3rd element
        System.out.println(namesList.get(2));

        System.out.println();

        //Iterate through the list and print out each name
        for (int i = 0; i < namesList.size(); i++) {
            System.out.println(namesList.get(i));
        }

        System.out.println();

        // Iterate through the list and print
        for (int i = 0; i < namesList.size(); i++) {
            System.out.println((i+1) + ". " + namesList.get(i));
        }

        System.out.println();
        //Remove the 2nd element
        namesList.remove(1);

        System.out.println();

        //Iterate through the list in a reversed order and print out each name
        for (int i = namesList.size()-1; i >= 0; i--) {
            System.out.println(namesList.get(i));
        }
        System.out.println();
        //Remove all elements

        namesList.remove(0);
        System.out.println(namesList.isEmpty());

        namesList.remove(0);
        System.out.println(namesList.isEmpty());






    }
}
