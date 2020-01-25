import org.junit.Test;

import static org.junit.Assert.*;

public class WordReverserTest {

    @Test
    public void textReversedWordByWord() {
        String testText1 = "There is no business like show business.";
        assertEquals("erehT si on ssenisub ekil wohs .ssenisub", WordReverser.reverseWordByWord(testText1));
    }

    @Test
    public void twoSentencetextReversedWordByWord() {
        String testText2 = "Take one. It's free.";
        assertEquals("ekaT .eno s'tI .eerf", WordReverser.reverseWordByWord(testText2));
    }
}