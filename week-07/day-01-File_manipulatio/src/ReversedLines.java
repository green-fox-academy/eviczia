import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        Path pathToReverse = Paths.get("reversed-lines.txt");
        unReverse(pathToReverse);
        // Create a method that decrypts reversed-lines.txt
    }

    private static void unReverse(Path pathToReverse) {
        List<String> content = new ArrayList<>();
        List<String> newContent = new ArrayList<>();

        try {
            content = Files.readAllLines(pathToReverse);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < content.size(); i++) {
            String addReversedHere = "";
            for (int j = 0; j < content.get(i).length(); j++) {
                String c = String.valueOf(content.get(i).charAt(content.get(i).length()-1-j));
                addReversedHere += c;
            }
            newContent.add(addReversedHere);
        }
        Path pathOfReversed = Paths.get("reversed-lines-done.txt");
        try {
            Files.write(pathOfReversed, newContent);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
