public class ParametricAverage {
// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4
    public static void main(String[] args) {
        int a = _PleaseEnterWholeNumber.getUserInput();
        int b = _PleaseEnterWholeNumber.getUserInput();
        int c = _PleaseEnterWholeNumber.getUserInput();
        int d = _PleaseEnterWholeNumber.getUserInput();
        int e = _PleaseEnterWholeNumber.getUserInput();

        int sum = a + b + c + d + e;
        int ave = (sum /  5);
// replace 5 by count
        System.out.println("Sum: " + sum + ", Average: " + ave);

    }

}
