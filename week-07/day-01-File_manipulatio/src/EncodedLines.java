import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {


    public static void main(String[] args) {
        // Create a method that decrypts encoded-lines.txt

        for (String line : decrypter()) {
            System.out.println(line);
        }
    }

    private static List<String> decrypter() {
        List<String> decrypted = new ArrayList<>();

        for (String line : readFile()) {

            StringBuilder newLine = new StringBuilder();
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == 32) {
                    newLine.append(line.charAt(i));
                } else {
                    newLine.append((char) (line.charAt(i) - 1));
                }
            }
            decrypted.add(newLine.toString());
        }
        return decrypted;
    }

    private static List<String> readFile() {
        Path path = Paths.get("encoded-lines.txt");
        List<String> readFile = new ArrayList<>();
        try {
            readFile = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readFile;
    }

}