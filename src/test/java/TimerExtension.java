import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class TimerExtension implements BeforeTestExecutionCallback, AfterTestExecutionCallback {

    private long start;

    @Override
    public void beforeTestExecution(ExtensionContext context) throws Exception {
        this.start = System.currentTimeMillis();
    }

    @Override
    public void afterTestExecution(ExtensionContext context) throws Exception {
        long execTime = System.currentTimeMillis() - this.start;
        System.out.println(context.getTestMethod().get().getName() + " - Test executed in " + execTime + " milliseconds");
    }
}
