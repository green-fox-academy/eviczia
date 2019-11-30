import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number!");
        double firstNr = scanner.nextDouble();
        System.out.println("Please enter another number!");
        double secondNr = scanner.nextDouble();

        if (firstNr > secondNr) {
            System.out.println(firstNr + " is bigger.");
        } else if (secondNr > firstNr) {
            System.out.println(secondNr + " is bigger.");
        }
    }

}
