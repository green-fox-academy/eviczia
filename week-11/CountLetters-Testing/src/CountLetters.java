import java.util.HashMap;

public class CountLetters {

    public static HashMap<String, Integer> countLetters(String countTheseLetters) {
        HashMap<String, Integer> letterCounts = new HashMap<>();
        if (countTheseLetters == "") {
            return letterCounts;
        } else {
            String[] separateCharacters = countTheseLetters.split("");
            for (int i = 0; i < separateCharacters.length; i++) {
                String letter = separateCharacters[i];
                if (!letterCounts.containsKey(letter)) {
                    letterCounts.put(letter, 1);
                } else {
                    letterCounts.replace(letter, letterCounts.get(letter) + 1);
                }
            }
        }

        return letterCounts;

    }
}
