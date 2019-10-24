import java.util.Scanner;

public class _PleaseEnterWholeNumber {
    public static int getUserInput() {
        System.out.println("Please enter a whole number!");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
