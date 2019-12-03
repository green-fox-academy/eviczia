import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as parameter
        //  Returns a list where the elements are sorted in ascending numerical order
        //  Make a second boolean parameter, if it's `true` sort that list descending

        //  Example:
//        System.out.println(bubble(new int[]{34, 12, 24, 9, 5}));
        //  should print [5, 9, 12, 24, 34]
        System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
        //  should print [34, 24, 12, 9, 5]
    }

    private static String advancedBubble(int[] ints, boolean sortDescending) {
        System.out.println(Arrays.toString(ints));
        int n = ints.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < Math.min(n - i, i+1); j++) {
                int temp = ints[i];
                if (ints[i] < ints[i + j]) {
                    ints[i] = ints[i + j];
                    ints[i + j] = temp;
                    System.out.println("done" + i + (j));
                    System.out.println(Arrays.toString(ints));
                }
            }
        }
        for (int i = 1; i < n; i++) {
            if (ints[i-1] < ints[i]) {
                advancedBubble(ints, true);
            }
        }
        return Arrays.toString(ints);
    }


    private static String bubble(int[] ints) {
        System.out.println(Arrays.toString(ints));
        int n = ints.length;
        for (int i = n - 1; i > 0; i--) {
            for (int j = 1; j <= Math.min(n - i, i); j++) {
                int temp = ints[i];
                if (ints[i] < ints[i - j]) {
                    ints[i] = ints[i - j];
                    ints[i - j] = temp;
                    System.out.println("done" + i + j);
                    System.out.println(Arrays.toString(ints));
                }
            }
        }
        for (int i = n - 1; i > 0; i--) {
            if (ints[i] < ints[i - 1]) {
                bubble(ints);
            }
        }
        return Arrays.toString(ints);
    }
}