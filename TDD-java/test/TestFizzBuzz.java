import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gaole on 7/10/16.
 */
public class TestFizzBuzz {
    FizzBuzz fb;

    @Before
    public void setup() throws Exception{
        fb = new FizzBuzz();
    }

    @Test
    public void return_Fizz_when_inputNumber_is_3() throws Exception{
          assertEquals("FIZZ", fb.work(3));
    }
}
