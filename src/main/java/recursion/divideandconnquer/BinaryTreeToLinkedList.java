package recursion.divideandconnquer;

import tree.util.BinaryNode;
import tree.util.Solution;

/**
 * Given a binary tree, return head of the linkedlist while traversing the binary tree in inorder traversal.
 */
public class BinaryTreeToLinkedList {

    public Solution<Integer> binaryTreeToLinkedList(BinaryNode<Integer> root){
        if(root == null){
            return new Solution(null, null);
        }

        Solution result = new Solution();

        Solution lhs = binaryTreeToLinkedList(root.left);
        if(lhs.head == null){
            result.head = root;
            result.tail = root;
        }else{
            result.head = lhs.head;
            lhs.tail.right = root;
            result.tail = root;
        }

        Solution rhs = binaryTreeToLinkedList(root.right);
        if(rhs.head != null){
            result.tail.right = rhs.head;
            result.tail = rhs.tail; //DOUBTFUL LINE
        }

        return result;
    }
}



