package tree.binarytree.binarysearchtree;

import list.util.BinaryNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeVerificationTest {

    @Test
    public void verifyBSTTest(){
        BinaryNode<Integer> root = new BinaryNode<>(5, null, null);
        BinarySearchTreeVerification binarySearchTreeVerification = new BinarySearchTreeVerification();
        boolean actual = binarySearchTreeVerification.verifyBST(root);
        Assertions.assertEquals(true, actual);
    }

    @Test
    public void verifyBSTTest2(){
        BinaryNode<Integer> one     = new BinaryNode<>(1, null, null );
        BinaryNode<Integer> three     = new BinaryNode<>(3, null, null);
        BinaryNode<Integer> six     = new BinaryNode<>(6, null, null);
        BinaryNode<Integer> eight     = new BinaryNode<>(8, null, null);
        BinaryNode<Integer>  two    = new BinaryNode<>(2, one, three);
        BinaryNode<Integer>  seven    = new BinaryNode<>(7, six, eight);
        BinaryNode<Integer> root = new BinaryNode<>(5, two, seven);
        BinarySearchTreeVerification binarySearchTreeVerification = new BinarySearchTreeVerification();
        boolean actual = binarySearchTreeVerification.verifyBST(root);
        Assertions.assertEquals(true, actual);
    }


    @Test
    public void verifyBSTTest3(){
        BinaryNode<Integer> one     = new BinaryNode<>(1, null, null );
        BinaryNode<Integer> three     = new BinaryNode<>(3, null, null);
        BinaryNode<Integer> six     = new BinaryNode<>(6, null, null);
        BinaryNode<Integer> four     = new BinaryNode<>(4, null, null);
        BinaryNode<Integer>  two    = new BinaryNode<>(2, one, three);
        BinaryNode<Integer>  seven    = new BinaryNode<>(7, six, four);
        BinaryNode<Integer> root = new BinaryNode<>(5, two, seven);
        BinarySearchTreeVerification binarySearchTreeVerification = new BinarySearchTreeVerification();
        boolean actual = binarySearchTreeVerification.verifyBST(root);
        Assertions.assertEquals(false, actual);
    }

    @Test
    public void verifyBSTTes4t(){
        BinaryNode<Integer> root = null;
        BinarySearchTreeVerification binarySearchTreeVerification = new BinarySearchTreeVerification();
        boolean actual = binarySearchTreeVerification.verifyBST(root);
        Assertions.assertEquals(false, actual);
    }


    @Test
    public void verifyBSTTest5(){
        BinaryNode<Integer> one     = new BinaryNode<>(1, null, null );
        BinaryNode<Integer> three     = new BinaryNode<>(3, null, null);
        BinaryNode<Integer> four     = new BinaryNode<>(4, null, null);
        BinaryNode<Integer> eight     = new BinaryNode<>(8, null, null);
        BinaryNode<Integer>  two    = new BinaryNode<>(2, one, three);
        BinaryNode<Integer>  seven    = new BinaryNode<>(7, four, eight);
        BinaryNode<Integer> root = new BinaryNode<>(5, two, seven);
        BinarySearchTreeVerification binarySearchTreeVerification = new BinarySearchTreeVerification();
        boolean actual = binarySearchTreeVerification.verifyBST(root);
        Assertions.assertEquals(false, actual);
    }
}
