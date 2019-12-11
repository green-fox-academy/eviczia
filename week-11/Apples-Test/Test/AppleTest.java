import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

    @Test
    public void _should_print_string_apple() {
        Apple apple = new Apple();
        assertEquals("apple", apple.getApple());
    }

    @Test
    public void _should_print_string_pear() {
        Apple apple = new Apple();
        assertEquals("pear", apple.getApple());
    }



}