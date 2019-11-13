import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        Path pathToReverse = Paths.get("reversed-lines.txt");
        unreverse(pathToReverse);
        // Create a method that decrypts reversed-lines.txt


    }

    private static Path unreverse(Path pathToReverse) {
        List<String> content = new ArrayList<>();
        List<String> newContent = new ArrayList<>();

        try {
            content = Files.readAllLines(pathToReverse);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < content.size(); i++) {
            newContent.add(content.get(content.size() - i));
        }
        Path pathOfReversed = Paths.get("reversed-lines-done.txt");
        try {
            Files.write(pathOfReversed, newContent);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return  pathOfReversed;

        }
    }
