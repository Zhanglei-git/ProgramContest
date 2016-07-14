/**
 * Created by gaole on 7/10/16.
 */
public class FizzBuzz {
    public String work(Object input) {
        if (input instanceof Integer) {
            int inputNum = (Integer) input;

            if (inputNum % 15 == 0) {
                return "FIZZBUZZ";
            }
            if (inputNum % 3 == 0) {
                return "FIZZ";
            }
            if (inputNum % 5 == 0) {
                return "BUZZ";
            }
        }
        return "Invalid Input Data";
    }

}
