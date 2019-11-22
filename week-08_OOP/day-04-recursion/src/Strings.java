public class Strings {
    // Strings
    //Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars
    // have been changed to 'y' chars.

    public static void main(String[] args) {

        String stringWithX = "xax, xou did it!";
        System.out.println(stringWithX.replace('x', 'y'));
        System.out.println(stringWithX.split("x"));

//        System.out.println(xIsY(stringWithX));
    }

 /*   private static String xIsY(String x) {
        x.split("x");
        if (x.charAt(x.length()-1) == 'x'){
            return xIsY(x.substring(0, x.length()-2)) + "y";
        } else {
            return xIsY(x.substring(0, x.length()-1));
        }
    }*/
}
