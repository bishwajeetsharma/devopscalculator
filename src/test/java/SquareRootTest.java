import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class SquareRootTest {
    private static final Logger logger = LogManager.getLogger(SquareRootTest.class);
    SquareRoot s=new SquareRoot();
    @Test
    public void truepositive()
    {
        Assert.assertTrue("Executing TruePositive test case",Double.isNaN(s.sroot(-1)));
    }
    @Test
    public void truenegative()
    {
        Assert.assertNotEquals("Executing TrueNegative test case",true,Double.isNaN(s.sroot(1)));
    }
    @Test
    public void falsepositive()
    {
        Assert.assertFalse("Executing FalsePositive test case",Double.isNaN(s.sroot(1)));
    }
    @Test
    public void falsenegative()
    {
        Assert.assertNotEquals("Executing FalsePositive test case",false,Double.isNaN(s.sroot(-1)));
    }
}
