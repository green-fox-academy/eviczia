import java.util.List;

public class Sum {


    public int sumListElements(List<Integer> listOfIntegers) {
        int sum = 0;
        for (int number : listOfIntegers) {
            sum += number;
        } return sum;
    }
}
