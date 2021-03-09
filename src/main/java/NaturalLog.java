import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class NaturalLog {
    private static final Logger logger = LogManager.getLogger(NaturalLog.class);
    public void log(int a)
    {
        try {
            if (a >= 1) {
                System.out.println(Math.log(a));
                logger.info("Log of "+a+" ="+Math.log(a));
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
