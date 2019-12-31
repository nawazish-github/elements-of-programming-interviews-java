import array.SingleCycleCheck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingleCycleCheckTest {
    @Test
    public void hasSingleCycleTest(){
        SingleCycleCheck singleCycleCheck = new SingleCycleCheck();
        boolean actual = singleCycleCheck.hasSingleCycle(new int[]{2, 3, 1, -4, -4, 2});
        Assertions.assertEquals(true, actual);
    }

    @Test
    public void hasSingleCycleTest2(){
        SingleCycleCheck singleCycleCheck = new SingleCycleCheck();
        boolean actual = singleCycleCheck.hasSingleCycle(new int[]{2, 3, 1});
        Assertions.assertEquals(false, actual);
    }
}
