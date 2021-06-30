package recursion.depth_first_search;

import list.util.BinaryNode;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class LargestValueInEachRow {
    List<Integer> result = new LinkedList<>();

    public List<Integer> largestValues(BinaryNode<Integer> root) {
        PriorityQueue<BinaryNode<Integer>> list = new PriorityQueue<>(new Comparator<BinaryNode<Integer>>(){
            public int compare (BinaryNode<Integer> tn1, BinaryNode<Integer> tn2) {
                if (tn1.data > tn2.data) return +1;
                if (tn1.data == tn2.data) return 0;
                return -1;
            }
        });
        list.offer (root);
        dfs (list);
        return result;
    }

    public void dfs (PriorityQueue<BinaryNode<Integer>> list) {
        if (list.isEmpty ()) return;
        PriorityQueue<BinaryNode<Integer>> newList = new PriorityQueue<>(new Comparator<BinaryNode<Integer>>(){
            public int compare (BinaryNode<Integer> tn1, BinaryNode<Integer> tn2) {
                if (tn1.data > tn2.data) return -1;
                if (tn1.data == tn2.data) return 0;
                return +1;
            }
        });
        if (!list.isEmpty()) {
            result.add (list.peek().data);

            while (!list.isEmpty()) {
                BinaryNode<Integer> node = list.poll();

                if (node.left != null) {
                    newList.offer(node.left);
                }

                if (node.right != null) {
                    newList.offer(node.right);
                }
            }
        }
        dfs (newList);
    }
}
