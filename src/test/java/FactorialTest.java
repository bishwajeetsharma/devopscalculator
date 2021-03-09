import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.util.Random;

public class FactorialTest {
    private static final Logger logger = LogManager.getLogger(FactorialTest.class);
    @Test
    public void testfactorial()
    {
        try {
            logger.info("Tests for factorial of negative numbers executing.....");
            Factorial f = new Factorial();
            f.factorial(-1);
        }
        catch(ArithmeticException e)
        {
            logger.error("Test fails");
        }
        finally {
            logger.info("Done");
        }
    }
}
