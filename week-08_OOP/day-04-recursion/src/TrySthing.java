import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrySthing {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(8);
        intList.add(10);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(0);

        System.out.println(intList.toString());

        System.out.println(intList.lastIndexOf(5));
        System.out.println(intList.lastIndexOf(2));
        System.out.println(intList.lastIndexOf(0));
        System.out.println(intList.size());



        int start = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = start; j < 10; ) {
                if (isHigher(i, j)) {
                    start++;
                    j++;
                } else {
                    i++;
                }
            }
        }
    }
    public static boolean isHigher(int a, int b) {
        boolean aIsHigher;
        if (a<b) {
 //           System.out.printf("int b %d is higher than int a %d\n", b, a);
            return false;
        } else if (a>b) {
 //           System.out.printf("int a %d is higher than int b %d\n", a, b);
            return true;
        } else {
//            System.out.printf("int a %d is equal to int b %d\n", a, b);
            return false;
        }
    }

}
