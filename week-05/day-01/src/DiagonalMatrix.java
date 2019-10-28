public class DiagonalMatrix {
    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output
    public static void main(String[] args) {
        int side = 4;
        byte[][] diagonal = new byte [side][side];
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal.length; j++) {
                if (i==j) {
                    diagonal[i][j] = 1;
                } else {
                    diagonal[i][j] = 0;
                }
                System.out.print(diagonal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
