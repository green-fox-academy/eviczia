// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output

import java.util.Arrays;

public class DiagonalMatrixSingleForLoop {
    public static void main(String[] args) {
        int side = 4;
        int content = 0;
        int d = 1;
        int[][] diagonal = diagonalMatrix(side, content, d);
        printMatrix(diagonal);
    }

    public static int[][] diagonalMatrix(int side, int content, int d) {
        int[][] matrix = new int[side][side];
        for (int i = 0; i < matrix.length; i++) {
            Arrays.fill(matrix[i], content);
            matrix[i][i] = d;
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
