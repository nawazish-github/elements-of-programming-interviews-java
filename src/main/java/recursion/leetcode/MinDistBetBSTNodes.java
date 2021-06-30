package recursion.leetcode;

import tree.util.BinaryNode;

import java.util.LinkedList;
import java.util.Queue;

public class MinDistBetBSTNodes {
    int minDiff = Integer.MAX_VALUE;
    Queue<BinaryNode<Integer>> queue = new LinkedList<>();

    public int minDiffInBST(BinaryNode root) {
        queue.add(root);
        dfs(root);
        return minDiff;
    }

    private void dfs (BinaryNode<Integer> root){
        while(queue.size() > 0){
            BinaryNode<Integer> n = queue.remove();

            int l = Integer.MAX_VALUE, r = Integer.MAX_VALUE;

            if(n.left != null) {
                queue.add(n.left);
                l = n.left.data;
            }
            if(n.right != null) {
                queue.add(n.right);
                r = n.right.data;
            }

            if(n.left == null && n.right == null) return;

            int lhsd = Math.abs(n.data - l);
            int rhsd = Math.abs(n.data - r);

            minDiff = Math.min(minDiff, Math.min(lhsd, rhsd));

            int leftLocalMinDiff = Integer.MAX_VALUE;
            if(n.left != null){
                BinaryNode<Integer> localRight = n.left.right;
                while(localRight != null){
                    leftLocalMinDiff = n.data - localRight.data;
                    localRight = localRight.right;
                }
            }

            int rightLocalMinDiff = Integer.MAX_VALUE;
            if(n.right != null){
                BinaryNode<Integer> localLeft = n.right.left;
                while(localLeft != null){
                    rightLocalMinDiff = localLeft.data - n.data;
                    localLeft = localLeft.left;
                }
            }

            int localMin = Math.min(leftLocalMinDiff, rightLocalMinDiff);
            minDiff = Math.min(minDiff, localMin);
        }
    }
}
