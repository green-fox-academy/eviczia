import java.util.*;

public class IsInList{
    public static void main(String... args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        checkNums(list);
        // Check if list contains all of the following elements: 4,8,12,16
        // Create a method that accepts list as an input
        // it should return "true" if it contains all, otherwise "false"

    }

    private static void checkNums(ArrayList<Integer> list) {
        ArrayList<Integer> checklist = new ArrayList<>(Arrays.asList(4, 8, 12, 16));
        Boolean has4_8_12_16 = false;
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < checklist.size(); j++) {
                if (list.get(i)== checklist.get(j)) {
                    counter +=1;
                }
            }
        }if (counter == checklist.size()) {
            has4_8_12_16 = true;
        }
        System.out.println(has4_8_12_16);
    }
}