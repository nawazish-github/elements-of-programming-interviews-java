package recursion.depth_first_search;

import org.junit.jupiter.api.Test;
import tree.binarytree.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class InorderTraversalTest {

    @Test
    void inorder() {
        TreeNode five = new TreeNode(5);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3, new TreeNode(4), five);
        TreeNode one = new TreeNode(1, two, three);

        InorderTraversal inorderTraversal = new InorderTraversal();
        inorderTraversal.Inorder(one);
    }
}