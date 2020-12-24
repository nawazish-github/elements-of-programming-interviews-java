package recursion.depth_first_search;

import list.util.BinaryNode;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AllPathsBinaryTreeTest {

    @Test
    public void test(){
        BinaryNode<Integer> three = new BinaryNode<>(3, null, null);
        BinaryNode<Integer> four = new BinaryNode<>(4, null, null);
        BinaryNode<Integer> two = new BinaryNode<>(2, three, four);
        BinaryNode<Integer> root = new BinaryNode<>(1, null, two);

        AllPathsBinaryTree paths = new AllPathsBinaryTree();
        List<List<Integer>> list = paths.allPaths(root);
        System.out.println(list);
    }

    @Test
    public void test2(){
        BinaryNode<Integer> root = new BinaryNode<>(1, null, null);

        AllPathsBinaryTree paths = new AllPathsBinaryTree();
        List<List<Integer>> list = paths.allPaths(root);
        System.out.println(list);
    }

    @Test
    public void test3(){
        BinaryNode<Integer> two = new BinaryNode<>(2, null, null);
        BinaryNode<Integer> root = new BinaryNode<>(1, two, null);
        AllPathsBinaryTree paths = new AllPathsBinaryTree();
        List<List<Integer>> list = paths.allPaths(root);
        System.out.println(list);
    }

    @Test
    public void test4(){
        BinaryNode<Integer> two = new BinaryNode<>(2, null, null);
        BinaryNode<Integer> root = new BinaryNode<>(1, null, two);
        AllPathsBinaryTree paths = new AllPathsBinaryTree();
        List<List<Integer>> list = paths.allPaths(root);
        System.out.println(list);
    }

    @Test
    public void test5(){
        AllPathsBinaryTree paths = new AllPathsBinaryTree();
        List<List<Integer>> list = paths.allPaths(null);
        System.out.println(list);
    }

    @Test
    public void test6(){
        BinaryNode<Integer> three = new BinaryNode<>(3, null, null);
        BinaryNode<Integer> two = new BinaryNode<>(2, three, null);
        BinaryNode<Integer> root = new BinaryNode<>(1, null, two);

        AllPathsBinaryTree paths = new AllPathsBinaryTree();
        List<List<Integer>> list = paths.allPaths(root);
        System.out.println(list);
    }
}
