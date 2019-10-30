package recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreatestCommonDivisorTest {

    @Test
    public void gcdTest(){
        GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
        int gcd = greatestCommonDivisor.gcd(320, 104);
        Assertions.assertEquals(8, gcd);
    }
}
