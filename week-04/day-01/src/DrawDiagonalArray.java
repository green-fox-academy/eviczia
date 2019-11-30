public class DrawDiagonalArray {
    public static void main(String[] args) {
        int side = _PleaseEnterWholeNumber.getUserInput();
        int[][] diagonal = new int[side][side];
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                if ((i == 0) | (j == 0) | (i == (side - 1) | (j == (side - 1)) | (i == j))) {
                    diagonal[i][j] = 1;
                } else {
                    diagonal[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                if (diagonal[i][j] == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("%");
                }
            }
            System.out.println();
        }
    }
}