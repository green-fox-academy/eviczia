// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4

import java.util.Scanner;

public class AverageOfInput {

    public static void main(String[] args) {
        System.out.println("Please enter 5 integers!");
        System.out.println("Press ENTER after each entry!");

        Scanner scanner = new Scanner(System.in);
        int firstNr = scanner.nextInt();
        int secondNr = scanner.nextInt();
        int thirdNr = scanner.nextInt();
        int fourthNr = scanner.nextInt();
        int fifthNr = scanner.nextInt();

        System.out.println("Sum: " + (firstNr + secondNr + thirdNr + fourthNr + fifthNr));
        System.out.println("Average: " + (firstNr + secondNr + thirdNr + fourthNr + fifthNr) / 5.);
    }
}
