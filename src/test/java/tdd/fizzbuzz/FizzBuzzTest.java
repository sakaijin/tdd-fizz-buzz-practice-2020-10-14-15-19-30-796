package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void should_fizzBuzz_when_countOff_given_1_return_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(1);
        assertEquals("1", actual);
    }

    @Test
    void should_fizzBuzz_when_countOff_given_multiple_of_3_return_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(3);
        assertEquals("Fizz", actual);
    }

    @Test
    void should_fizzBuzz_when_countOff_given_multiple_of_5_return_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(5);
        assertEquals("Buzz", actual);
    }
}
