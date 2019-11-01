import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        int[] listNumbers = {2, 3, 4, 3, 2, 2, 6, 5, 8, 4, 23};
        //  Returns a list of numbers where every number in the list occurs only once
//        int[] unique = unique(listNumbers);
        Arrays.sort(listNumbers);
        System.out.println(Arrays.stream(listNumbers));
        System.out.println(Arrays.binarySearch(listNumbers, 6));
        System.out.println(Arrays.toString(listNumbers));

        //  Example
//        System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`

    }

/*    private static int[] unique(int[] listNumbers) {
        int duplicateCounter = 0;
        Arrays.sort(listNumbers);
        for (int i = 0; i < listNumbers.length-1; i++) {
            if (listNumbers[i] == listNumbers[i + 1]) {
                duplicateCounter += 1;
            }
        }
        int[] output = new int[listNumbers.length - duplicateCounter];
        for (int i = 0; i < listNumbers.length - duplicateCounter; i++) {
            if (listNumbers[i] == listNumbers[i + 1]) {
                Arrays.
            output[i] = listNumbers[Arrays.binarySearch(listNumbers, )
                duplicateCounter += 1;


                listNumbers[i]
                }

            }*/



}

