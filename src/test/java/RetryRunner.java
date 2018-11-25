import org.junit.internal.runners.statements.InvokeMethod;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;

public class RetryRunner extends BlockJUnit4ClassRunner {

    public RetryRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }

    public Statement methodInvoker(FrameworkMethod method, Object test) {

        return new CustomInvokeMethod(method, test);
    }

}
