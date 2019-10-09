package tree.binarytree;

import list.util.BinaryNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BalancedBinaryTreeTest {

    @Test
    public void isBalancedBinaryTreeTest1(){
        BinaryNode z = new BinaryNode('z', null, null);
        BinaryNode y = new BinaryNode('y', z, null);
        BinaryNode x = new BinaryNode('x', y, null);

        //BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
        BalancedBinaryTreeRepeat balancedBinaryTree = new BalancedBinaryTreeRepeat();
        boolean actual = balancedBinaryTree.isBalancedBinaryTree(x);

        Assertions.assertEquals(false, actual);

    }

    @Test
    public void isBalancedBinaryTreeTest2(){
        BinaryNode z = new BinaryNode('z', null, null);

        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
        boolean actual = balancedBinaryTree.isBalancedBinaryTree(z);

        Assertions.assertEquals(true, actual);

    }

    @Test
    public void isBalancedBinaryTreeTest3(){
        BinaryNode eight = new BinaryNode(8, null, null);
        BinaryNode five = new BinaryNode(5, null, null);
        BinaryNode thirteen = new BinaryNode(13, null, null);
        BinaryNode ten = new BinaryNode(10, null, null);
        BinaryNode eleven = new BinaryNode(11, null, null);
        BinaryNode twelve = new BinaryNode(12, null, null);
        BinaryNode four = new BinaryNode(4, eight, null);
        BinaryNode two = new BinaryNode(2, four, five);
        BinaryNode seven = new BinaryNode(7, eleven, twelve);
        BinaryNode nine = new BinaryNode(9, null, thirteen);
        BinaryNode six = new BinaryNode(6, nine, ten);
        BinaryNode three = new BinaryNode(3, six, seven);
        BinaryNode one = new BinaryNode(1, two, three);

        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
        boolean actual = balancedBinaryTree.isBalancedBinaryTree(one);

        Assertions.assertEquals(true, actual);
    }
}
