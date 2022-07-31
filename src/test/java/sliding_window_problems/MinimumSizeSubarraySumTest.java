package sliding_window_problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MinimumSizeSubarraySumTest {
    
    @Test
    public void test() {
        int[] arr = {2,3,1,2,4,3};
        MinimumSizeSubarraySum m = new MinimumSizeSubarraySum();
        int actual = m.minSubArrayLen(7, arr);
        assertEquals(2, actual);
    }
}
