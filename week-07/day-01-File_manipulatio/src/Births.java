// Create a function that
// - takes the name of a CSV file as a parameter,
//   - every row is in the following format: <person name>;<birthdate in YYYY-MM-DD format>;<city name>
// - returns the year when the most births happened.
//   - if there were multiple years with the same number of births then return any one of them

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// You can find such a CSV file in this directory named births.csv
// If you pass "births.csv" to your function, then the result should be either 2006, or 2016.
public class Births {
    public static void main(String[] args) {
        String fileHere = "births.csv";
        Path path = Paths.get(fileHere);
        List<String> birthDatabase = new ArrayList<>();

        try {
            birthDatabase = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(birthDatabase.size());


    }
}
