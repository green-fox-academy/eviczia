import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;

// Create a function named search palindrome following your current language's style guide. It should take a string, search for palindromes that at least 3 characters long and return a list with the found palindromes.
//
//Examples
//input	output
//"dog goat dad duck doodle never"	["og go", "g g", " dad ", "dad", "d d", "dood", "eve"]
//"apple"	[]
//"racecar"	["racecar", "aceca", "cec"]
//""	[]
public class PalindromeSearcher {
    public static void main(String[] args) {
        String text1 = "dog goat dad duck doodle never";
        String text2 = "apple";
        String text3 = "racecar";
        String text4 = "";

        List<String> foundPalindromes = findPalindromes(text1);
        System.out.println(foundPalindromes.toString());
    }

    private static List<String> findPalindromes(String text) {
        List<String> palindromes = new ArrayList<>();

        for (int i = 1; i < text.length() - 1; i++) {
            for (int j = 1; j < Math.min(i + 1, text.length() - i); j++) {
                if (text.substring(i - j, i).equals(text.substring(i + j, i + j + 1))) {
                    palindromes.add(text.substring(i - j, i + j + 1));
                }
            }
        }
        return palindromes;
    }
}