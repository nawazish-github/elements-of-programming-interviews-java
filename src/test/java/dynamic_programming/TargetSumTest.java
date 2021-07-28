package dynamic_programming;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TargetSumTest {

    @Test
    public void test1() {
        TargetSum targetSum = new TargetSum();

        List<Integer> integers = targetSum.targetSum(new int[]{1, 2, 3, 4}, 0);
        assertEquals(0, integers.stream().mapToInt(Integer::intValue).sum());
    }
}