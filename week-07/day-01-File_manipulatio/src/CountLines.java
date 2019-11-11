import sun.font.CreatedFontTracker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountLines {
// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
    public static void main(String[] args) {
        String fileName = "my-File.txt";
        System.out.println(linesInFile (fileName));
    }

    private static int linesInFile(String fileName) {
        List<String> content = new ArrayList<>();
        Path filePath = Paths.get(fileName);
        try {
            content = Files.readAllLines(filePath);
        } catch (IOException e) {

            System.out.println(0);
        }
        return content.size();
    }

}
