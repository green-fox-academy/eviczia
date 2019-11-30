import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Please enter a whole number!");
        Scanner scanner = new Scanner(System.in);
        int mplyBy = scanner.nextInt();
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println(i + " * " + mplyBy + " = " + (i * mplyBy));
        }
    }
}

