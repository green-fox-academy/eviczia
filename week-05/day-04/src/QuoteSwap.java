import java.util.ArrayList;
import java.util.Arrays;

public class QuoteSwap {
    public static void main(String... args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        System.out.println(quoteSwap(list));
        // Expected output: "What I cannot create I do not understand."

    }

    private static String quoteSwap(ArrayList<String> list) {
        list.set(2, "cannot");
        list.set(5, "do");
        return print(list);
    }

    private static String print(ArrayList<String> arrayList) {
        StringBuilder listToText = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            listToText.append(arrayList.get(i));
            listToText.append(" ");
        }
        return listToText.toString();
    }
}