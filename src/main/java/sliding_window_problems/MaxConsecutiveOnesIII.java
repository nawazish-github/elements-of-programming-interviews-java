package sliding_window_problems;

/**
 * Given a binary array nums and an integer k, 
 * return the maximum number of consecutive 1's 
 * in the array if you can flip at most k 0's.
 * 
 * https://leetcode.com/problems/max-consecutive-ones-iii/
 */

public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int maxLen = 0;
        int leftIdx = 0;
        int rightIdx = 0;
        int zeroes = 0;
        
        for ( ; rightIdx < nums.length; ) {
            if(nums[rightIdx] == 0) {
                zeroes++;
                if (zeroes > k) {
                    maxLen = Math.max(maxLen, (rightIdx - leftIdx));
                    // shrink the window from left
                    // that is if we hit a 1, we continue shrinking
                    while (nums[leftIdx] == 1){
                        leftIdx++;
                    }
                    zeroes--;
                    leftIdx++;
                }  
            } 
            rightIdx++;
            maxLen = Math.max(maxLen, (rightIdx - leftIdx));
        }
        return maxLen;
    }
}
