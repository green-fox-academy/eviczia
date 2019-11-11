import java.util.Scanner;

public class DivideByZero {

    public static void main(String[] args) {
// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0
        Scanner scanner = new Scanner(System.in);
        int divisor = scanner.nextInt();
        System.out.println(divide10(divisor));
    }

    private static int divide10(int divisor) {
        int inTen=10;
        try {
          inTen = 10 / divisor;
        } catch (ArithmeticException exception) {
            System.out.println("fail");
        }
        return inTen;
    }
}
