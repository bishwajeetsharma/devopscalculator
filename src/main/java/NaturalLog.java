import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NaturalLog {
    private static final Logger logger = LogManager.getLogger(NaturalLog.class);
    public Double log(int a)
    {
        logger.info("Log of "+a+" = "+Math.log(a));
        return Math.log(a);
    }
}
