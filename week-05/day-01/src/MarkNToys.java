import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicLong;

public class MarkNToys {

    public static void main(String[] args) {
        int n = 7;
        int k = 50;
        int[] prices = new int[]{1, 12, 5, 111, 200, 1000, 10};
        System.out.println(maxToys(k, prices));
    }

    private static int maxToys(int k, int[] prices) {

        AtomicLong items = new AtomicLong(0);

        Arrays.sort(prices);
        int i = 0;
        int sum = 0;
        while (sum < k) {
            sum += prices[i];
            i++;
        }

        return i-1;


    }
}
