import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;

import java.sql.Timestamp;


public class myRunner extends BlockJUnit4ClassRunner {
    Timestamp start;
    Timestamp end;

    public myRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }

    @Override
    protected Statement withBefores(FrameworkMethod method, Object target, Statement statement) {
        Statement startTestTime = new Statement() {
            @Override
            public void evaluate() throws Throwable {
                //System.out.println("Before in runner");
                statement.evaluate();
                start = new Timestamp(System.currentTimeMillis());
            }
        };
        Statement superStatement = super.withBefores(method, target, startTestTime);
        return superStatement;
    }

    @Override
    protected Statement withAfters(FrameworkMethod method, Object target, Statement statement) {
        Statement endTestTime = new Statement() {
            @Override
            public void evaluate() throws Throwable {
                statement.evaluate();
                Thread.sleep(10);
                end = new Timestamp(System.currentTimeMillis());
                long totalTime = end.getTime()-start.getTime();
                System.out.println(method + " - " + String.valueOf(totalTime));
                //System.out.println("After in runner. It takes " + String.valueOf(totalTime) + " ms");
            }
        };
        Statement superStatement = super.withAfters(method, target, endTestTime);
        return superStatement;
    }
}
