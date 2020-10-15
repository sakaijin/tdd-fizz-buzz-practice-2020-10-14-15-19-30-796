package tdd.fizzbuzz;

import static java.lang.String.valueOf;

public class FizzBuzz {

    private static final int THREE = 3;
    private static final int FIVE = 5;
    private static final int SEVEN = 7;
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    public String countOff(int count) {
        if (isAMultipleOf3and5(count) && isAMultipleOf(count, SEVEN)){
            return FIZZ + BUZZ + WHIZZ;
        }
        if (isAMultipleOf3and5(count)){
            return FIZZ + BUZZ;
        }
        if (isAMultipleOf(count, FIVE) && isAMultipleOf(count, SEVEN)){
            return BUZZ + WHIZZ;
        }
        if (isAMultipleOf(count, THREE) && isAMultipleOf(count, SEVEN)){
            return FIZZ + WHIZZ;
        }
        if (isAMultipleOf(count, THREE)) {
            return FIZZ;
        }
        if (isAMultipleOf(count, FIVE)) {
            return BUZZ;
        }
        if (isAMultipleOf(count, SEVEN)) {
            return WHIZZ;
        }
        return valueOf(count);
    }

    private boolean isAMultipleOf3and5(int count) {
        return isAMultipleOf(count, THREE) && isAMultipleOf(count, FIVE);
    }

    private boolean isAMultipleOf(int count, int specialNumber) {
        return count % specialNumber == 0;
    }
}
