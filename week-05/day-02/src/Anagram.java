public class Anagram {
    //Create a function named is anagram following your current language's style guide.
    // It should take two strings and return a boolean value depending on whether its an anagram or not.
    //
    //Examples
    //input 1	input 2	output
    //"dog"	"god"	true
    //"green"	"fox"	false
    public static void main(String[] args) {
        System.out.println(isAnagram("dog", "god"));
        System.out.println(isAnagram("green", "fox"));
        System.out.println(isAnagram("gaga", "gaaa"));

    }

    private static boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        } else {
            word1 = word1.toLowerCase();
            word2 = word2.toLowerCase();
            int counter = 0;
            for (int i = 0; i < word1.length(); i++) {
                for (int j = 0; j < word2.length(); j++) {
                    if (word1.substring(i, i + 1).equals(word2.substring(j, j + 1))) {
                        counter++;
                        word1 = word1.substring(0, i) + "#" + word1.substring(i + 1);
                        word2 = word2.substring(0, j) + "*" + word2.substring(j + 1);
                    }
                }
            }
            return counter == word1.length();
        }
    }
}