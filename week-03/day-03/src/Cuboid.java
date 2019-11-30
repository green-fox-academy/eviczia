import java.util.Scanner;

public class Cuboid {
// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//// Surface Area: 600
// Volume: 1000

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Please enter size of side a: ");
        double a = scanner.nextDouble();
        System.out.println("a = " + a);

        System.out.println();
        System.out.println("Please enter size of side b: ");
        double b = scanner.nextDouble();
        System.out.println("b = " + b);

        System.out.println();
        System.out.println("Please enter size of side c: ");
        double c = scanner.nextDouble();
        System.out.println("c = " + c);

        System.out.println("Surface Area: " + (2 * (a * b) + (a * c) + (b * c)));
        System.out.println("Volume: " + (a * b * c));

    }
}

