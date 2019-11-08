import java.util.Arrays;

public class UniqueForDemo {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        System.out.println(Arrays.toString(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34})));
        //  should print: `[1, 11, 34, 52, 61]`
    }

// with the help of Adam Tech https://www.youtube.com/watch?v=xDKW358fHiQ
    private static int[] unique(int [] listNumbers) {
        int n = listNumbers.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; ) {
                if (listNumbers[i] == listNumbers[j]) {
                    for (int k = j; k < n-1; k++) {
                        listNumbers[k] = listNumbers[k+1];
                    }
//                    listNumbers[n-1]=0; not necessary, but this would fill up the end of listnumbers with zero,
//                                        to make the change more obvious
                    n--; // decrease n by one after each overwriting
                } else {
                    j++; // doesn't equal anymore, then increment
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