import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        int[] listNumbers = {2, 3, 4, 3, 2, 2, 6, 5, 8, 4, 23};
        System.out.println(Arrays.toString(unique(listNumbers)));
        //  Returns a list of numbers where every number in the list occurs only once
//        int[] unique = unique(listNumbers);
//        Arrays.sort(listNumbers);
//        System.out.println(Arrays.stream(listNumbers));
//        System.out.println(Arrays.binarySearch(listNumbers, 6));
//        System.out.println(Arrays.toString(listNumbers));

        //  Example                                          0   1   2   3   4   5   6  7
        System.out.println(Arrays.toString(unique(new int[] {1, 11, 34, 11, 52, 61,
                1, 34})));
        //  should print: `[1, 11, 34, 52, 61]`

    }
// with the help of Adam Tech htt  ps://www.youtube.com/watch?v=xDKW358fHiQ
    private static int[] unique(int [] listNumbers) {
        // no new array!! modify existing one
        int n = listNumbers.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; ) { // A second loop starting from i+1 ! No incrementing yet!
                if (listNumbers[i] == listNumbers[j]) {
                    for (int k = j; k < n-1; k++) {
                        listNumbers[k] = listNumbers[k+1]; // go through the k loop shortening the length by one
                    }
                    n--; //shorten the array length, go back to j without incrementing see again if equals
                } else {
                    j++; // doesn't equal anyomre, then increment
                }
            }
        }
        int[] newArr = new int[n];
        for (int i = 0; i < n; i++) {
            newArr[i] = listNumbers[i];
        }
        return newArr;
    }
}

