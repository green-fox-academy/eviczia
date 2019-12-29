// Create a function that

// - takes the name of a CSV file as a parameter,
//   - every row is in the following format: <person name>;<birthdate in YYYY-MM-DD format>;<city name>
// - returns the year when the most births happened.
//   - if there were multiple years with the same number of births then return any one of them
// You can find such a CSV file in this directory named births.csv
// If you pass "births.csv" to your function, then the result should be either 2006, or 2016.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Births {
    private static String fileHere = "births.csv";

    public static void main(String[] args) {
        System.out.println(mostYearsFromText().toString());

    }

    private static List<String> mostYearsFromText() {
        List<String> birthDatabase = readFileToList();
        String[][] birthDBmatrix = convertListToMatrix(birthDatabase);

        return Lottery.getMaximumOccurence(yearsToHashmap(birthDBmatrix));
    }

    private static HashMap<String, Integer> yearsToHashmap(String[][] birthDBmatrix) {
        HashMap<String, Integer> hashMapYearOccurrence = new HashMap<>();
        for (int i = 0; i < birthDBmatrix.length; i++) {
            String year = birthDBmatrix[i][1].substring(0, 4);
            if (!hashMapYearOccurrence.containsKey(year)) {
                hashMapYearOccurrence.put(year, 1);
            } else {
                hashMapYearOccurrence.replace(year, hashMapYearOccurrence.get(year) + 1);
            }
        }
        return hashMapYearOccurrence;
    }


    private static String[][] convertListToMatrix(List<String> birthDatabase) {
        String[][] birthDBmatrix = new String[birthDatabase.size()][];
        for (int i = 0; i < birthDatabase.size(); i++) {
            birthDBmatrix[i] = birthDatabase.get(i).split(";", 3);
        }
        return birthDBmatrix;
    }

    private static List<String> readFileToList() {
        Path path = Paths.get(fileHere);
        List<String> birthDatabase = new ArrayList<>();

        try {
            birthDatabase = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return birthDatabase;
    }
}
