package tdd.fizzbuzz;

import static java.lang.String.valueOf;

public class FizzBuzz {

    private static final int THREE = 3;
    private static final int FIVE = 5;
    private static final int SEVEN = 7;
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";
    private static final String FIZZ_BUZZ = "FizzBuzz";

    public String countOff(int count) {
        if (count % THREE == 0 && count % FIVE == 0){
            return FIZZ_BUZZ;
        }
        if (count % FIVE == 0 && count % SEVEN == 0){
            return "BuzzWhizz";
        }
        if (count % THREE == 0) {
            return FIZZ;
        }
        if (count % FIVE == 0) {
            return BUZZ;
        }
        if (count % SEVEN == 0) {
            return WHIZZ;
        }
        return valueOf(count);
    }
}
