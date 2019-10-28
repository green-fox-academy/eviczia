import java.util.Arrays;

public class DiagonalMatrixSingleForLoop {
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
        int[][] diagonal = new int[side][side];
//
        for (int i = 0; i < diagonal.length; i++) {
            Arrays.fill(diagonal[i],0);
            diagonal[i][i] = 1;
        }
        System.out.println(Arrays.toString(diagonal));
    }
}
