package tree.binarytree;

import list.util.BinaryNode;

public class BalancedBinaryTreeRepeat {

    public boolean isBalancedBinaryTree(BinaryNode<Integer> root){
        if(isBalancedBinaryTree(root, 1)>1) return false;
        return true;
    }


    private int isBalancedBinaryTree (BinaryNode<Integer> node, int currSize){
        if(node == null) return currSize;

        int leftLen = isBalancedBinaryTree(node.left, currSize+1);
        int rightLen = isBalancedBinaryTree(node.right, currSize+1);

        return Math.abs(leftLen-rightLen);
    }
}
