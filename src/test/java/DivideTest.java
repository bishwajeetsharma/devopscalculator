import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class DivideTest {
    @Test(expected = java.lang.ArithmeticException.class)
    public void testdividebyzero()
    {
        System.out.println("Divide by zero exception test case running...");
        Divide d2=new Divide();
        Random random = new Random();
        int num = random.nextInt(100);
        int ans = d2.divide(num, 0);

    }
}
