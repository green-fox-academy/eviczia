import java.lang.reflect.Array;
import java.util.Arrays;

public class SubInt_List {
    public static void main(String[] args) {
        //  Create a function that takes a number and an array of integers as a parameter
        //  Returns the indices of the integers in the array of which the first number is a part of
        //  Or returns an empty array if the number is not part of any of the integers in the array

        //  Example:
        System.out.println(Arrays.toString(eliminateNots(subInt(1, new int[] {1, 11, 34, 52, 61}))));
        //  should print: `[0, 1, 4]`
        System.out.println(Arrays.toString(eliminateNots(subInt(9, new int[] {1, 11, 34, 52, 61}))));
//        System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'
    }

    private static String[] subInt(int i, int[] ints) {
        String iS = Integer.toString(i);
        String[] intsS = new String[ints.length];
        for (int j = 0; j < ints.length; j++) {
            intsS[j] = Integer.toString(ints[j]);
            if (intsS[j].indexOf(iS) == -1) {
                intsS[j] = "not";
            } else {
                intsS[j] = Integer.toString(j);
            }
        }
        return intsS;
    }

    private static String[] eliminateNots(String[] withNot) {
        int counter = 0;
        for (int i = 0; i < withNot.length; i++) {
            if (withNot[i] != "not") {
                counter += 1;
            }
        }
        String[] output = new String[counter];
        for (int i = 0; i < withNot.length; i++) {
            if (withNot[i] != "not") {
                for (int j = 0; j < counter; j++) {
                output[j]= withNot[i];
                }
            }
        }
        return output;
    }
}
