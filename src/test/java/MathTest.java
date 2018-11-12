import org.assertj.core.api.Assertions;
import org.junit.*;

import static org.assertj.core.api.Assertions.*;

public class MathTest {

    @BeforeClass public static void print_in_console_that_MathTest_class_unit_tests_have_begun() {
        System.out.println("MathTest class unit tests have begun");
    }

    @AfterClass public static void print_in_console_that_MathTest_class_unit_tests_are_finished() {
        System.out.println("MathTest class unit tests are finished");
    }

    @Before public void sleep_for_500_ms() throws InterruptedException {
        System.out.println("Before execution");
        Thread.sleep(500);
    }

    @After public void print_in_console_that_one_unit_test_is_finished() {
        System.out.println("After execution");
        System.out.println("One unit test is finished");
    }

    @Ignore
    @Test
    public void absolute_value_of_positive_number_should_be_equal_to_the_number() {
        // GIVEN / WHEN / THEN : langage Gherkin
        // Peut-être utilisé pour faire du
        // Behavior Driven Developement

        // GIVEN - ARRANGE
        Math math = new Math();
        int input = 5;

        // WHEN - ACT
        int result = math.abs(input);

        // THEN - ASSERT
        int expected = 6;
        /*Assert.assertEquals("Absolute value of positive number should be equal to the input",
                5,
                result);*/
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void absolute_value_of_negative_number_should_be_equal_to_the_opposite_number() {

        // GIVEN - ARRANGE
        Math math = new Math();
        int input = -5;

        // WHEN - ACT
        int result = math.abs(input);

        // THEN - ASSERT
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void maximum_value_between_a_first_positive_number_and_second_negative_number_should_return_the_positive_number() {

        // GIVEN - ARRANGE
        Math math = new Math();
        int firstInput = 5;
        int secondInput = -6;

        // WHEN - ACT
        int result = math.max(firstInput, secondInput);

        // THEN - ASSERT
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void maximum_value_between_a_first_negative_number_and_second_positive_number_should_return_the_positive_number() {

        // GIVEN - ARRANGE
        Math math = new Math();
        int firstInput = -6;
        int secondInput = 5;

        // WHEN - ACT
        int result = math.max(firstInput, secondInput);

        // THEN - ASSERT
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void maximum_value_between_a_first_bigger_positive_number_and_second_positive_number_should_return_the_first_number() {

        // GIVEN - ARRANGE
        Math math = new Math();
        int firstInput = 6;
        int secondInput = 3;

        // WHEN - ACT
        int result = math.max(firstInput, secondInput);

        // THEN - ASSERT
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void maximum_value_between_a_first_positive_number_and_second_bigger_positive_number_should_return_the_second_number() {

        // GIVEN - ARRANGE
        Math math = new Math();
        int firstInput = 3;
        int secondInput = 6;

        // WHEN - ACT
        int result = math.max(firstInput, secondInput);

        // THEN - ASSERT
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void maximum_value_between_a_first_bigger_negative_number_and_second_negative_number_should_return_the_first_number() {

        // GIVEN - ARRANGE
        Math math = new Math();
        int firstInput = -3;
        int secondInput = -6;

        // WHEN - ACT
        int result = math.max(firstInput, secondInput);

        // THEN - ASSERT
        int expected = -3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void maximum_value_between_a_first_negative_number_and_second_bigger_negative_number_should_return_the_second_number() {

        // GIVEN - ARRANGE
        Math math = new Math();
        int firstInput = -6;
        int secondInput = -3;

        // WHEN - ACT
        int result = math.max(firstInput, secondInput);

        // THEN - ASSERT
        int expected = -3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void maximum_value_between_a_first_number_equals_to_0_and_second_positive_number_should_return_the_second_number() {

        // GIVEN - ARRANGE
        Math math = new Math();
        int firstInput = 0;
        int secondInput = 3;

        // WHEN - ACT
        int result = math.max(firstInput, secondInput);

        // THEN - ASSERT
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void maximum_value_between_a_first_negative_number_and_second_number_equals_to_0_should_return_the_second_number() {

        // GIVEN - ARRANGE
        Math math = new Math();
        int firstInput = -3;
        int secondInput = 0;

        // WHEN - ACT
        int result = math.max(firstInput, secondInput);

        // THEN - ASSERT
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void maximum_value_between_a_first_number_equals_to_0_and_second_negative_number_should_return_the_first_number() {

        // GIVEN - ARRANGE
        Math math = new Math();
        int firstInput = 0;
        int secondInput = -3;

        // WHEN - ACT
        int result = math.max(firstInput, secondInput);

        // THEN - ASSERT
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void maximum_value_between_two_equals_positive_numbers_return_the_positive_number() {

        // GIVEN - ARRANGE
        Math math = new Math();
        int firstInput = 4;
        int secondInput = 4;

        // WHEN - ACT
        int result = math.max(firstInput, secondInput);

        // THEN - ASSERT
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void maximum_value_between_two_equals_negative_numbers_return_the_negative_number() {

        // GIVEN - ARRANGE
        Math math = new Math();
        int firstInput = -4;
        int secondInput = -4;

        // WHEN - ACT
        int result = math.max(firstInput, secondInput);

        // THEN - ASSERT
        int expected = -4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void maximum_value_between_two_numbers_equals_to_0_should_return_0() {

        // GIVEN - ARRANGE
        Math math = new Math();
        int firstInput = 0;
        int secondInput = 0;

        // WHEN - ACT
        int result = math.max(firstInput, secondInput);

        // THEN - ASSERT
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    /*@Test
    public void absoluteValueOfNegativeNumber() {
        Math math = new Math();
        int result = math.abs(-5);
        Assert.assertEquals("Should be equal to the positive value of the input",
                5,
                result);
    }*/


}