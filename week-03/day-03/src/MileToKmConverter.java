// Write a program that asks for a double that is a distance in miles,
// then it converts that value to kilometers and prints it

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        System.out.println("How many miles did you walk yesterday?");
        Scanner scanner = new Scanner(System.in);
        Double walkedMiles = scanner.nextDouble();
        // 1 mile = 1.609344 kilometers

        System.out.println("You walked " + (walkedMiles * 1.61) + " km yesterday!");

    }
}
