package tdd.fizzbuzz;

import static java.lang.String.valueOf;

public class FizzBuzz {
    public String countOff(int count) {
        if (count % 3 == 0 ){
            return "Fizz";
        }
        return valueOf(count);
    }
}
