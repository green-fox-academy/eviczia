import java.util.Arrays;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and an array of integers as a parameter
        int number = 1;
        int wrongNumber = 9;
        int[] array = {1, 11, 34, 52, 61},

        //  Returns the indices of the integers in the array of which the first number is a part of
        System.out.println(subInt(number, array));
        //  Or returns an empty array if the number is not part of any of the integers in the array
        System.out.println(subInt(wrongNumber, array));
        //  Example:
 //       System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
 //       System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'
    }

    private static int[] subInt(int i, int[] ints) {

    }

}
