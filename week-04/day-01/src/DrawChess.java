public class DrawChess {
    // Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//
    public static void main(String[] args) {
        String[][] chessTable = new String[8][8];
        for (int i = 0; i < chessTable.length; i++) {
            for (int j = 0; j < chessTable.length; j++) {
                if (((i % 2) == 0 & (j % 2) == 0) |
                                (((i % 2) != 0) & ((j % 2) != 0))) {
                    chessTable[i][j] = "%";
                } else {
                    chessTable[i][j] = " ";
                }
                System.out.print(chessTable[i][j]);
            }
        System.out.println();
        }
    }
}


