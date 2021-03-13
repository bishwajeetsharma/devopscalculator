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
        Assert.assertTrue("Asserting NaN for factorial of negative number",Double.isNaN(f.factorial(-1)));
        Assert.assertTrue("Asserting NaN for factorial of a number > 20",Double.isNaN(f.factorial(21)));
        logger.info("Executing AssertNull tests");
    }

    @Test
    public void AssertNotNullTest()
    {
        Assert.assertNotNull("Asserting Not NaN for factorial of number between 1 and 20",f.factorial(3));
        logger.info("Executing AssertNotNull tests");
    }
}
