import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class SquareRootTest {
    private static final Logger logger = LogManager.getLogger(SquareRootTest.class);
    @Test
    public void testsroot()
    {
        try {
            logger.info("Tests for square root executing.....");
            SquareRoot s = new SquareRoot();
            s.sroot(-1);
        }
        catch(ArithmeticException e)
        {
            logger.error("Fail");
        }
        finally {
            logger.info("Done");
        }
    }
}
