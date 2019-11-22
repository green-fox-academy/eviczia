public class Strings {
    // Strings
    //Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars
    // have been changed to 'y' chars.

    public static void main(String[] args) {

        String stringWithX = "xax, xou did it!";
        System.out.println(stringWithX.replace('x', 'y'));

        System.out.println(xIsY(stringWithX));
    }
// https://github.com/green-fox-academy/ZaitzeV16/blob/master/week-03/day-5/src/Strings.java
    private static String xIsY(String x) {
        if (x.length() == 0) {
            return x;
        } else {
            if ("x".equals(String.valueOf(x.charAt(0)))) {//2. if the first char IS x,
                x = "y" + x.substring(1);           // 3. overwrite string with y instead of x
            }
            return x.charAt(0) + xIsY(x.substring(1)); // 1. if first char is not x, keep first char, send the rest back to the function
        }
    }
}
