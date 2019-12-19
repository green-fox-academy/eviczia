import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
    int add(int a, int b) {
        return a + b;
    }

    int maxOfThree(int a, int b, int c) {
        if (a > b & a > c)
            return a;
        else if (b > c)
            return b;
        else return c;
    }

    float median(List<Integer> pool) {
        Collections.sort(pool);
        if (!(pool.size() % 2 == 0)) return pool.get((pool.size() - 1) / 2);
        return ((float) (pool.get(pool.size() / 2 - 1)) + pool.get(pool.size() / 2)) / 2;
    }

    boolean isVowel(char c) {
        return Arrays.asList('a', 'á', 'Á', 'é', 'É', 'í', 'Í', 'ó', 'Ó', 'ö', 'Ö', 'ő', 'Ő', 'ú', 'Ú', 'ü', 'Ü', 'ű', 'Ű', 'u', 'o', 'e', 'i', 'A', 'U', 'O', 'E', 'I').contains(c);
    }

    String translate(String hungarian) {
        String teve = hungarian;
        System.out.println(teve);
        List<String> vowelsList = new ArrayList<>(Arrays.asList("a", "A", "á", "Á", "e", "E", "é", "É", "i", "I", "í", "Í", "o", "O", "ó", "Ó", "ö", "Ö", "ő", "Ő", "u", "U", "ú", "Ú", "ü", "Ü", "ű", "Ű"));
        for (int i = 0; i < vowelsList.size(); i++) {
            String c = vowelsList.get(i);
            if (teve.contains(c) & teve.endsWith(c)) {
                teve = String.join(c + "v" + c, teve.split(c)) + c + "v" + c;
                i += 1;
            } else if (teve.contains(c)) {
                teve = String.join(c + "v" + c, teve.split(c));
                i += 1;
            }
        }
        System.out.println(teve);
        return teve;
    }
}

// Check out the folder. There's a work file and a test file.

//  -  Run the tests, all 10 should be green (passing).
//  -  The implementations though are not quite good.
//  -  Create tests that'll fail, and will show how the implementations are wrong(You can assume that the implementation of join and split are good)
//  -  After creating the tests, fix the implementations
//  -  Check again, if you can create failing tests
//  -  Implement if needed