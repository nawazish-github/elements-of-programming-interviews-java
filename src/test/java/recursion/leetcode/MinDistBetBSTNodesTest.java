package recursion.leetcode;

import org.junit.jupiter.api.Test;
import tree.util.BinaryNode;

public class MinDistBetBSTNodesTest {
    @Test
    public void test(){
        System.out.println("test started");
        BinaryNode<Integer> one = new BinaryNode<>(1, null, null);
        BinaryNode<Integer> three = new BinaryNode<>(3, null, null);
        BinaryNode<Integer> six = new BinaryNode<>(6, null, null);
        BinaryNode<Integer> two = new BinaryNode<>(2, one, three);
        BinaryNode<Integer> root = new BinaryNode<>(4, two, six);

        MinDistBetBSTNodes minDistBetBSTNodes = new MinDistBetBSTNodes();
        int i = minDistBetBSTNodes.minDiffInBST(root);
        System.out.println(i);

    }


    @Test
    public void test2(){
        BinaryNode<Integer> twelve = new BinaryNode<>(12, null, null);
        BinaryNode<Integer> fortyNine = new BinaryNode<>(49, null, null);
        BinaryNode<Integer> fortyEight = new BinaryNode<>(48, twelve, fortyNine);
        BinaryNode<Integer> zero = new BinaryNode<>(0, null,  null);
        BinaryNode<Integer> root = new BinaryNode<>(1, zero, fortyEight);

        MinDistBetBSTNodes minDistBetBSTNodes = new MinDistBetBSTNodes();
        int i = minDistBetBSTNodes.minDiffInBST(root);
        System.out.println(i);
    }

    @Test
    public void test3(){
        BinaryNode<Integer> twentyNine = new BinaryNode<>(29, null, null);
        BinaryNode<Integer> fiftyTwo = new BinaryNode<>(52, twentyNine, null);
        BinaryNode<Integer> thirteen = new BinaryNode<>(13, null, fiftyTwo);
        BinaryNode<Integer> twelve = new BinaryNode<>(12, null,  thirteen);
        BinaryNode<Integer> root = new BinaryNode<>(96, twelve, null);

        MinDistBetBSTNodes minDistBetBSTNodes = new MinDistBetBSTNodes();
        int i = minDistBetBSTNodes.minDiffInBST(root);
        System.out.println(i);

    }
}
