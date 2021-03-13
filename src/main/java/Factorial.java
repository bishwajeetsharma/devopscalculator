
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Factorial {

    private static final Logger logger = LogManager.getLogger(Factorial.class);

    public Double factorial(int a)
    {
        double result;
        if(a>=0) {
            result= 1;
            for (int k = 2; k <= a; k++) {
                result = result*k;
            }
            logger.info("Factorial of "+a+"= "+result);
            return result;
        }
        else  {
            logger.info("Factorial of negative no. doesn't exist!");
            return Double.NaN;
        }
    }
}
