package string;

import org.junit.jupiter.api.Test;

public class SumNumbersTest {

    @Test
    public void test(){
        SumNumbers sumNumbers = new SumNumbers();
        int sum = sumNumbers.sumNumbers("aa11b33");
        System.out.println(sum);
    }
}
