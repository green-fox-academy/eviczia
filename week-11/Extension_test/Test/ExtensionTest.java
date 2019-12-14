import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aze on 2017.04.04..
 */
class ExtensionTest {

    Extension extension = new Extension();

    @Test
    void testAdd_2and3is5() {
        assertEquals(5, extension.add(2, 3));
    }

    @Test
    void testAdd_AandBisAandB() {
        int[] actual = new int[6];
        actual[0] = extension.add(2,3);
        actual[1] = extension.add(-2,3);
        actual[2] = extension.add(0,0);
        actual[3] = extension.add(123,321);
        actual[4] = extension.add(-10,-10);
        actual[5] = extension.add(6,6);
        int[] expected = {5, 1, 0, 444, -20, 12};

        assertArrayEquals(expected, actual);
    }

    @Test
    void testAdd_1and4is5() {
        assertEquals(5, extension.add(1, 4));
    }

    @Test
    void testMaxOfThree_first() {
        assertEquals(5, extension.maxOfThree(5, 4, 3));
    }

    @Test
    void testMaxOfThree_third() {
        assertEquals(5, extension.maxOfThree(3, 4, 5));
    }

    @Test
    void testMaxOfThree_takeIntegers_returnHighest() {
        assertEquals(5, extension.maxOfThree(3, 5, 4));
    }


    @Test
    void testMedian_four() {
        assertEquals(5, extension.median(Arrays.asList(7,5,3,5)));
    }

    @Test
    void testMedian_five() {
        assertEquals(3, extension.median(Arrays.asList(1,2,3,4,5)));
    }

    @Test
    void testMedian_evenNumberOfElements_MedianMIddleAverage() {
        assertEquals(2.5, extension.median(Arrays.asList(1,2,3,4)));
    }

    @Test
    void testIsVowel_a() {
        assertTrue(extension.isVowel('a'));
    }

    @Test
    void testIsVowel_u() {
        assertTrue(extension.isVowel('u'));
    }

    @Test
    void testTranslate_bemutatkozik() {
        assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
    }

    @Test
    void testTranslate_lagopus() {
        assertEquals("lavagovopuvus", extension.translate("lagopus"));
    }
}