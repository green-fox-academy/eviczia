//Exercise
//Create a function named create palindrome following your current language's style guide. It should take a string, create a palindrome from it and then return it.
//
//Examples
//input	output
//""	""
//"greenfox"	"greenfoxxofneerg"
//"123"	"123321"
public class PalindromeBuilder {
    public static void main(String[] args) {
        String word1 = "greenfox";
        System.out.println(palindrome(word1));

        String word2 = "123";
        System.out.println(palindrome(word2));
    }

    public static String palindrome(String word) {
        StringBuilder wordReversed = new StringBuilder();
        wordReversed.append(word);
        for (int i = word.length() - 1; i >= 0; i--) {
            wordReversed.append(word.charAt(i));
        }
        String reversedWord = wordReversed.toString();
        return reversedWord;
    }
}
