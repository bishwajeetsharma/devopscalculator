

import java.math.BigInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Factorial {

    private static final Logger logger = LogManager.getLogger(Factorial.class);

    public void factorial(int a)
    {

        if(a>=0)
        {
        BigInteger result=BigInteger.ONE;
        for(int k=2;k<=a;k++) {
            result = result.multiply(BigInteger.valueOf(k));
        }
        System.out.println(result);
        logger.info("Factorial of "+a+"= "+result);
        }
        else {
            try {
                throw new ArithmeticException("Factorial of negative number not allowed");
            }
            catch(ArithmeticException e)
            {
                System.out.println(e.getMessage());
                logger.error(e.getMessage());
            }
        }
    }
}
