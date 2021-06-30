package recursion.depth_first_search;

import tree.util.BinaryNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class DeepestLeavesSum {
    List<Tuple> list = new LinkedList<>();

    public int deepestLeavesSum(BinaryNode<Integer> root) {
        if(root == null) return 0;
        if(isLeaf(root)) return 1;

        dfs(root, 1);

        System.out.println();
        Collections.sort(list, (t1, t2)-> t2.depth - t1.depth);

        int sum = 0;
        int maxDepth = list.get(0).depth;
        sum = list.get(0).val;


        for(int i = 1; i < list.size(); i++){
            if(list.get(i).depth == maxDepth){
                sum += list.get(i).val;
            }
        }

        return sum;
    }

    public void dfs(BinaryNode<Integer> root, int currDepth) {
        if(root == null) return;
        if(isLeaf(root)){
            Tuple t = new Tuple();
            t.depth = currDepth;
            t.val = root.data;
            list.add(t);
            return;
        }

        dfs(root.left, currDepth + 1);
        dfs(root.right, currDepth + 1);
    }

    private boolean isLeaf(BinaryNode root){
        return root.left == null && root.right == null;
    }
}

class Tuple{
    int depth;
    int val;
}