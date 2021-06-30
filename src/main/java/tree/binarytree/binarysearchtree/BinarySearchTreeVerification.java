package tree.binarytree.binarysearchtree;

import list.util.BinaryNode;

public class BinarySearchTreeVerification {

    public boolean verifyBST (BinaryNode<Integer> root){
        if (root == null) {
            return false;
        }
        return verifyBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean verifyBST (BinaryNode<Integer> node, int greaterThanThisVal, int lessThanThisVal){
        if(node != null){
            if(node.data >= greaterThanThisVal && node.data < lessThanThisVal &&
                    verifyBST(node.left,greaterThanThisVal, node.data) &&
                    verifyBST(node.right, node.data, lessThanThisVal)) return true;
            else
                return false;
        }
        return true;
    }
}
