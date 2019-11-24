import java.util.Arrays;

// Maximum finder
//Write a function that finds the largest element of an array using recursion.
public class MaximumFinder {
    public static void main(String[] args) {
        int[] myArray = {2000, 32, 43, 66, 45, 2, 88, 1000, 12, 8, 10, 43};
        int n = myArray.length-1;
        findMax(myArray, n);
        System.out.println(findMax(myArray, n));

    }

    private static int findMax(int[] myArray, int n) {
        if (n == 0) {
            System.out.println(myArray[0]);
            return myArray[0];
        } else {
            System.out.println(Math.max(myArray[n], findMax(myArray, myArray[n-1])));
            return Math.max(myArray[n-1], findMax(myArray, myArray[n]));

        }
    }
}
