import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;

public class myRunner extends BlockJUnit4ClassRunner {
    public myRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }

    @Override
    protected Statement withBefores(FrameworkMethod method, Object target, Statement statement){
        Statement superStatement = super.withBefores(method, target, statement);
        return superStatement;
    }

    @Override
    protected Statement withAfters(FrameworkMethod method, Object target, Statement statement){
        Statement superStatement = super.withAfters(method, target, statement);
        return superStatement;
    }
}
