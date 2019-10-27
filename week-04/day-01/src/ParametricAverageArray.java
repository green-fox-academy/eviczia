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
        double countUsersNrs = usersNrs.length;
        for (int i = 0; i < countUsersNrs; i++) {
            usersNrs[i] = _PleaseEnterWholeNumber.getUserInput();
            sum += usersNrs[i];
        }

        double ave = (sum / countUsersNrs);

        System.out.println("Sum: " + sum + ", Average: " + ave);

    }

}
