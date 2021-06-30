package recursion.leetcode;


import tree.binarytree.TreeNode;

/**
 * You are given an integer array nums with no duplicates. A maximum binary tree can be built recursively from nums using the following algorithm:
 *
 * Create a root node whose value is the maximum value in nums.
 * Recursively build the left subtree on the subarray prefix to the left of the maximum value.
 * Recursively build the right subtree on the subarray suffix to the right of the maximum value.
 * Return the maximum binary tree built from nums.
 *
 * https://leetcode.com/problems/maximum-binary-tree/
 */
public class MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaxBinTree (nums, 0, nums.length - 1);
    }

    private TreeNode constructMaxBinTree (int[] nums, int left, int right) {
        if (left > right) return null;
        if (right < 0 || left >= nums.length) return null;
        if (left == right) return new TreeNode(nums[left]);


        int idx = getMaxValueIndex (nums, left, right);

        TreeNode node = new TreeNode(nums[idx]);

        TreeNode leftNode = constructMaxBinTree (nums, left, idx - 1);
        TreeNode rightNode = constructMaxBinTree (nums, idx + 1, right);

        node.left = leftNode;
        node.right = rightNode;

        return node;
    }

    private int getMaxValueIndex (int[] nums, int left, int right) {
        int max = nums[left];
        int idx = left;
        left++;
        while (left <= right) {
            if (nums[left] > max) {
                max = nums[left];
                idx = left;
            }
            left++;
        }
        return idx;
    }
}
