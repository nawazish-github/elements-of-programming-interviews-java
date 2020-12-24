package recursion.depth_first_search;

import list.util.BinaryNode;

import java.util.LinkedList;
import java.util.List;

public class AllPathsBinaryTree {
    public List<List<Integer>> allPaths(BinaryNode<Integer> root){
        List<List<Integer>> result = new LinkedList<>();
        if(root == null) return result;
        allPaths(root, new LinkedList<Integer>(), result);
        return result;
    }

    private void allPaths(BinaryNode<Integer> root, LinkedList<Integer> currPath, List<List<Integer>> result) {
        currPath.add(root.data);
        if(isLeafNode(root)){
            LinkedList<Integer> list = new LinkedList<>(currPath);
            result.add(list);
            currPath.remove(currPath.size()-1); //backtrack
            return;
        }

        if(root.left != null){
            allPaths(root.left, currPath, result);
        }

        if(root.right != null){
            allPaths(root.right, currPath, result);
        }
    }

    private boolean isLeafNode(BinaryNode<Integer> root) {
        return root.left == null && root.right == null;
    }
}
