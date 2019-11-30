// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] aj = {3, 4, 5, 6, 7};
        int index = 0;
        int temp = 0;

        while (index < (aj.length / 2)) {
            temp = aj[index];
            aj[index] = aj[aj.length - index - 1];
            aj[aj.length - index - 1] = temp;
            index++;
        }
        System.out.println(Arrays.toString(aj));
    }
}
