public class ParametricAverageArray {
// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4
    public static void main(String[] args) {
        int sum = 0;
        int[] usersNrs = new int[5];
        for (int i = 0; i < usersNrs.length; i++) {
            usersNrs[i] = _PleaseEnterWholeNumber.getUserInput();
            sum = sum + usersNrs[i];
        }

        int ave = (sum /  usersNrs.length);

        System.out.println("Sum: " + sum + ", Average: " + ave);

    }

}
