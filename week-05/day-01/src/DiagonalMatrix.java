    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output
public class DiagonalMatrix {
    public static void main(String[] args) {
        int side = 4;
        int[][] diagonal = new int[side][side];
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal.length; j++) {
                diagonal[i][j] = (i==j) ? 1 : 0;
                System.out.print(diagonal[i][j] + " ");
            }
            System.out.println();
        }
    }
}