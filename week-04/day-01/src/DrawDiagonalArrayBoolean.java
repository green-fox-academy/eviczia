public class DrawDiagonalArrayBoolean {
    // Write a program that reads a number from the standard input, then draws a
    // square like this:
    //
    //
    // %%%%%
    // %%  %
    // % % %
    // %  %%
    // %%%%%
    //
    // The square should have as many lines as the number was
    public static void main(String[] args) {
        int side = _PleaseEnterWholeNumber.getUserInput();
        boolean[][] diagonal = new boolean[side][side];
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                if ((i == 0) | (j == 0) | (i == (side - 1) | (j == (side - 1)) | (i == j))) {
                    diagonal[i][j] = true;
                } else {
                    diagonal[i][j] = false;
                }
            }
        }
            for (int i = 0; i < diagonal.length; i++) {
                for (int j = 0; j < diagonal[i].length; j++) {
                    if (diagonal[i][j]==false) {
                        System.out.print(" ");
                    } else {
                        System.out.print("%");
                    }
                }
                System.out.println();
            }
    }
}