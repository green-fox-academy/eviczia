import java.util.Arrays;
import java.util.List;

public class Exercise5 {

    public static void main(String[] args) {

//        Write a Stream Expression to get the sum of the odd numbers in the following list:

        List<Integer> numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);

        int oddAdder = 0;

        for (int number : numbers) {
            oddAdder += (number % 2 != 0 ? number : 0);
        }
        System.out.println(oddAdder);

        int addOdds = numbers.stream()
                .filter(n -> n % 2 != 0)
                .reduce(0, (sum, n) -> sum + n);

        System.out.println(addOdds);


    }
}
