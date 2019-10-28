import java.util.Arrays;

public class Reverse {
// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`
    public static void main(String[] args) {
        int[] aj = {3, 4, 5, 6, 7};

        for (int i = 0; i > aj.length ; i++) {
            for (int j = aj.length; j < 0; --j) {
                int temp = aj[i] ;
                aj[i]= aj[j];
                aj[j] = temp;
            }
        }
        System.out.println(Arrays.toString(aj));
    }
}
