//  Create the usual class wrapper
//  and main method on your own.
// - Create a function called `factorio`
//   that returns it's input's factorial

import java.util.Scanner;

public class Factorio {

    public static void main(String[] args) {
        System.out.println("Please enter a number!");
        Scanner scanner = new Scanner(System.in);
        int toFact = scanner.nextInt();
        System.out.println(factorio(toFact));
    }

    private static int factorio(int input) {
        int output = 1;
        for (int i = 1; i <= input; i++) {
            output *= i;
        }
        return output;
    }
}
