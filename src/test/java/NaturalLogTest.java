import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class NaturalLogTest {
    private static final Logger logger = LogManager.getLogger(NaturalLogTest.class);
    @Test
    public void testlog()
    {
        try {
            logger.info("Tests for natural log of non-positive numbers executing.....");
            NaturalLog l = new NaturalLog();
            l.log(-1);
            l.log(0);
        }
        catch(ArithmeticException e)
        {
            logger.error("Failed!");
        }
        finally {
            logger.info("Done");
        }
    }
}
