package stack;

import list.util.BinaryNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tree.binarytree.SizeOfLongestConsequetiveBranch;

public class SizeOfLongestConsequetiveBranchTest {

    @Test
    public  void longestConsequetiveBranchTest1(){
        //BinaryNode<Integer> exp = new BinaryNode<>(3, null, null);
        BinaryNode<Integer> oneLeaftLeft = new BinaryNode<>(1, null ,null);
        BinaryNode<Integer> oneLeafRight = new BinaryNode<>(1, null ,null);
        BinaryNode<Integer> twoLeafLeft = new BinaryNode<>(2, /*exp*/ null ,null);
        BinaryNode<Integer> threeLeafRight = new BinaryNode<>(3, null ,null);
        BinaryNode<Integer> oneParentLeft = new BinaryNode<>(1, oneLeaftLeft ,twoLeafLeft);
        BinaryNode<Integer> twoParentRight = new BinaryNode<>(2, oneLeafRight ,threeLeafRight);
        BinaryNode<Integer> node = new BinaryNode<>(0, oneParentLeft ,twoParentRight);

        SizeOfLongestConsequetiveBranch sizeOfLongestConsequetiveBranch = new SizeOfLongestConsequetiveBranch();
        int size = sizeOfLongestConsequetiveBranch.longestConsequetiveBranch(node);
        Assertions.assertEquals(3, size);
    }


    @Test
    public  void longestConsequetiveBranchTest2(){
        BinaryNode<Integer> node = new BinaryNode<>(0, null ,null);

        SizeOfLongestConsequetiveBranch sizeOfLongestConsequetiveBranch = new SizeOfLongestConsequetiveBranch();
        int size = sizeOfLongestConsequetiveBranch.longestConsequetiveBranch(node);
        Assertions.assertEquals(1, size);
    }


    @Test
    public  void longestConsequetiveBranchTest3(){
        BinaryNode<Integer> node = null;

        SizeOfLongestConsequetiveBranch sizeOfLongestConsequetiveBranch = new SizeOfLongestConsequetiveBranch();
        int size = sizeOfLongestConsequetiveBranch.longestConsequetiveBranch(node);
        Assertions.assertEquals(0, size);
    }
}
