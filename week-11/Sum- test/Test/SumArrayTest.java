import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SumArrayTest {

    @Test
    public void sumListElements_should_add_arrayElements_returnSum() {
        Sum sum = new Sum();
        List<Integer> sumThis = Arrays.asList(1, 2);
        List<Integer> nowSumThis = Arrays.asList(1, 2, 3);

        assertEquals(3, sum.sumListElements(sumThis));
        assertEquals(6, sum.sumListElements(nowSumThis));
    }

    @Test
    public void sumListElements_should_return0_if_list_isEmpty() {
        Sum sum = new Sum();
        List<Integer> sumThis = Arrays.asList();

        assertEquals(0, sum.sumListElements(sumThis));
    }

    @Test
    public void sumListElements_should_return_elementValue_if_list_contains_one_element() {
        Sum sum = new Sum();
        List<Integer> sumThis = Arrays.asList(4);
        List<Integer> nowSumThis = Arrays.asList(5);

        assertEquals(4, sum.sumListElements(sumThis));
        assertEquals(5, sum.sumListElements(nowSumThis));

    }
}