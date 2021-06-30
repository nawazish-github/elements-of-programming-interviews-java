package recursion.leetcode;

import org.junit.jupiter.api.Test;

/**
 * 1306. Jump Game III
 * Given an array of non-negative integers arr, you are initially positioned at start index of the array. When you are at index i, you can jump to i + arr[i] or i - arr[i], check if you can reach to any index with value 0.
 * Notice that you can not jump outside of the array at any time.
 * @Link https://leetcode.com/problems/jump-game-iii/
 */
public class JumpGameIIITest {

    @Test
    public void positive(){
        JumpGameIII jumpGameIII = new JumpGameIII();
        boolean result = jumpGameIII.canReach(new int[]{4, 2, 3, 0, 3, 1, 2}, 5);
        System.out.println(result);
    }

    @Test
    public void negative(){
        JumpGameIII jumpGameIII = new JumpGameIII();
        boolean result = jumpGameIII.canReach(new int[]{3,0,2,1,2}, 5);
        System.out.println(result);
    }
}
