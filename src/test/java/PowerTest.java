import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;


public class PowerTest {
    private static final Logger logger = LogManager.getLogger(PowerTest.class);
    double delta=Double.POSITIVE_INFINITY;
    Power p = new Power();
    @Test
    public void assertEqualsTest()
    {
        logger.info("Tests for power function 0^0 and INF^INF executing.....");
        Assert.assertEquals("Executing assertEquals NaN for 0^0",true,Double.isNaN(p.power(0, 0)));
        Assert.assertEquals("Executing assertEquals NaN for INF^INF",true,Double.isNaN(p.power(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY)));
    }
    @Test
    public void assertNotEqualsTest()
    {
        logger.info("Tests for power function 1^INF executing.....");
        Assert.assertNotEquals("Executing assertNotEquals NaN for 1^INF",false,Double.isNaN(p.power(1, Double.POSITIVE_INFINITY)));
    }
}
