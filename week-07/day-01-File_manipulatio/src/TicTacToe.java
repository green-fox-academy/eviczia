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
        String[][] matchArray = (matchFin);

    }
    private static String[][] listTo2DArray(List<String> logContent) {
        String[][] arrayLine = new String[logContent.size()][];
        for (int i = 0; i < logContent.size(); i++) {
            arrayLine[i] = logContent.get(i).split(" ");
        }
        return arrayLine;
    }

}