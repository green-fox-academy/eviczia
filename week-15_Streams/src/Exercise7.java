import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise7 {

    public static void main(String[] args) {

        //Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:

        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        List<String> theSameInitialLetterWords = sameFirstLetter(cities, 'N');

        for (String theSameInitialLetterWord : theSameInitialLetterWords) {
            System.out.println(theSameInitialLetterWord);
        }

    }

    private static List<String> sameFirstLetter(List<String> cities, char a) {

        return cities.stream()
                .filter(text -> text.substring(0,1).equals(String.valueOf(a)))
                .collect(Collectors.toList());
    }
}
