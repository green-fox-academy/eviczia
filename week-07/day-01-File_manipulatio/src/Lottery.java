import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lottery {

    public static void main(String[] args) {

        List<String> text = correctText();
        String[][] lotteryMatrix = new String[text.size()][];

        for (int i = 0; i < text.size(); i++) {
            lotteryMatrix[i] = text.get(i).split(",");
        }

        HashMap<String, Integer> numberOccurrences = matrixToHashMap(lotteryMatrix);

        List<String> mostFrequentNumbers = getMaximumOccurence(numberOccurrences);

        System.out.println(mostFrequentNumbers.toString());

    }

    private static HashMap<String, Integer> matrixToHashMap(String[][] lotteryMatrix) {
        HashMap<String, Integer> numberOccurrences = new HashMap<>();

        for (int i = 0; i < lotteryMatrix.length; i++) {
            for (int j = lotteryMatrix[i].length - 1; j > lotteryMatrix[i].length - 6; j--) {

                if (!numberOccurrences.containsKey(lotteryMatrix[i][j])) {
                    numberOccurrences.put(lotteryMatrix[i][j], 1);
                } else {
                    numberOccurrences.replace(lotteryMatrix[i][j], numberOccurrences.get(lotteryMatrix[i][j]) + 1);
                }
            }
        }
        return numberOccurrences;

    }

    public static List<String> getMaximumOccurence(HashMap<String, Integer> numberOccurences) {
        int max = 0;
        for (Map.Entry<String, Integer> numberOccurrence : numberOccurences.entrySet()) {
            max = Math.max(max, numberOccurrence.getValue());
        }
        List<String> mostFrequent = new ArrayList<>();
        for (Map.Entry<String, Integer> numberOccurrence : numberOccurences.entrySet()) {
            if (numberOccurrence.getValue() == max) {
                mostFrequent.add(numberOccurrence.getKey());
            }
        }
        return mostFrequent;
    }

    private static List<String> correctText() {
        List<String> text = readFile("lottery.csv");
        List<String> correctedText = new ArrayList<>();
        String newLine = "";

        for (String line : text) {
            newLine = String.join(",", line.split(";"));
            correctedText.add(newLine);
        }

        writeFile(correctedText);

        return correctedText;

    }

    private static void writeFile(List<String> correctedText) {
        Path path = Paths.get("lotteryCommas.csv");
        try {
            Files.write(path, correctedText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static List<String> readFile(String filename) {
        Path path = Paths.get(filename);
        List<String> readFile = new ArrayList<>();
        try {
            readFile = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readFile;
    }
}