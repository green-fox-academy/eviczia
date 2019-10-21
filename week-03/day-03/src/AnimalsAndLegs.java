import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        int twoLegged = 2;
        int fourLegged = 4;

        System.out.println("How many chickens does the farmer have?");
        Scanner scanner = new Scanner(System.in);
        int chickenNo = scanner.nextInt();
        System.out.println("How many pigs does the farmer have?");
        int pigNo = scanner.nextInt();

        System.out.println();

        System.out.println("These animals have " + (chickenNo * twoLegged + pigNo * fourLegged) + " legs altogether");



    }
}
