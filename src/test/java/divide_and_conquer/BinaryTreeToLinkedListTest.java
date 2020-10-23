package divide_and_conquer;

import org.junit.jupiter.api.Test;
import recursion.divideandconnquer.BinaryTreeToLinkedList;
import tree.util.BinaryNode;
import tree.util.Solution;

public class BinaryTreeToLinkedListTest {
    @Test
    public void singleNode(){
        BinaryTreeToLinkedList binaryTreeToLinkedList = new BinaryTreeToLinkedList();
        Solution<Integer> integerSolution =
                binaryTreeToLinkedList.binaryTreeToLinkedList(new BinaryNode<Integer>(1, null, null));
        System.out.println(integerSolution);
    }

    @Test
    public void simpleBinaryTree(){
        BinaryTreeToLinkedList binaryTreeToLinkedList = new BinaryTreeToLinkedList();
        BinaryNode<Integer> three = new BinaryNode<>(3, null, null);
        BinaryNode<Integer> four = new BinaryNode<>(4, null, null);
        BinaryNode<Integer> five = new BinaryNode<>(5, three, four);
        Solution<Integer> integerSolution = binaryTreeToLinkedList.binaryTreeToLinkedList(five);
        System.out.println(integerSolution);
    }

    @Test
    public void oneLevelBinaryTreeRightChildNull(){
        BinaryTreeToLinkedList binaryTreeToLinkedList = new BinaryTreeToLinkedList();
        BinaryNode<Integer> three = new BinaryNode<>(3, null, null);
        BinaryNode<Integer> five = new BinaryNode<>(5, three, null);
        Solution<Integer> integerSolution = binaryTreeToLinkedList.binaryTreeToLinkedList(five);
        System.out.println(integerSolution);
    }
}
