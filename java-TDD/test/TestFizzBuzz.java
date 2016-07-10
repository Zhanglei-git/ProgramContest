import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by ZL on 2016/7/10.
 */
public class TestFizzBuzz {
    FizzBuzz fb;
    @Before
    public void setUp() throws Exception {
        fb = new FizzBuzz();
    }

    @Test
    public void return_Fizz_when_inputNumber_is_3() throws Exception {
        assertEquals("Fizz",fb.work(3));
    }

    @Test
    public void return_Buzz_when_inputNumber_is_5() throws Exception {
        assertEquals("Buzz",fb.work(5));
    }

    @Test
    public void return_FizzBuzz_when_inputNumber_is_15() throws Exception {
        assertEquals("FizzBuzz",fb.work(15));
    }

    @Test
    public void return_invalidate_number_when_input_is_a_Float() throws Exception {
        assertEquals("invalidate number!",fb.work(3.5));
    }

    @Test
    public void return_invalidate_number_when_input_is_null() throws Exception {
        assertEquals("invalidate number!",fb.work(null));
    }
}
