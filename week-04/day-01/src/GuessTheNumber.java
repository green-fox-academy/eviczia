// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int storedNr = 14;
        System.out.println("Guess my number!");
        int usersGuess = getUserInput();

        while (!(usersGuess == storedNr)) {
            if (usersGuess < storedNr) {
                System.out.println("The stored number is higher");
            } else {
                System.out.println("The stored number is lower");
            }
            usersGuess = getUserInput();
        }
        System.out.println("You found the number: " + storedNr);
    }

    private static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
