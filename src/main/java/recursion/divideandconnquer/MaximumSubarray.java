package recursion.divideandconnquer;

/**
 * 53. Maximum Subarray
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * https://leetcode.com/problems/maximum-subarray/
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        return maxSubArray(nums, 0, nums.length-1);
    }

    private int maxSubArray(int[] nums, int left, int right) {
        if (left == right) return nums[left];

        int mid = (left + right) / 2;
        int sumLeft = maxSubArray(nums, left, mid);
        int sumRight = maxSubArray(nums, mid + 1, right);
        int sumCrossing = maxSubArrayCrossing(nums, left, mid, mid, right);
        return Math.max(Math.max(sumLeft, sumRight), sumCrossing);
    }

    private int maxSubArrayCrossing(int[]nums, int left, int lmid, int rmid, int right) {
        int leftMax = nums[lmid];
        lmid--;
        int runningSum = leftMax;
        while(lmid >= left) {
            leftMax = Math.max(leftMax, nums[lmid]+runningSum);
            runningSum += nums[lmid];
            lmid--;
        }

        int q = rmid + 1;
        int rightMax = nums[q];
        q++;
        runningSum = rightMax;
        while ((q) <= right) {
            rightMax = Math.max(rightMax, nums[q] + runningSum);
            runningSum += nums[q];
            q++;
        }

        return leftMax + rightMax;
    }
}
