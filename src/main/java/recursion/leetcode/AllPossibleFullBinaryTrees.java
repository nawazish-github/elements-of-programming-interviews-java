package recursion.leetcode;

import list.util.BinaryNode;

import java.util.LinkedList;
import java.util.List;

/**
 * 894. All Possible Full Binary Trees
 * A full binary tree is a binary tree where each node has exactly 0 or 2 children.
 *
 * Return a list of all possible full binary trees with N nodes.  Each element of the answer is the root node of one possible tree.
 *
 * Each node of each tree in the answer must have node.val = 0.
 *
 * You may return the final list of trees in any order.
 */

public class AllPossibleFullBinaryTrees {
    BinaryNode<Integer> one = new BinaryNode<>(0, null, null);
    BinaryNode<Integer> three = new BinaryNode<>(0, new BinaryNode(0, null, null),
            new BinaryNode(0, null, null));

    public List<BinaryNode<Integer>> allPossibleFBT(int N){
        if(N == 1){
            List<BinaryNode<Integer>> list = new LinkedList<>();
            list.add(new BinaryNode<>(0, null, null));
            return list;
        }
        List<BinaryNode<Integer>> list = new LinkedList<>();
        for (int i = 1; i < N; i+=2){
            List<BinaryNode<Integer>> lhs = allPossibleFBT(i);
            List<BinaryNode<Integer>> rhs = allPossibleFBT(N - i - 1);

            for(BinaryNode<Integer> leftNode : lhs){
                for(BinaryNode<Integer> rightNode : rhs){
                    BinaryNode<Integer> localRoot = new BinaryNode<>(0, null, null);
                    localRoot.left = leftNode;
                    localRoot.right = rightNode;
                    list.add(localRoot);
                }
            }
        }

        return list;
    }
}
