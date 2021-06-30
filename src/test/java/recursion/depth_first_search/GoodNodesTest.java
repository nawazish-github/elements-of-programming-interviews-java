package recursion.depth_first_search;

import list.util.BinaryNode;
import org.junit.jupiter.api.Test;

public class GoodNodesTest {

    @Test
    public void test(){

        BinaryNode<Integer> threeLeft = new BinaryNode<>(3, null, null);
        BinaryNode<Integer> oneLeft = new BinaryNode<>(1, threeLeft, null);
        BinaryNode<Integer> five = new BinaryNode<>(5, null, null);
        BinaryNode<Integer> oneRight = new BinaryNode<>(1, null, null);
        BinaryNode<Integer> four = new BinaryNode<>(4, oneRight, five);

        BinaryNode<Integer> threeRoot = new BinaryNode<>(3, oneLeft, four);

        GoodNodes goodNodes = new GoodNodes();
        int i = goodNodes.goodNodes(threeRoot);
        System.out.println(i);
    }
}
