import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        int[] listNumbers = {2, 3, 4, 3, 2, 2, 6, 5, 8, 4, 23};
        System.out.println(Arrays.toString(unique(listNumbers)));

        System.out.println(Arrays.toString(unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34})));
        //  should print: `[1, 11, 34, 52, 61]`
    }

    private static int[] unique(int[] listNumbers) {
        int n = listNumbers.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; ) {
                if (listNumbers[i] == listNumbers[j]) {
                    for (int k = j; k < n - 1; k++) {
                        listNumbers[k] = listNumbers[k + 1];
                    }
                    n--;
                } else {
                    j++;
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