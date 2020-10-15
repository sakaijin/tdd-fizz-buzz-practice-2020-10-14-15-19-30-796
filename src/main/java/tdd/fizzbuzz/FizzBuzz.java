package tdd.fizzbuzz;

import static java.lang.String.valueOf;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final int THREE = 3;

    public String countOff(int count) {
        if (count % THREE == 0 ){
            return FIZZ;
        }
        return valueOf(count);
    }
}
