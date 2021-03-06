public class DrawSquare {
    // Write a program that reads a number from the standard input, then draws a
    // square like this:
    //
    //
    // %%%%%%
    // %    %
    // %    %
    // %    %
    // %    %
    // %%%%%%
    //
    // The square should have as many lines as the number was
    public static void main(String[] args) {
        int userInput = _PleaseEnterWholeNumber.getUserInput();
        drawHorizontal(userInput);
        drawVerticals(userInput);
        drawHorizontal(userInput);
    }

    private static void drawHorizontal(int limit) {
        for (int j = 0; j < limit; j++) {
            System.out.print("%");
        }
        System.out.println();
    }

    private static void drawVerticals(int limit) {
        for (int line = 2; line < limit; line++) {
            System.out.print("%");
            int spaceNr = 1;
            while ((spaceNr >= 1) & (spaceNr < limit - 1)) {
                System.out.print(" ");
                spaceNr++;
            }
            System.out.println("%");
        }
    }
}

