package recursion.permutation;

import org.junit.jupiter.api.Test;
import recursion.permutation.topdown.NDigitNumberWithSum;

public class NDigitNumberWithSumTest {
    @Test
    public void test(){
        NDigitNumberWithSum nDigitNumberWithSum = new NDigitNumberWithSum();
        nDigitNumberWithSum.getNdigitNumberWithSum(3, 10);
    }
}
