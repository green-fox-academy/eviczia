import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        String s = "../../week-07/day-01-File_manipulatio/win-o.txt";

        Path path = Paths.get(s);
        List<String> matchFin = new ArrayList<>();
        try {
            matchFin = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(matchFin);
        System.out.println(rotateMatrix(matchFin));



    }
    private static List<String> rotateMatrix(List<String> matchFin) {
        List<String> rotatedMatchfin = new ArrayList<>(3);
        for (int i = 0; i < matchFin.size(); i++) {
            String jjj = "";
            for (int j = 0; j < matchFin.get(i).length(); j++) {
                jjj = jjj + matchFin.get(j).substring(i, i + 1);
            }
            rotatedMatchfin.add(jjj);
        }
        return rotatedMatchfin;
    }
}
