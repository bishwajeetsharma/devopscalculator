import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class NaturalLogTest {
    private static final Logger logger = LogManager.getLogger(NaturalLogTest.class);
    NaturalLog nl=new NaturalLog();

    @Test
    public void AssertSameTest()
    {
        logger.info("Executing assertSame tests for natural log");
        Assert.assertSame("Asserting NaN for log of negative numbers",true,Double.isNaN(nl.log(-8)));
        Assert.assertSame("Asserting Negative Infinity for log of 0",true,Double.isInfinite(nl.log(0)));
    }
    @Test
    public void AssertNotSameTest()
    {
        logger.info("Executing assertNotSame tests for natural log");
        Assert.assertNotSame("Asserting not NaN for log of positive numbers",true,Double.isNaN(nl.log(8)));

    }

}
