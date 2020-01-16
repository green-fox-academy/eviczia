import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PalindromeSearcherTest {

    @Test
    public void findPalindromes_givenCorrectText_shouldReturnListWithPalindromes() throws ThisIsMyownException {
        String text = "cofefee";
        assertFalse(PalindromeSearcher.findPalindromes(text).isEmpty());
        assertEquals(2, PalindromeSearcher.findPalindromes(text).size());
        assertEquals(Arrays.asList("fef", "efe"), PalindromeSearcher.findPalindromes(text));
        assertNotEquals(Arrays.asList("efe", "fef"), PalindromeSearcher.findPalindromes(text));
    }
    @Test(expected = ThisIsMyownException.class)
    public void findPalindromes_givenNull_should() throws ThisIsMyownException {
        PalindromeSearcher.findPalindromes(null);
    }
    @Test
    public void findPalindromes_givenEmptyString() throws ThisIsMyownException {
        String text = "";
        assertTrue(PalindromeSearcher.findPalindromes(text).isEmpty());
    }
    @Test
    public void findPalindromes_givenNoPalindromes_ReurnEmptyList() throws ThisIsMyownException {
        String text = "coffee";
        assertTrue(PalindromeSearcher.findPalindromes(text).isEmpty());
    }

    @Test
    public void findPalindromes_givenTheSameCharacters_shouldReturnListWithTheSameChars() throws ThisIsMyownException {
        String text = "rrrrr";
        assertEquals(4, PalindromeSearcher.findPalindromes(text).size());
    }

    @Test
    public void findPalindromes_givenCorrectTextSmallAndBigCase_shouldReturnListWithPalindromes() throws ThisIsMyownException {
        String text = "MadAme";
        assertEquals(2, PalindromeSearcher.findPalindromes(text).size());
    }

    @Test
    public void findPalindromes_givenTextWithSpace_shouldReturnListWithPalindromes() throws ThisIsMyownException {
        String text = "madame im adam";
        assertEquals(3, PalindromeSearcher.findPalindromes(text).size());
    }

}