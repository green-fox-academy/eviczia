public class Fibonacci {

    public static int fibonacci(int n) throws NotPositiveIntegerException {
        if (n <= 0) {
            throw new NotPositiveIntegerException();
        } else if (n==1) {
            return 0;
        } else if (n==2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
