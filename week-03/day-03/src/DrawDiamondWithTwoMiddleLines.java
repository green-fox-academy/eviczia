public class DrawDiamondWithTwoMiddleLines {
    public static void main(String[] args) {
        int userInput = _PleaseEnterWholeNumber.getUserInput();
        if (!((userInput % 2) == 0)) {
            int line = 1;
            while (line <= ((userInput + 1) / 2)) {
                int starNr = 1;
                int spaceNr = 1;
                while (spaceNr <= ((userInput + 1) / 2) - line) {
                    System.out.print(" ");
                    spaceNr++;
                }
                while (starNr <= (2 * line - 1)) {
                    System.out.print("*");
                    starNr++;
                }
                System.out.println();
                line++;
            }
            while (line <= userInput) {
                int starNr = 1;
                int spaceNr = 1;
                while (spaceNr <= (line - (userInput + 1) / 2)) {
                    System.out.print(" ");
                    spaceNr++;
                }
                while (starNr <= (2 * (userInput - line) + 1)) {
                    System.out.print("*");
                    starNr++;
                }
                System.out.println();
                line++;
            }
        } else {
            int line = 1;
            while (line <= ((userInput + 1) / 2)) {
                int starNr = 1;
                int spaceNr = 1;
                while (spaceNr <= ((userInput + 1) / 2) - line) {
                    System.out.print(" ");
                    spaceNr++;
                }
                while (starNr <= (2 * line - 1)) {
                    System.out.print("*");
                    starNr++;
                }
                System.out.println();
                line++;
            }
            while (line <= userInput) {
                int starNr = 1;
                int spaceNr = 1;
                while (spaceNr < (line - (userInput + 1) / 2)) {
                    System.out.print(" ");
                    spaceNr++;
                }
                while (starNr <= (2 * (userInput - line) + 1)) {
                    System.out.print("*");
                    starNr++;
                }
                System.out.println();
                line++;
            }
        }
    }
}
