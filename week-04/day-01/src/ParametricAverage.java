// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4
public class ParametricAverage {
    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < 5; i++) {
            sum += _PleaseEnterWholeNumber.getUserInput();
            counter++;
        }
        int ave = (sum / counter);
        System.out.println("Sum: " + sum + ", Average: " + ave);
    }
}
