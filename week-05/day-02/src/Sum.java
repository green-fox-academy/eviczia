// Write a function called `sum` that returns the sum of numbers from zero to the given parameter

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Please enter a number!");
        Scanner scanner = new Scanner(System.in);
        int sumUpTo = scanner.nextInt();
        System.out.println(sum(sumUpTo));
    }

    private static int sum(int input) {
        int output = 0;
        for (int i = 0; i <= input; i++) {
            output += i;
        }
        return output;
    }
}
