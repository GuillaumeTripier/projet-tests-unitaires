import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
//import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void should_return_FIZZ_with_input_multiple_of_3() {

        // GIVEN - ARRANGE
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 3;

        // WHEN - ACT
        String result = fizzBuzz.fizzBuzz(input);

        // THEN - ASSERT
        String expected = "Fizz";
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void should_return_Buzz_with_input_multiple_of_5() {

        // GIVEN - ARRANGE
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 5;

        // WHEN - ACT
        String result = fizzBuzz.fizzBuzz(input);

        // THEN - ASSERT
        String expected = "Buzz";
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void should_return_FIZZ_with_input_multiple_of_3_and_5() {

        // GIVEN - ARRANGE
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 15;

        // WHEN - ACT
        String result = fizzBuzz.fizzBuzz(input);

        // THEN - ASSERT
        String expected = "FizzBuzz";
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void should_return_input_without_input_multiple_of_3_and_5() {

        // GIVEN - ARRANGE
        FizzBuzz fizzBuzz = new FizzBuzz();
        int input = 4;

        // WHEN - ACT
        String result = fizzBuzz.fizzBuzz(input);

        // THEN - ASSERT
        String expected = "4";
        Assertions.assertThat(result).isEqualTo(expected);
    }
}