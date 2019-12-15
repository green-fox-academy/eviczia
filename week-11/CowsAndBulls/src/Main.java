import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CowsAndBulls cowsAndBulls = new CowsAndBulls();

        System.out.println(cowsAndBulls.getNumberToGuess());
        System.out.println(cowsAndBulls.getNumberToGuess());
        System.out.println(cowsAndBulls.getNumberToGuess());

        cowsAndBulls.numberToArray(cowsAndBulls.getNumberToGuess());

        cowsAndBulls.numberToHashMap(cowsAndBulls.getNumberToGuess());

         int[] result = cowsAndBulls.compareNumbers(6756);
        System.out.println(Arrays.toString(result));

    }
}
