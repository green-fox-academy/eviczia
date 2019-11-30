import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubInt_List {
    public static void main(String[] args) {
        //  Create a function that takes a number and an array of integers as a parameter
        //  Returns the indices of the integers in the array of which the first number is a part of
        //  Or returns an empty array if the number is not part of any of the integers in the array

        //  Example:
        System.out.println(Arrays.toString(subInt(1, new int[]{1, 11, 34, 52, 61})));
        //  should print: `[0, 1, 4]`
        System.out.println(Arrays.toString(subInt(9, new int[]{1, 11, 34, 52, 61})));
        //  System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'
    }

    private static int[] subInt(int i, int[] ints) {
        List<Integer> indexOfTrues = new ArrayList<>();
        for (int j = 0; j < ints.length; j++) {
            while (ints[j] >= 1) {
                if (ints[j] % 10 == i) {
                    indexOfTrues.add(j);
                    break;
                } else {
                    ints[j] /= 10;
                }
            }
        }
        int[] indexes = new int[indexOfTrues.size()];
        for (int j = 0; j < indexOfTrues.size(); j++) {
            indexes[j] = indexOfTrues.get(j);
        }
        return indexes;
    }
}


