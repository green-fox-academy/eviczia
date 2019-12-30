import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class WeeklyFeedbackEvaluator {

    public static void main(String[] args) {

        System.out.println(getAverageMetrics());

    }


    private static HashMap<String, Float> getAverageMetrics() {

        float[] averages = averageMatrixColumns(readFileToMatrix());

        HashMap<String, Float> averageMetrics = new HashMap<>();
        averageMetrics.put("matReview", averages[0]);
        averageMetrics.put("presSkills", averages[1]);
        averageMetrics.put("helpfulness", averages[2]);
        averageMetrics.put("explanation", averages[3]);

        return averageMetrics;

    }

    private static float[] averageMatrixColumns(String[][] responses) {
        float[] averages = new float[4];
        for (int i = 0; i < 4; i++) {
            for (String[] response : responses) {
                averages[i] += (float) Integer.parseInt(response[i]) / responses.length;
            }
        }
        return averages;
    }

    private static String[][] readFileToMatrix() {
        Path path = Paths.get("responses.txt");
        List<String> responses = new ArrayList<>();
        try {
            responses = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listToMatrix(responses);
    }

    private static String[][] listToMatrix(List<String> responses) {
        String[][] stringMatrix = new String[responses.size()][];
        for (int i = 0; i < responses.size(); i++) {
            stringMatrix[i] = responses.get(i).split(" ");
        }
        return stringMatrix;

    }

}
