//Word reverser
//Create a function that takes a sentence as an input, reverses the letters in every word (but not reverses the word order in the sentence), and returns the sentence with the reversed words. You shouldn't care about upper or lower case letters.
//
//Write at least 2 different unit test cases.
//
//Example
//Input
//
//"lleW ,enod taht saw ton taht drah"
//Output
//
//"Well done, that was not that hard"
public class WordReverser {

    public static void main(String[] args) {
        String toReverse = "lleW ,enod taht saw ton taht drah";
        System.out.println(reverseWordByWord(toReverse));
    }

    public static String reverseWordByWord(String toReverse) {
        StringBuilder reversedString = new StringBuilder();
        String[] wordArray = toReverse.split(" ");
        for (String word:wordArray) {
            for (int i = word.length() - 1; i >= 0 ; i--) {
                reversedString.append(word.charAt(i));
            }
            reversedString.append(" ");

        }
        reversedString.delete(reversedString.length()-1, reversedString.length());
        return reversedString.toString();
    }


}
