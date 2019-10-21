import com.sun.deploy.security.SelectableSecurityManager;
public class VariableMutation {
    public static void main(String[] args) {

        int a = 3;
        // make the "a" variable's value bigger by 10
        a +=10;
        System.out.println(a);

        int b = 100;
        // make b smaller by 7
        b -= 7;
        System.out.println(b);

        int c = 44;
        // please double c's value
        c *= 2;
        System.out.println(c);

        int d = 125;
        // please divide by 5 d's value
        d /= 5;
        System.out.println(d);

        int e = 8;
        // please cube of e's value
        e = e * e;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        System.out.println(f1 > f2);

        /*boolean is_f1_Bigger;
                if (f1 > f2) {
                    is_f1_Bigger = true;
                } else {
                    is_f1_Bigger =false;
                }
        System.out.println("f1 is bigger than f2: " + is_f1_Bigger);*/


        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        System.out.println((2 * g2) > g1);

        /*boolean is_2g2_Bigger;
        if (2 * g2 > g1) {
            is_2g2_Bigger = true;
        } else {
            is_2g2_Bigger = false;
        }

        System.out.println("2g2 is bigger than g1: " + is_2g2_Bigger);*/

        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        System.out.println((h % 11) == 0);

        /*boolean isDivisibleBy11;
        if (h % 11 == 0) {
            isDivisibleBy11 = true;
        } else {
            isDivisibleBy11 = false;
        }
        System.out.println(h + " is divisible by 11: " + isDivisibleBy11 + " (remainder is " + 135798745 % 11 +")");*/

        System.out.println();
        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

        int sqi1 = i2 * i2;
        int cui2 = i2 * i2 * i2;
        System.out.println((sqi1 < i1) && (i1 < cui2));
        System.out.println();


        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)

        System.out.println(!((j % 3) != 0 && (j % 5) != 0));

        /*boolean isDivisibleByThreeorFive;
        if ((j % 3) != 0 && (j % 5) != 0) {
            isDivisibleByThreeorFive = false;
        } else {
            isDivisibleByThreeorFive = true;
        }
        System.out.println(j + " is divisible by 3 or 5: " + isDivisibleByThreeorFive);*/
    }
}
