package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void should_fizzBuzz_when_count_off_given_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(1);
        assertEquals("1", actual);
    }
}
