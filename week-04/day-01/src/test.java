import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String proba = "probalkozasok";
        System.out.println(proba.substring(10, 13));
        System.out.println(proba.indexOf("sok"));
        String[] probaArray = {"not", "not", "no", "nt", "ot"};
        System.out.println(Arrays.binarySearch(probaArray,"not"));
        System.out.println(Arrays.asList(probaArray));
        String[] strArr = proba.split("", proba.length());
        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i] + " ");
        }
        System.out.println(proba.charAt(4));
    }
}
