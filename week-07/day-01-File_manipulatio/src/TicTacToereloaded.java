// Write a function that takes a filename as a parameter
// The file contains an ended Tic-Tac-Toe match
// We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
// Return "X", "O" or "Draw" based on the input file
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TicTacToereloaded {

    public static void main(String[] args) {
        System.out.println(ticTacResult("win-o.txt"));
        // Should print "O"
        System.out.println(ticTacResult("win-x.txt"));
        // Should print "X"
        System.out.println(ticTacResult("draw.txt"));
        // Should print "Draw"
    }

    private static String ticTacResult(String s) {
        List<String> matchFin = readToList(s);
        return findWinningSequence(matchFin);
    }

    private static String findWinningSequence(List<String> matchFin) {
        String result = checkLinesForWin(matchFin);
        if (result.equals("draw")) {
            result = checkDiagonalForWin(matchFin);
        } else {
            return result;
        }
        if (result.equals("draw")) {
            result = checkLinesForWin(rotateMatrix(matchFin));
        } else {
            return result;
        }
        return result;
    }

    private static List<String> readToList(String s) {
        Path path = Paths.get(s);
        List<String> matchFin = new ArrayList<>();
        try {
            matchFin = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return matchFin;
    }

    private static String checkDiagonalForWin (List<String> matchFin) {
        String result = "draw";
        if (isX(matchFin.get(0).charAt(0)) & isX(matchFin.get(1).charAt(1)) & isX(matchFin.get(2).charAt(2))) {
            result = "X";
        }
        if (!isX(matchFin.get(0).charAt(0)) & !isX(matchFin.get(1).charAt(1)) & !isX(matchFin.get(2).charAt(2))) {
            result = "O";
        }
        if (isX(matchFin.get(0).charAt(2)) & isX(matchFin.get(1).charAt(1)) & isX(matchFin.get(2).charAt(0))) {
            result = "X";
        }
        if (!isX(matchFin.get(0).charAt(2)) & !isX(matchFin.get(1).charAt(1)) & !isX(matchFin.get(2).charAt(0))) {
            result = "O";
        }
        return result;
        }

    private static String checkLinesForWin(List<String> matchFin) {
        int counter = 0;
        for (int i = 0; i < matchFin.size();) {
            for (int j = 0; j < matchFin.get(i).length(); j++) {
                if (isX(matchFin.get(i).charAt(j))) {
                    counter ++;
                }
            }
            if (counter == 3) {
                return "X";
            } else if (counter == 0) {
                return "0";
            } else {
                counter = 0;
                i ++;
            }
        } return "draw";
    }

    private static List<String> rotateMatrix(List<String> matchFin) {
        List<String> rotatedMatchfin = new ArrayList<>(3);
        for (int i = 0; i < matchFin.size(); i++) {
            String jjj = "";
            for (int j = 0; j < matchFin.get(i).length(); j++) {
                jjj = jjj + matchFin.get(j).substring(i, i + 1);
            }
            rotatedMatchfin.add(jjj);
        }
        return rotatedMatchfin;
    }

    private static boolean isX(char xo) {
        boolean isX = false;
        if (xo == 'X') {
            isX = true;
        }
        return isX;
    }
}