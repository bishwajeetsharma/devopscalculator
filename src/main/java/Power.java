import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Power {
    private static final Logger logger = LogManager.getLogger(Power.class);
    public Double power(double a, double b)
    {
        //indeterminant forms
        if((a==Double.POSITIVE_INFINITY || a==1)&& b==Double.POSITIVE_INFINITY) {
            logger.info("Result of " + a + " to the power "+b+" is " + Double.NaN);
            return Double.NaN;
        }
        else if(a==0 && b==0)
        {
            logger.info("Result of " + a + " to the power "+b+" is " + Double.NaN);
            return Double.NaN;
        }
        else //valid inputs
        {
            logger.info("Result of " + a + " to the power "+b+" is " + Math.pow(a,b));
            return Math.pow(a,b);
        }
    }
}
