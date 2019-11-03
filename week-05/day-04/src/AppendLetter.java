import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
// The output should be: "boa", "anaconda", "koala", "panda", "zebra"
    }

    private static List<String> appendA(List<String> far) {
        for (int i = 0; i < far.size(); i++) {
            far.set(i, (far.get(i) + "a"));
        }
        return far;
    }
}

