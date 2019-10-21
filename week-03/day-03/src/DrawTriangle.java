import java.util.Scanner;

public class DrawTriangle {
    // Write a program that reads a number from the standard input, then draws a
    // triangle like this:
    //
    // *
    // **
    // ***
    // ****
    //
    // The triangle should have as many lines as the number was
    public static void main(String[] args) {
        System.out.println("Please enter a whole number!");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int line = 1;
        while (line <= userInput) {
            int starNr = 1;
            while (starNr <= line) {
                System.out.print("*");
                starNr++;
            }
            System.out.println();
            line ++;
        }
    }
 }
