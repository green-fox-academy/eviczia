public class Bunnies {
    //Bunnies
    //We have a number of bunnies and each bunny has two big floppy ears.
    //We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
    public static void main(String[] args) {
        int bunnies = 30;
        System.out.printf("%d bunnies have %d floppy ears", bunnies, countBunniesEars(bunnies));
    }

    private static int countBunniesEars(int bunnies) {
        if (bunnies == 0) {
            return 0; //no bunnies have no ears
        } else {
            return countBunniesEars(bunnies-1)+2; // it is not a bunny, just a pair of floppy ears
        }
    }
}
