package recursion.depth_first_search;

import org.junit.jupiter.api.Test;
import tree.util.BinaryNode;

public class DeepestLeavesSumTest {

    @Test
    public void test(){
        DeepestLeavesSum deepestLeavesSum = new DeepestLeavesSum();
        BinaryNode<Integer> seven = new BinaryNode<>(7, null, null);
        BinaryNode<Integer> five = new BinaryNode<>(5, null, null);
        BinaryNode<Integer> eight = new BinaryNode<>(8, null, null);
        BinaryNode<Integer> four = new BinaryNode<>(4, seven, null);
        BinaryNode<Integer> six = new BinaryNode<>(6, null, eight);
        BinaryNode<Integer> two = new BinaryNode<>(2, four, five);
        BinaryNode<Integer> three = new BinaryNode<>(3, null, six);
        BinaryNode<Integer> root = new BinaryNode<>(1, two, three);
        int sum = deepestLeavesSum.deepestLeavesSum(root);
        System.out.println(sum);
    }
}
