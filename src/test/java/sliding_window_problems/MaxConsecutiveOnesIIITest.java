package sliding_window_problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxConsecutiveOnesIIITest {
    @Test
    public void test() {
        MaxConsecutiveOnesIII m = new MaxConsecutiveOnesIII();
        int actual = m.longestOnes(new int[]{0,1,0,0,1,1,0,1,1,0,0,1,1}, 3);
        assertEquals(9, actual);
    }
}
