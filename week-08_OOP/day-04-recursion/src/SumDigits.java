public class SumDigits {
    // Sum Digits
    //Given a non-negative integer n, return the sum of its digits recursively (without loops).
    //
    //Hint
    //Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
    //
    //Java, C++, C#, Python
    //Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).
    public static void main(String[] args) {
        System.out.println(sumDigits(2002385));
    }

    private static int sumDigits(int n) {
        if (n / 10 == 0) {
            return  n % 10;
        } else {
            return (n % 10) + sumDigits(n / 10);
        }
    }
}

