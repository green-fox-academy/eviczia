import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class SumArrayTest {

    @Test
    public void sumListElements_AddMultipleElements_returnSum() throws ListDoesNotExistException {
        Sum sum = new Sum();
        List<Integer> sumThis = Arrays.asList(1, 2);
        List<Integer> nowSumThis = Arrays.asList(1, 2, 3);

        assertEquals(3, sum.sumListElements(sumThis));
        assertEquals(6, sum.sumListElements(nowSumThis));
    }

    @Test
    public void sumListElements_IfListIsEmpty_Return0() throws ListDoesNotExistException {
        Sum sum = new Sum();
        List<Integer> sumThis = Arrays.asList();

        assertEquals(0, sum.sumListElements(sumThis));
    }

    @Test
    public void sumListElements_IfListContainsOneElement_ReturnElement() throws ListDoesNotExistException {
        Sum sum = new Sum();
        List<Integer> sumThis = Collections.singletonList(4);
        List<Integer> nowSumThis = Collections.singletonList(5);

        assertEquals(4, sum.sumListElements(sumThis));
        assertEquals(5, sum.sumListElements(nowSumThis));

    }
    @Test(expected = ListDoesNotExistException.class)
    public void sumListElements_IfInputNull_Return() throws ListDoesNotExistException {
        Sum sum = new Sum();
        sum.sumListElements(null);

    }
}