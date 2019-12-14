import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountLettersTest {

    @Test
    public void countLetters_GetWord_ReturnUniqueCharacterOccurencesOfInput() {
        String testword = "greenfox";
        HashMap actual = CountLetters.countLetters(testword);
        HashMap expected = new HashMap<String, Integer>() {{
            put("g", 1);
            put("r", 1);
            put("e", 2);
            put("n", 1);
            put("f", 1);
            put("o", 1);
            put("x", 1);
        }};
        assertEquals(expected, actual);
    }

    @Test
    public void countLetters_GetEmptyString_ReturnEmptyMap() {
        String testword = "";
        HashMap actual = CountLetters.countLetters(testword);
        HashMap expected = new HashMap<String, Integer>() {{
        }};
        assertEquals(expected, actual);
    }
}