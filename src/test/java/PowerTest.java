import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class PowerTest {
    private static final Logger logger = LogManager.getLogger(PowerTest.class);
    @Test
    public void testpow()
    {
        try {
            logger.info("Tests for power function 0^0 and INF^INF executing.....");
            Power p = new Power();
            p.power(0, 0);
            p.power(Integer.MAX_VALUE, Integer.MAX_VALUE);
            p.power(0, Integer.MAX_VALUE);
            p.power(1, Integer.MAX_VALUE);
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
