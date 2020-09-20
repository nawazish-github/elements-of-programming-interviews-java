package recursion.permutation.topdown;

import list.util.BinaryNode;

import java.util.*;

public class BSTArrays {
    public LinkedList<List<Integer>> bstArrays(BinaryNode<Integer> root){
        LinkedList<List<Integer>> result = new LinkedList<>();
        LinkedList<Integer> path = new LinkedList<>();
        HashSet<BinaryNode> available = new HashSet<>(Arrays.asList(root));
        bstArrays(available, path, result);
        System.out.println("Available: "+available);
        return result;
    }

    private  void bstArrays(HashSet<BinaryNode> available, LinkedList<Integer> path, LinkedList<List<Integer>> result) {
        if(available.size() == 0){
            result.add(new LinkedList<>(path));
            return;
        }

        for (BinaryNode<Integer> n : available.toArray(new BinaryNode[]{})){
            available.remove(n);
            path.add(n.data);
            if(n.left != null) available.add(n.left);
            if(n.right != null) available.add(n.right);

            bstArrays(available, path, result);

            available.add(n);
            available.remove(n.left);
            available.remove(n.right);
            path.remove(path.size()-1);
        }
    }

}
