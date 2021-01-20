package recursion.depth_first_search;

import list.util.BinaryNode;

import java.util.LinkedList;
import java.util.List;

public class GoodNodes {

    int result = 0;

    public int goodNodes(BinaryNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;

        dfs(root, new LinkedList<BinaryNode<Integer>>());
        return result;
    }

    private void dfs (BinaryNode<Integer> node, List<BinaryNode<Integer>> currPath){
        if(node == null) return;

        currPath.add(node);

        boolean flag = false;
        for(BinaryNode<Integer> n : currPath){
            if (n.data > node.data) {
                flag = true;
                break;
            }
        }
        if(!flag) result += 1;

        dfs(node.left, currPath);
        dfs(node.right, currPath);

        currPath.remove(currPath.size()-1);
    }
}
