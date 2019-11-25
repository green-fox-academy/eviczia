import java.util.Arrays;

// Maximum finder
//Write a function that finds the largest element of an array using recursion.
public class MaximumFinder {
    public static void main(String[] args) {
        int[] myArray = {2000, 32, 43, 6456, 45, 2, 88, 1000, 12, 8, 10, 90};
        int n = 0;
        findMax(myArray, n);
        System.out.println(findMax(myArray, n));

    }

    private static int findMax(int[] myArray, int n) {
        int max =0;
        if (n == 0) {
            max = myArray[0];
            System.out.println(max);
            return max;
        } else {
            System.out.println(max);
            max = Math.max(max, findMax(myArray, myArray[n+1]));
            return max;

        }
    }
}
