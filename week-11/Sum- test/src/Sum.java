import java.util.List;

public class Sum {


    public int sumListElements(List<Integer> listOfIntegers) throws ListDoesNotExistException {
        if (listOfIntegers == null) {
            throw new ListDoesNotExistException();
        }
        int sum = 0;
        for (int number : listOfIntegers) {
            sum += number;
        }
        return sum;
    }
}
