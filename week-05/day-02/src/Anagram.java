public class Anagram {
    //Create a function named is anagram following your current language's style guide.
    // It should take two strings and return a boolean value depending on whether its an anagram or not.
    //
    //Examples
    //input 1	input 2	output
    //"dog"	"god"	true
    //"green"	"fox"	false
    public static void main(String[] args) {
        System.out.println(isAnagram("eszter", "szeret"));
        System.out.println(isAnagram("green", "fox"));
    }

    private static boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        } else {
            int counter = 0;
            for (int i = 0; i < word1.length(); i++) {
                for (int j = 0; j < word2.length(); j++) {
                    if (word1.charAt(i) == word2.charAt(j)) {
                        word2.replace(word2.charAt(j), '@');
                        counter++;
                    }
                }
            }
            if (counter== word1.length()) {
                return true;
            }
        }
        return false;
    }
}
