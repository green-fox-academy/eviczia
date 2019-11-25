import java.util.Arrays;

// Maximum finder
//Write a function that finds the largest element of an array using recursion.
public class MaximumFinder {
    public static void main(String[] args) {
        int[] myArray = {2000, 32, 43, 6456, 45, 2, 88, 1000, 12, 13, 8, 10, 90};
        int n = myArray.length;
        findnMax(myArray, n);
        System.out.println(findnMax(myArray, n));

    }

    private static int findnMax(int[] myArray, int n) {
        if (n == 1) {
            System.out.println(n);
            return myArray[0];
        } else {
            System.out.println(n);
            return Math.max(myArray[n-1], findnMax(myArray, n-1));
        }
    }
}
