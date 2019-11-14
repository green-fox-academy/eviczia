import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logs {
    // Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
    public static void main(String[] args) {
        Path logFileHere = Paths.get("log.txt");
        System.out.println(Arrays.toString(uniqueIP(logFileHere)));
        System.out.println(uniqueIP(logFileHere).length);
    }

    private static String[] uniqueIP(Path logFileHere) {
        // read logfile into an ArrayList
        List<String> logContent = fileToList(logFileHere);

        // put logcontent into a 2D Array
        String[][] arrayLine = listTo2DArray(logContent);

        // iterate through the lines of the array, checking for IP duplicates (8th item per line),
        // rewrite each line with the next one if duplicate, decrease n with every find
        int n = arrayLine.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; ) {
                if (arrayLine[i][8].equals(arrayLine[j][8])) {
                    for (int k = j; k < n - 1; k++) {
                        arrayLine[k] = arrayLine[k + 1];
                    }
                    n--;
                } else {
                    j++;
                }
            }
        }
        String[] uniqueIP = new String[n];
        for (int i = 0; i <n; i++) {
            uniqueIP[i] = arrayLine[i][8];
        }
        return uniqueIP;
    }

    private static String[][] listTo2DArray(List<String> logContent) {
        String[][] arrayLine = new String[logContent.size()][];
        for (int i = 0; i < logContent.size(); i++) {
            arrayLine[i] = logContent.get(i).split(" ");
        }
        return arrayLine;
    }

    private static List<String> fileToList(Path logFileHere) {
        List<String> logContent = new ArrayList<>();
        try {
            logContent = Files.readAllLines(logFileHere);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return logContent;
    }
// Write a function that returns the GET / POST request ratio.

}

