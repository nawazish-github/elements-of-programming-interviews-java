package recursion.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCostClimbingStairsTest {

    @Test
    public void test1() {
        MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs();
        int actual = minCostClimbingStairs.minCostClimbingStairs(new int[]{10, 15, 20});

        assertEquals(15, actual);

    }

}