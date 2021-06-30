package recursion.leetcode;

import list.util.BinaryNode;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AllPossibleFullBinaryTreesTest {

    @Test
    public void test(){
        AllPossibleFullBinaryTrees allPossibleFullBinaryTrees = new AllPossibleFullBinaryTrees();
        List<BinaryNode<Integer>> binaryNodes = allPossibleFullBinaryTrees.allPossibleFBT(5);
        System.out.println(binaryNodes);
    }
}
