/**
 * Created by ZL on 2016/7/10.
 */
public class FizzBuzz {
    public String work(Object obj) {
        if(obj instanceof Integer){
            Integer  inputNumber = (Integer)obj;
            if (inputNumber % 15 == 0) {
                return "FizzBuzz";
            }
            if (inputNumber % 3 == 0) {
                return "Fizz";
            }
            if (inputNumber % 5 == 0) {
                return "Buzz";
            }
        }
        return "invalidate number!";
    }
}
