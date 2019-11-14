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
// Write a function that returns the GET / POST request ratio.
    public static void main(String[] args) {
        Path logFileHere = Paths.get("log.txt");
        uniqueIP(logFileHere);
    }

    private static void uniqueIP(Path logFileHere) {
        List<String> logContent = new ArrayList<>();
        try {
            logContent = Files.readAllLines(logFileHere);
        } catch (IOException e) {
            e.printStackTrace();
        }


        String[][] arrayLine = new String[logContent.size()][];
        for (int i = 0; i < logContent.size(); i++) {
           arrayLine[i] = logContent.get(i).split(" ");
           arrayLine[i].
           System.out.println(Arrays.toString(arrayLine[i]));
            }
            System.out.println();
        }
    }

