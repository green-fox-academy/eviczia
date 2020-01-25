import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercise6 {

    public static void main(String[] args) {
        //Write a Stream Expression to find the uppercase characters in a string!

        String name = "Czagányi Rozi";

        String capitalLetters = findInitials(name);
        System.out.println("with simple for each solution: " + capitalLetters);

        System.out.print("with a void stream function: ");
        findInitialsWithStreamVoid(name);

        String capitalLetters2 = findInitialsWithStream1(name);
        System.out.println("with a string return stream function (stringbuilder): " + capitalLetters2);

        String capitalLetters3 = findInitialsWithStream2(name);
        System.out.println("with a string return stream function (string collections): " + capitalLetters3);


    }

    private static String findInitialsWithStream1(String text) {

        return text.codePoints()
                .filter(n -> n < 91 && n > 64)
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

    }

    private static String findInitialsWithStream2(String text) {

        return text.chars()
                .filter(n -> n < 91 && n > 64)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

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
