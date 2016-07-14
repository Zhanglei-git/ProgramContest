/**
 * Created by gaole on 7/10/16.
 */
public class FizzBuzz {
    public String work(Object input) {
        int inputNum = (Integer) input;

        if (inputNum % 3 == 0) {
            return "FIZZ";
        }
        if (inputNum % 5 == 0) {
            return "BUZZ";
        }
        return "";
    }
}
