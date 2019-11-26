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
import java.util.*;

public class Births {
    public static void main(String[] args) {
        String fileHere = "births.csv";
        String year = mostYearsFromText(fileHere);
        System.out.println(year);

    }

    private static String mostYearsFromText(String fileHere) {
        List<String> birthDatabase = readFileToList(fileHere);
        String[][] birthDBmatrix = convertListToMatrix(birthDatabase);
        HashMap<String, Integer> hashMapYearOccurence= new HashMap<String, Integer>();
        int count = 0;
        for (int i = 0; i < birthDBmatrix.length; i++) {
            String year = birthDBmatrix[i][1].substring(0,4);
            if (!hashMapYearOccurence.containsKey(year)) {
                hashMapYearOccurence.put(year, 1);
            } else {
                hashMapYearOccurence.replace(year, hashMapYearOccurence.get(year)+1);
            }
        }
        hashMapYearOccurence.;
                HashMap
        int max = 0;
        for (Integer yearOccurence: hashMapYearOccurence.values()) {
            max = Math.max(max, yearOccurence);
            if (max== yearOccurence) {
                String year = hashMapYearOccurence.get(max);
            }//TODO need to get the year which occurs max times, and return it
        }
        return "eszter";
    }


    private static String[][] convertListToMatrix(List<String> birthDatabase) {
        String [][] birthDBmatrix = new String[birthDatabase.size()][];
        for (int i = 0; i < birthDatabase.size(); i++) {
            birthDBmatrix[i] = birthDatabase.get(i).split(";",3);
            System.out.println(Arrays.toString(birthDBmatrix[i]));
        }
        return birthDBmatrix;
    }

    private static List<String> readFileToList(String fileHere) {
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
