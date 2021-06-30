package recursion.depth_first_search;

import list.util.BinaryNode;

public class LongestIncrementingPathSize {
    public int lip (BinaryNode<Integer> root){
        Solution solution = new Solution();
        lip(root, root, 1, solution);
        return solution.currMax;
    }

    private void lip(BinaryNode<Integer> root, BinaryNode<Integer> parent, int currCount, Solution solution) {
        if(root == null) {
            if(currCount > solution.currMax) {
                solution.currMax = currCount;
            }
            return;
        }

        if(parent.data + 1 == root.data){
            lip(root.left, root, currCount+1, solution);
            lip(root.right, root, currCount+1, solution);
        }else{
            lip(root.left, root, 1, solution);
            lip(root.right, root, 1, solution);
        }
    }
}

class Solution{
    int currMax = Integer.MIN_VALUE;
}

