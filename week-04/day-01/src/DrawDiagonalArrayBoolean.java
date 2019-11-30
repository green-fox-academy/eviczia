public class DrawDiagonalArrayBoolean {

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
                if ((diagonal[i][j])) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}