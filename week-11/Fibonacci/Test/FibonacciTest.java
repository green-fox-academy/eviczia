import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void fibonacci_InputFibonacciN_ReturnSumOfPreviousTwo() throws NotPositiveIntegerException {
        int[] actual = new int[9];
        for (int i = 0; i < 9; i++) {
            actual[i] = Fibonacci.fibonacci(i + 1);
        }
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21};
        assertArrayEquals(expected, actual);
    }

    @Test(expected = NotPositiveIntegerException.class)
    public void fibonacci_InputNotPositive_ReturnSumOfPreviousTwo() throws NotPositiveIntegerException {
        Fibonacci.fibonacci(0);
        Fibonacci.fibonacci(-10);
    }
}