package tree.binarytree;

import list.util.BinaryNode;

public class BalancedBinaryTree {
    public boolean isBalancedBinaryTree (BinaryNode node){
        if(balancedHeight(node) > -1) return true;
        return false;
    }

    private int balancedHeight(BinaryNode node) {
        if(node == null){
            return 0;
        }
        int leftHeight = balancedHeight(node.left);
        int rightHeight = balancedHeight(node.right);
        if (leftHeight == -1 || rightHeight == -1){
            return -1;
        }
        if(Math.abs(leftHeight - rightHeight)>1){
            return -1;
        }
        return leftHeight > rightHeight ? leftHeight+1 : rightHeight+1;
    }
}
