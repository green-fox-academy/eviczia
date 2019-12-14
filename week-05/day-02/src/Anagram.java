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
        System.out.println(isAnagram("New York Times", "monkeys write"));

    }

    private static boolean isAnagram(String word1, String word2) {
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        for (int i = 0; i < word1.length(); ) {
            if (word1.substring(i, i + 1).equals(" ")) i++;
            else {
                for (int j = 0; j < word2.length(); j++) {
                    if (word1.substring(i, i + 1).equals(word2.substring(j, j + 1))) {
                        word1 = word1.substring(0, i) + " " + word1.substring(i + 1);
                        word2 = word2.substring(0, j) + " " + word2.substring(j + 1);
                    }
                }
                i++;
            }
        }
        word1 = word1.replace(" ", "");
        word2 = word2.replace(" ", "");
        return word1.equals(word2);

    }
}