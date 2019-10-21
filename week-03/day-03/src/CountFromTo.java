import java.util.Scanner;

public class CountFromTo {
// Create a program that asks for two numbers
    public static void main(String[] args) {
        System.out.println("Please enter a whole number!");
        Scanner scanner = new Scanner(System.in);
        int firstNr = scanner.nextInt();
        System.out.println("Please enter a second whole number!");
        int secondNr = scanner.nextInt();

        if (secondNr > firstNr) {
            int i = firstNr;
            while (i < secondNr) {
                System.out.println(i);
                i++;
            }
        } else {
            System.out.println("The second number should be bigger");
        }

// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"

//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5


    }
}
