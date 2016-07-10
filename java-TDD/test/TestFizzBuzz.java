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
}
