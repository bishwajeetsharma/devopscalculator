import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class SquareRoot {
    private static final Logger logger = LogManager.getLogger(SquareRoot.class);
    public Double sroot(int a)
    {

            logger.info("Result of square root of "+a+" is = "+Math.sqrt(a));
            return Math.sqrt(a);
        }
    }
