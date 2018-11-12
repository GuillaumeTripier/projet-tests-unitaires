import static org.assertj.core.api.Assertions.*;
import org.junit.*;
import org.junit.runner.Request;
import org.junit.runner.RunWith;
import org.junit.experimental.results.PrintableResult;
import org.junit.runners.model.InitializationError;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

public class myRunnerTest {

    private static PrintStream oldOut = System.out;
    private static ByteArrayOutputStream out = new ByteArrayOutputStream();
    private static PrintStream ps = new PrintStream(out);

    @BeforeClass
    public static void init(){
        System.setOut(ps);
    }

    @AfterClass
    public static void teardown(){
        System.setOut(oldOut);
    }

    @Test
    public void should_test_myRunner() throws InitializationError {
        //Give
        MathTestWithoutSystemOut mathTest = new MathTestWithoutSystemOut();
        //myRunner testRunner = new myRunner(mathTest.getClass());

        //When
        PrintableResult printableResult = new PrintableResult(Collections.emptyList());
        PrintableResult printableResult2 = PrintableResult.testResult(mathTest.getClass());

        //Then
        //System.out.println(printableResult2.toString());

        //Assert.assertThat();
        String[] lines = out.toString().split("\r\n");
        //System.setOut(oldOut);
        for(int i = 0; i<lines.length; i++){
            String [] function = lines[i].split(" - ");
            assertThat(Integer.parseInt(function[1])).isGreaterThanOrEqualTo(10);
        }
        //assertThat(printableResult2.failureCount()).isEqualTo(1);
    }
}
