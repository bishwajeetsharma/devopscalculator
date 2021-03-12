import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class SquareRoot {
    private static final Logger logger = LogManager.getLogger(SquareRoot.class);
    public void sroot(int a)
    {
        try {
            if (a >= 0) {
                System.out.println(Math.sqrt(a));
                logger.info("square root of "+a+" is "+Math.sqrt(a));
            }
            else
                throw new ArithmeticException("Invalid input");

        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
            logger.error(e.getMessage());
        }
    }
}
