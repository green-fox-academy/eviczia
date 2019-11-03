import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Personal_finance {
    //We are going to represent our expenses in a list containing integers.

    public static void main(String[] args) {

    //Create a list with the following items.
    //500, 1000, 1250, 175, 800 and 120
        ArrayList<Integer> spent = new ArrayList<>();
        spent.addAll(Arrays.asList(500, 1000, 1250, 175, 800, 120));
        System.out.println(spent);

    // Create an application which solves the following problems.
        int weSpent = 0;
        int mostExp = 0;
        int cheapest = spent.get(0);
        for (int item : spent) {
            weSpent += item;
            if (item > mostExp) {
                mostExp = item;
            } else if (item < cheapest) {
                cheapest = item;
            }
        }
        int average = weSpent / spent.size();

        //How much did we spend?
        System.out.println(weSpent);
        System.out.println();

        //Which was our greatest expense?
        System.out.println(mostExp);
        System.out.println(Collections.max(spent));
        System.out.println();

        //Which was our cheapest spending?
        System.out.println(cheapest);
        System.out.println(Collections.min(spent));
        System.out.println();

        //What was the average amount of our spendings?
        System.out.println(average);
    }
}
