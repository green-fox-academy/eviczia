import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {

    public static void main(String[] args) {

        //Write a Stream Expression to concatenate a Character list to a string!

        List<Character> letters = new ArrayList<>();

        String word =  concatLettersToString(letters);

    }

    private static String concatLettersToString(List<Character> letters) {

        return letters.stream()
                .distinct()
                .reduce((word, n)->word +n);
//                 .map(n -> (char) n)
//                .collect(Collectors.joining());



    }
}
