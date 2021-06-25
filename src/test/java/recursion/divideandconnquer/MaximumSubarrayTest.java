package recursion.divideandconnquer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

    @Test
    void maxSubArray() {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int i = maximumSubarray.maxSubArray(new int[]{-2, 1});
        assertEquals(1, i);
    }

    @Test
    void maxSubArray2() {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int i = maximumSubarray.maxSubArray(new int[]{2, 1});
        assertEquals(3, i);
    }

    @Test
    void maxSubArray3() {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int i = maximumSubarray.maxSubArray(new int[]{ 1});
        assertEquals(1, i);
    }

    @Test
    void maxSubArray4() {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int i = maximumSubarray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        assertEquals(6, i);
    }

    @Test
    void maxSubArray5() {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int i = maximumSubarray.maxSubArray(new int[]{4,-1,2,1});
        assertEquals(6, i);
    }
}