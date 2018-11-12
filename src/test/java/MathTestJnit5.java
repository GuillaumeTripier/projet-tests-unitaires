import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

public class MathTestJnit5 {
    @BeforeAll public static void print_in_console_that_MathTest_class_unit_tests_have_begun() {
        System.out.println("MathTest class unit tests have begun");
    }

    @AfterAll public static void print_in_console_that_MathTest_class_unit_tests_are_finished() {
        System.out.println("MathTest class unit tests are finished");
    }

    @BeforeEach public void sleep_for_500_ms() throws InterruptedException {
        System.out.println("Before execution");
        Thread.sleep(500);
    }

    @AfterEach public void print_in_console_that_one_unit_test_is_finished() {
        System.out.println("After execution");
        System.out.println("One unit test is finished");
    }

    @Disabled
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
