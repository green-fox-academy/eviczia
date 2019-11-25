import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) {

        System.out.println(ticTacResult("win-o.txt"));
        // Should print "O"

        System.out.println(ticTacResult("win-x.txt"));
        // Should print "X"

        System.out.println(ticTacResult("draw.txt"));
        // Should print "Draw"
    }

    private static String ticTacResult(String s) {

        // read match results from text files, return output in an int Array
        // (ie: OXOOXXOOX = [0, 1, 0, 0, 1, 1, 0, 0, 1])
        int[] intResult = matchToIntArray(s);

        // put the 8 instances of winning combination in a 2D array,
        // where the 1s in each line represent a possible winning combination
        int[][] winners = fillWinningSequences();

        // compare the given match to the winning sequences by multiplying each match line item
        // with the corresponding winning matrix line item and sum lines
        int winnerInt[] = traceWinners(intResult, winners);

        // winning lines can be recognised because they contain a 0 (then "O" wins") or a 3 (then "X" wins")
        // if they contain neither, then it's a draw
        for (int i = 0; i < 8; i++) {
            switch (winnerInt[i]) {
                case 3:
                    return "X";
                case 0:
                    return "O";
            }
        }
        return "Draw";
    }

    private static int[] traceWinners(int[] intResult, int[][] winners) {
        int[] winnerInt = new int[8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {
                winnerInt[i] += intResult[j] * winners[i][j];
            }
        } return winnerInt;
    }

    private static int[][] fillWinningSequences() {
        int[][] winners = new int[][]{
        {1, 0, 0, 1, 0, 0, 1, 0, 0},
        {0, 1, 0, 0, 1, 0, 0, 1, 0},
        {0, 0, 1, 0, 0, 1, 0, 0, 1},
        {1, 1, 1, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 1, 1, 1, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 1, 1, 1},
        {1, 0, 0, 0, 1, 0, 0, 0, 1},
        {0, 0, 1, 0, 1, 0, 1, 0, 0}};
        return winners;
    }

    private static int[] matchToIntArray(String s) {
        Path path = Paths.get(s);
        List<String> matchFin = new ArrayList<>();
        try {
            matchFin = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String stringResult = "";
        for (int i = 0; i < matchFin.size(); i++) {
            stringResult += matchFin.get(i);
        }
        int[] intResult = new int[9];
        for (int i = 0; i < 9; i++) {
            String xXx = "X";
            if (stringResult.substring(i, i+1).equals(xXx)) {
                intResult[i] = 1;
            } else {
                intResult[i] = 0;
            }
        } return intResult;
    }
}