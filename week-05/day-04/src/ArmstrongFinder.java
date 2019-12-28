import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArmstrongFinder {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(371, 1634, 153, 42));

        for (int i = 0; i < numbers.size(); i++) {
            System.out.printf("The %d is%s an Armstrong number.\n", numbers.get(i), isArmstrongNumber(numbers.get(i)) ? "" : " not");

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

    private static List<Integer> returnDigits(int i) {
        List<Integer> digits = new ArrayList<>();
        for (int j = Integer.toString(i).length() - 1; j >= 0; j--) {
            int divider = (int) Math.pow(10, j);
            digits.add((i / divider));
            i = i % divider;
        }
        return digits;
    }
}
