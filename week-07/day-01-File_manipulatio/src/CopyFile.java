import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
// Write a function that copies the contents of a file into another
// It should take the filenames as parameters

// It should return a boolean that shows if the copy was successful

    public static void main(String[] args) {
        Path originalF = Paths.get("my-file.txt");
        Path newF = Paths.get("my-fle.txt");

        System.out.println(copyContent(originalF, newF));
    }

    private static boolean copyContent(Path originalF, Path newF) {
        List<String> contentOriginal;
        List<String> contentNew;
  //      System.out.println(contentNew);
    //    System.out.println(contentOriginal);
        try {
            contentOriginal = Files.readAllLines(originalF);
            contentNew = Files.readAllLines(newF);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        contentNew.addAll(contentOriginal);

        try {
            Files.write(newF, contentNew);
            return true;
        } catch (IOException e) {
            return  false;
        }
    }
}
