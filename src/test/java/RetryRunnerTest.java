import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(RetryRunner.class)
public class RetryRunnerTest {

    int iterator;

    @Before
    public void init() {
        this.iterator = 0;
    }

    @Test
    public void should_pass_on_third_try() throws IllegalArgumentException {

        for(int i = iterator; i  < 2; i++){
            if (i < 2)
                throw new IllegalArgumentException();
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_fail_thrice() throws InterruptedException {

        for(int i = iterator; i  <= 2; i++)
            throw new IllegalArgumentException();
    }
}
