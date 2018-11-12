import org.assertj.core.api.Assertions;;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(TimerExtension.class)
class Question3Test {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void init(){
        fizzBuzz = new FizzBuzz();
    }

    @AfterEach
    void teardown(){
        this.fizzBuzz = null;
    }

    @Test
    void should_return_FIZZ_with_input_multiple_of_3() throws InterruptedException {

        // GIVEN - ARRANGE
        int input = 3;

        // WHEN - ACT
        Thread.sleep(1_000L);
        String result = fizzBuzz.fizzBuzz(input);

        // THEN - ASSERT
        String expected = "Fizz";
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    void should_return_BUZZ_with_input_multiple_of_5() {

        // GIVEN - ARRANGE
        int input = 5;

        // WHEN - ACT
        String result = fizzBuzz.fizzBuzz(input);

        // THEN - ASSERT
        String expected = "Buzz";
        Assertions.assertThat(result).isEqualTo(expected);
    }
}
