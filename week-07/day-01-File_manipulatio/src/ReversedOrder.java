import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
    // Create a method that decrypts reversed-order.txt
        Path pathToReOrder = Paths.get("reversed-lines.txt");
        reOrder(pathToReOrder);
        // Create a method that decrypts reversed-lines.txt
    }

    private static void reOrder (Path pathToReOrder) {
        List<String> content = new ArrayList<>();
        List<String> newContent = new ArrayList<>();

        try {
            content = Files.readAllLines(pathToReOrder);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < content.size(); i++) {
            newContent.add(content.get(content.size() - i-1));
        }
        Path pathOfReOrdered = Paths.get("reversed-order-done.txt");
        try {
            Files.write(pathOfReOrdered, newContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}