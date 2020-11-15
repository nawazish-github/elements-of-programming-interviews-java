package recursion.depth_first_search;

import list.util.BinaryNode;

import java.util.LinkedList;
import java.util.List;

public class Path {
    public List<Integer> path(BinaryNode<Integer> root, int target){
        List<Integer> result = new LinkedList<>();
        path(root, target, result);
        return result;
    }

    private void path(BinaryNode<Integer> root, int target, List<Integer> result) {
        if(root == null) return;
        if(root.data == target){
            result.add(root.data);
            return;
        }

        result.add(root.data);
        path(root.left, target, result);
        path(root.right, target, result);

        if(result.get(result.size()-1) != target ){
            result.remove(result.size()-1);
        }
    }
}
