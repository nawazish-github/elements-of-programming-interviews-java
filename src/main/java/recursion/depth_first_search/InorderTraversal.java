package recursion.depth_first_search;

import tree.binarytree.TreeNode;

public class InorderTraversal {
    public void Inorder(TreeNode root) {
        if (root.left == null && root.right == null) {
            System.out.println(root.val);
            return;
        }

        if (root.left != null) {
            Inorder(root.left);
        }

        System.out.println(root.val);

        if (root.right != null) {
            Inorder(root.right);
        }
    }
}
