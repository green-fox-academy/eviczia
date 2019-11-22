public class Strings {
    // Strings
    //Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars
    // have been changed to 'y' chars.

    public static void main(String[] args) {

        String stringWithX = "xax, xou did it!";
        System.out.println(stringWithX.replace('x', 'y'));

        System.out.println(xIsY(stringWithX));
    }

    private static String xIsY(String x) {
        if (x.charAt(0) == 'x'){
            return "y" + xIsY(x.substring(1, x.length()-2));
        } else {
            return x;
        }
    }
}
