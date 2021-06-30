package recursion.permutation.topdown;

import list.util.BinaryNode;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class BSTArraysTest {
    @Test
    public void testBSTArray(){
        BinaryNode<Integer> one = new BinaryNode(1, null, null);
        BinaryNode<Integer> four = new BinaryNode(4, null, null);
        BinaryNode<Integer> three = new BinaryNode(3, null, null);
        BinaryNode<Integer> root = new BinaryNode(2, one, three);

        BSTArrays bstArrays = new BSTArrays();
        LinkedList<List<Integer>> lists = bstArrays.bstArrays(root);

        System.out.println(lists);
    }
}
