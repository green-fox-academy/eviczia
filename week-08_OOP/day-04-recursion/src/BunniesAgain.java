public class BunniesAgain {
    //Bunnies again
    //We have bunnies standing in a line, numbered 1, 2, ...
    // The odd bunnies (1, 3, ..) have the normal 2 ears.
    //
    // The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
    // Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

    public static void main(String[] args) {
        int bunnies = 4;
        System.out.printf("%d bunnies have %d floppy ears", bunnies, countBunniesEarsAgain(bunnies));
    }

    private static int countBunniesEarsAgain(int bunnies) {
        if (bunnies == 0) {
            return 0; //no bunnies have no ears
        } else if (bunnies % 2 !=0 ){
            return countBunniesEarsAgain(bunnies - 1) + 2; // it is not a bunny, just a pair of floppy ears
        } else {
            return countBunniesEarsAgain(bunnies - 1) + 3; // it is not a bunny, just an pair and a half of floppy ears
        }
    }
}
