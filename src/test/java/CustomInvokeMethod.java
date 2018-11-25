import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

public class CustomInvokeMethod extends Statement {

    private final FrameworkMethod testMethod;
    private final Object target;

    public CustomInvokeMethod(FrameworkMethod testMethod, Object target) {
        this.testMethod = testMethod;
        this.target = target;
    }

    @Override
    public void evaluate() throws Throwable {

        Throwable t = null;
        for (int i = 0; i < 3; i++) {
            try {
                t = null;
                testMethod.invokeExplosively(target);
                return;
            } catch (Throwable throwable) {
                System.out.println("Launching " + testMethod.getName());
                t = throwable;
            }
        }
        throw t;
    }
}