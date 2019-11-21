public class GreatestCommonDivisor {
    //Greatest Common Divisor
    //Find the greatest common divisor of two numbers using recursion.
    public static void main(String[] args) {
        System.out.println(greatestCommonDivisor(2541, 331));
    }

    private static int greatestCommonDivisor(int num1, int num2) {
        int possibleDivisor = Math.min(num1, num2);
        return findGCD (num1, num2, possibleDivisor);
    }

    public static int findGCD(int num1, int num2, int possibleDivisor) {
        if ((num1 % possibleDivisor)==0 & (num2 % possibleDivisor)==0) {
            return possibleDivisor;
        } else {
            return findGCD(num1, num2, possibleDivisor-1);
        }

    }
}
