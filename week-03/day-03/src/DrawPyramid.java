import java.util.Scanner;

public class DrawPyramid {
    // Write a program that reads a number from the standard input, then draws a
    // pyramid like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //
    // The pyramid should have as many lines as the number was
    public static void main(String[] args) {
        System.out.println("Please enter a whole number!");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        int line = 1;
        while (line <= userInput) {
            int starNr = 1;
            int spaceNr = 1;
            while (spaceNr <= userInput - line) {
                System.out.print(" ");
                    spaceNr ++;
                }
            while (starNr <= (2 * line - 1)) {
                System.out.print("*");
                starNr++;
            }
            System.out.println();
            line ++;
        }
    }
}
