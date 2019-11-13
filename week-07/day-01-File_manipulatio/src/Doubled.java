import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        noDuplicatesPlease();
    }

    private static void noDuplicatesPlease() {
        Path duplicatePath = Paths.get("duplicated-chars.txt");
        List<String> content = new ArrayList<>();

        try {
            content = Files.readAllLines(duplicatePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(content);
        for (int i = 0; i < content.size(); i++) {
            for (int j = 0; j < content.get(i).length(); j += 2) {
                System.out.print(content.get(i).charAt(j));
            }
            System.out.println();
        }
    }
}
