package recursion.leetcode;

import java.util.Arrays;

public class BinarySearch {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;

        Arrays.sort(nums);
        return search (0, nums.length -1, nums, target);
    }

    private int search (int left, int right, int[] nums, int target) {
        if (left > right) return -1;

        int mid = (right + left) / 2;
        if (nums[mid] == target) return mid;

        if (nums[mid] < target) {
            return search (mid+1, right, nums, target);
        }else{
            return search (left, mid - 1, nums, target);
        }
    }
}
