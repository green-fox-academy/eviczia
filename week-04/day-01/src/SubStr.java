import java.util.Scanner;
import java.util.Arrays;

public class SubStr {
    public static void main(String[] args) {
        //  Create a function that takes two strings as a parameter
        System.out.println("Please enter a word!");
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();

        System.out.println("Please enter a second word!");
        scanner = new Scanner(System.in);
        String word2 = scanner.nextLine();

        //  Returns the starting index where the second one is starting in the first one
        //  Returns `-1` if the second string is not in the first one
//  Example:
//  should print: `17`
        System.out.println(subStr("this is what I'm searching in", "searching"));
//  should print: `-1`
        System.out.println(subStr("this is what I'm searching in", "not"));
    }

    public static int subStr(String input, String q) {
        return -1;
    }
}
