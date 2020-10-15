package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void should_return_1_when_count_off_given_order_number_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(1);
        assertEquals("1", actual);
    }

    @Test
    void should_return_Fizz_when_count_off_given_order_number_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(3);
        assertEquals("Fizz", actual);
    }

    @Test
    void should_return_Buzz_when_count_off_given_order_number_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(5);
        assertEquals("Buzz", actual);
    }

    @Test
    void should_return_Whizz_when_count_off_given_order_number_14() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(14);
        assertEquals("Whizz", actual);
    }

    @Test
    void should_return_FizzBuzz_when_count_off_given_order_number_15() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(15);
        assertEquals("FizzBuzz", actual);
    }

    @Test
    void should_return_BuzzWhizz_when_count_off_given_order_number_35() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.countOff(35);
        assertEquals("BuzzWhizz", actual);
    }
}
