import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise6 {

    public static void main(String[] args) {
        //Write a Stream Expression to find the uppercase characters in a string!

        String name = "Czagányi Rozi";

        String capitalLetters = findInitials(name);
        System.out.println(capitalLetters);

        findInitialsWithStreamVoid(name);

        String capitalLetters2 = findInitialsWithStream(name);
        System.out.println(capitalLetters2);


    }

    private static String findInitialsWithStream(String text) {

        return text.codePoints()
                .filter(n -> n < 91 && n > 64)
                .collect(StringBuilder::new,
                StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

    }

    private static void findInitialsWithStreamVoid(String text) {

        IntStream intStream = text.chars();

        intStream.filter(n -> n < 91 && n > 64)
                .forEach(n -> System.out.print((char) n));
        System.out.println();

    }

    private static String findInitials(String text) {
        char[] textArray = text.toCharArray();

        StringBuilder capitalLettersFromText = new StringBuilder();

        for (char letter : textArray) {

            if ((int) letter <= 90 && (int) letter >= 65) {
                capitalLettersFromText.append(letter);
            }
        }

        return capitalLettersFromText.toString();

    }
}
