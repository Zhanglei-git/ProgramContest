import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaole on 7/10/16.
 */
public class TestFizzBuzz {
    FizzBuzz fb;

    @Before
    public void setup() throws Exception {
        fb = new FizzBuzz();
    }

    @Test
    public void return_Fizz_when_inputNumber_is_3() throws Exception {
        assertEquals("FIZZ", fb.work(3));
    }

    @Test
    public void return_Buzz_when_inputNumber_is_5() throws Exception {
        assertEquals("BUZZ", fb.work(5));
    }

    @Test
    public void return_FizzBuzz_when_inputNumber_is_15() throws Exception {
        assertEquals("FIZZBUZZ", fb.work(15));
    }

    @Test
    public void return_Invalid_Input_Data_when_inputNumber_is_4_dot_5() throws Exception {
        assertEquals("Invalid Input Data", fb.work(4.5));
    }

    @Test
    public void return_Invalid_Input_Data_when_inputNumber_null() throws Exception {
        assertEquals("Invalid Input Data", fb.work(null));
    }
}
