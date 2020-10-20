package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CanBalanceTest {

    @Test
    public void test(){
        CanBalance canBalance = new CanBalance();
        boolean b = canBalance.canBalance(new int[]{1, 1, 1, 2, 1});
        Assertions.assertTrue(b);

        b = canBalance.canBalance(new int[]{1, 1, 1, 2});
        Assertions.assertFalse(b);

        b = canBalance.canBalance(new int[]{1, 1});
        Assertions.assertTrue(b);

        b = canBalance.canBalance(new int[]{});
        Assertions.assertTrue(b);
    }
}
