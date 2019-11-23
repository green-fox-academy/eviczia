import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

public class TrySthing {
    public static void main(String[] args) {
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
            System.out.printf("int b %d is higher than int a %d\n", b, a);
            return false;
        } else if (a>b) {
            System.out.printf("int a %d is higher than int b %d\n", a, b);
            return true;
        } else {
            System.out.printf("int a %d is equal to int b %d\n", a, b);
            return false;
        }
    }
}
