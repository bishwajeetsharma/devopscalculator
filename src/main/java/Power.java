import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigInteger;
import java.util.Scanner;

public class Power {
    private static final Logger logger = LogManager.getLogger(Power.class);
    public void power(int a, int b)
    {
        try {
            if(a==0 && b==0 || a==Integer.MAX_VALUE && b==Integer.MAX_VALUE ||
                    ((a==1 || a==0)&& b==Integer.MAX_VALUE))
                throw new ArithmeticException("indeterminant form");
            BigInteger result=BigInteger.valueOf((long) Math.pow(a, b));
            System.out.println(result);
            logger.info("a to power b = "+result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            logger.error(e.getMessage());
        }
    }
}
