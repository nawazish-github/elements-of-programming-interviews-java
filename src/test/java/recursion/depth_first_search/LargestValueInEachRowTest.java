package recursion.depth_first_search;

import list.util.BinaryNode;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LargestValueInEachRowTest {

    @Test
    public void test() {
        BinaryNode<Integer> threLeaf = new BinaryNode<>(3, null, null);
        BinaryNode<Integer> nine = new BinaryNode<>(9, null, null);
        BinaryNode<Integer> two = new BinaryNode<>(2, null, nine);
        BinaryNode<Integer> five = new BinaryNode<>(5, null, null);
        BinaryNode<Integer> threeLeft = new BinaryNode<>(3, five, threLeaf);
        BinaryNode<Integer> root = new BinaryNode<>(1, threeLeft, two);

        LargestValueInEachRow largestValueInEachRow = new LargestValueInEachRow();
        List<Integer> integers = largestValueInEachRow.largestValues(root);
        System.out.println(integers);
    }
}
