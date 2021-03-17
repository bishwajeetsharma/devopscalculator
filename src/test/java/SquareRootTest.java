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
        logger.info("Executing TruePositive test case");
        Assert.assertTrue("Executing TruePositive test case",Double.isNaN(s.sroot(-1)));
    }
    @Test
    public void truenegative()
    {
        logger.info("Executing TrueNegative test case");
        Assert.assertNotEquals("Executing TrueNegative test case",true,Double.isNaN(s.sroot(1)));
    }
    @Test
    public void falsepositive()
    {
        logger.info("Executing FalsePositive test case");
        Assert.assertFalse("Executing FalsePositive test case",Double.isNaN(s.sroot(1)));

    }
    @Test
    public void falsenegative()
    {
        logger.info("Executing FalseNegative test case");
        Assert.assertNotEquals("Executing FalseNegative test case",false,Double.isNaN(s.sroot(-1)));
    }
}
