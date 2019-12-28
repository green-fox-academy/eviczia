import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArmstrongFinder {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(371, 1634, 153, 42));

        for (Integer number : numbers) {
            System.out.printf("The %d is%s an Armstrong number.\n", number, isArmstrongNumber(number) ? "" : " not");
        }
    }

    private static boolean isArmstrongNumber(int i) {
        List<Integer> digits = returnDigits(i);
        int sumDigitsPowered = 0;
        for (Integer digit : digits) {
            sumDigitsPowered += Math.pow(digit, Integer.toString(i).length());
        }
        return i == sumDigitsPowered;
    }

    private static List<Integer> returnDigits(int numberToDigits) {
        List<Integer> digits = new ArrayList<>();
        for (int j = Integer.toString(numberToDigits).length() - 1; j >= 0; j--) {
            int divider = (int) Math.pow(10, j);
            digits.add((numberToDigits / divider));
            numberToDigits = numberToDigits % divider;
        }
        return digits;
    }
}
