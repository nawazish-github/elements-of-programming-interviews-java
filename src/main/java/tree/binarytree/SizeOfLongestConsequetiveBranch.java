package tree.binarytree;

import list.util.BinaryNode;

/**
 * Given a tree, write a function to find the length of the longest branch of nodes in increasing consecutive order.
 */

public class SizeOfLongestConsequetiveBranch {
    public int longestConsequetiveBranch(BinaryNode<Integer> node){
        if(node == null) return 0;
        return max(longestConsequetiveBranch(node.left, node.data, 1),
                longestConsequetiveBranch(node.right, node.data, 1));
    }

    private int longestConsequetiveBranch(BinaryNode<Integer> node, int prev ,int currSize) {
        if(node == null){
            return currSize;
        }
        if(node.data == prev + 1){
            int leftLen = longestConsequetiveBranch(node.left, node.data, currSize+1);
            int rightLen = longestConsequetiveBranch(node.right, node.data, currSize+1);
            return max(leftLen, rightLen);
        }else{
            int leftLen = longestConsequetiveBranch(node.left, node.data, currSize+1);
            int rightLen = longestConsequetiveBranch(node.right, node.data, currSize+1);
            return max(leftLen, rightLen, currSize);
        }

    }

    private int max(int...nums){
        int max = Integer.MIN_VALUE;
        for(int val : nums){
            if(val > max){
                max = val;
            }
        }
        return max;
    }
}
