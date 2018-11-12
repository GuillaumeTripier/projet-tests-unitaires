import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherFactory;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder.request;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TimerExtensionTest {

    private PrintStream oldOut = System.out;
    private ByteArrayOutputStream out = new ByteArrayOutputStream();
    private PrintStream ps = new PrintStream(out);

    @BeforeAll
    void init(){

        System.setOut(ps);
    }

    @AfterAll
    void teardown(){
        System.setOut(oldOut);
    }


    @Test
    void should_log_exec_time() {

        // Arrange
        LauncherDiscoveryRequest request = request().selectors(selectClass(Question3Test.class)).build();

        // Act
        LauncherFactory.create().execute(request);

        // Assert
        String firstLine = out.toString().split("\r\n")[0].split(" - ")[1];
        assertThat(firstLine).matches("Test executed in [0-9]+ milliseconds");
    }
}