import org.junit.Test;

import static org.junit.Assert.*;

public class SumArrayTest {

    @Test
    public void sumArray_should_add_arrayElements_returnSum() {
        Sum sum = new Sum();
        int[] sumThis = {1, 2};
        int[] nowSumThis = {1, 2, 3};

        assertEquals(3, sum.sumArray(sumThis));
        assertEquals(6, sum.sumArray(nowSumThis));
    }

    @Test
    public void sumArray_should_return0_if_list_isEmpty() {
        Sum sum = new Sum();
        int[] sumThis = {};

        assertEquals(0, sum.sumArray(sumThis));
    }

    @Test
    public void sumArray_should_return_elementValue_if_list_contains_one_element() {
        Sum sum = new Sum();
        int[] sumThis = {4};
        int[] nowSumThis = {5};

        assertEquals(4, sum.sumArray(sumThis));
        assertEquals(5, sum.sumArray(nowSumThis));

    }

}