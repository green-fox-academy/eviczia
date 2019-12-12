import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramForTestingTest {

    @Test
    public void isAnagram_WordsArePermutationOfTheSameCharacters_True() {
        AnagramForTesting anagramForTesting = new AnagramForTesting();
        String word1 = "eszter";
        String word2 = "szeret";
        String word3 = "retesz";

        assertTrue(AnagramForTesting.isAnagram(word1, word2));
        assertTrue(AnagramForTesting.isAnagram(word2, word3));
    }

    @Test
    public void isAnagram_WordsAreNotPermutationOfTheSameCharacters_False() {
        AnagramForTesting anagramForTesting = new AnagramForTesting();
        String word1 = "eszter";
        String word2 = "szertt";

        assertFalse(AnagramForTesting.isAnagram(word1, word2));
    }

    @Test
    public void isAnagram_WordsAreNotTheSameLength_False() {
        AnagramForTesting anagramForTesting = new AnagramForTesting();
        String word1 = "eszter";
        String word2 = "szeretet";

        assertFalse(AnagramForTesting.isAnagram(word1, word2));
    }

    @Test
    public void isAnagram_CompareEmptyStrings_True() {
        AnagramForTesting anagramForTesting = new AnagramForTesting();
        String word1 = "";
        String word2 = "";

        assertTrue(AnagramForTesting.isAnagram(word1, word2));
    }

    @Test
    public void isAnagram_CompareSpecialCharacters_True() {
        AnagramForTesting anagramForTesting = new AnagramForTesting();
        String word1 = "<>&@";
        String word2 = "@<&>";

        assertTrue(AnagramForTesting.isAnagram(word1, word2));
    }

    @Test
    public void isAnagram_ComparisionNotCaseSensitive_True() {
        AnagramForTesting anagramForTesting = new AnagramForTesting();
        String word1 = "Eszter";
        String word2 = "szeret";

        assertTrue(AnagramForTesting.isAnagram(word1, word2));
    }


}