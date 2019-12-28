//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorio(5));
    }

    private static int factorio(int i) {
        int iFacorial = 1;
        for (int j = 1; j <= i ; j++) {
            iFacorial *= j;
        }
        return iFacorial;
    }
}
