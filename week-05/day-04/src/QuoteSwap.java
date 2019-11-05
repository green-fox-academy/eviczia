import java.lang.reflect.Array;
import java.util.*;

public class QuoteSwap{
    public static void main(String... args){
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
        String quoteCorrect = list.toString();
        int doAt = list.indexOf("do");
        int cannotAt =list.indexOf("cannot");
        String temp = list.get(doAt);
        list.set(doAt, list.get(cannotAt));
        list.set(cannotAt, temp);
        return quoteCorrect;
    }
}