public class NumberAdder {
    //Number adder
    //Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
    public static void main(String[] args) {
        int n = 1;
        System.out.println(recursiveAddFunction(n));
    }

    private static int recursiveAddFunction(int n) {
        if (n==0) {
            return  0;
        }
        return n + recursiveAddFunction(n-1);
    }
}
