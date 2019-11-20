import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) {
        // Write a function that takes a filename as a parameter
        // The file contains an ended Tic-Tac-Toe match
        // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
        // Return "X", "O" or "Draw" based on the input file

        System.out.println(ticTacResult("win-o.txt"));
        // Should print "O"

        System.out.println(ticTacResult("win-x.txt"));
        // Should print "X"

        System.out.println(ticTacResult("draw.txt"));
        // Should print "Draw"
    }

    private static String ticTacResult(String s) {
        Path path = Paths.get(s);
        List<String> matchFin = new ArrayList<>();
        try {
            matchFin = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
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
        }
        counter = 0;
        for (int i = 0; i < matchFin.size();) {
            for (int j = 0; j < matchFin.get(i).length(); j++) {
                if (isX(matchFin.get(i).charAt(j))) {
                    counter ++;
                }
            }
            if (counter == 3) {
                return "X";
            } else if (counter == 0) {
                return "O";
            } else {
                counter = 0;
                i ++;
            }
        }
        for (int i = 0; i < 3 ;) {
            for (int j = 0; j < matchFin.size(); j++) {
                if (isX(matchFin.get(j).charAt(i))) {
                    counter ++;
                }
            }
            if (counter == 3) {
                return "X";
            } else if (counter == 0) {
                return "O";
            } else {
                counter = 0;
                i ++;
            }
        } return "Draw";
    }

    private static boolean isX(char xo) {
        boolean isX = false;
        if (xo == 'X') {
            isX = true;
        }
        return isX;
    }


}