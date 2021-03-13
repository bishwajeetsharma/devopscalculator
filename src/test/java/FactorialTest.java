import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.Assert;
import org.junit.Test;




public class FactorialTest {
    private static final Logger logger = LogManager.getLogger(FactorialTest.class);
    Factorial f=new Factorial();
    @Test
    public void AssertTrueTest()
    {
        logger.info("Executing AssertNull tests");
        Assert.assertTrue("Asserting NaN for factorial of negative number",Double.isNaN(f.factorial(-1)));
    }

    @Test
    public void AssertNotNullTest()
    {
        logger.info("Executing AssertNotNull tests");
        Assert.assertNotNull("Asserting Not NaN for factorial of non-negative number",f.factorial(7));
    }
}
