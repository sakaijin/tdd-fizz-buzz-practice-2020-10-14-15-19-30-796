package tdd.fizzbuzz;

import static java.lang.String.valueOf;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final int THREE = 3;
    private static final int FIVE = 5;
    private static final String BUZZ = "Buzz";

    public String countOff(int count) {
        if (count % THREE == 0 ){
            return FIZZ;
        }
        if (count % FIVE == 0){
            return BUZZ;
        }
        return valueOf(count);
    }
}
