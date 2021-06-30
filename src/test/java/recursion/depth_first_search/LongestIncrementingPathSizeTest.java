package recursion.depth_first_search;

import list.util.BinaryNode;
import org.junit.jupiter.api.Test;

public class LongestIncrementingPathSizeTest {

    @Test
    public void test(){
        BinaryNode<Integer> four = new BinaryNode<>(4, null, null);
        BinaryNode<Integer> two = new BinaryNode<>(2, null, null);
        BinaryNode<Integer> three = new BinaryNode<>(3,two, four);
        BinaryNode<Integer> five = new BinaryNode<>(5,null, null);
        BinaryNode<Integer> root = new BinaryNode<>(1, three, five);

        LongestIncrementingPathSize longestIncrementingPathSize = new LongestIncrementingPathSize();
        int lip = longestIncrementingPathSize.lip(root);
        System.out.println(lip);
    }

    @Test
    public void test2(){
        BinaryNode<Integer> nine = new BinaryNode<>(9,null, null);
        BinaryNode<Integer> eight = new BinaryNode<>(8,null, null);
        BinaryNode<Integer> seven = new BinaryNode<>(7,eight, nine);
        BinaryNode<Integer> six = new BinaryNode<>(6,null, seven);
        BinaryNode<Integer> ten = new BinaryNode<>(10,null, null);
        BinaryNode<Integer> five = new BinaryNode<>(5,null, six);
        BinaryNode<Integer> four = new BinaryNode<>(4, null, five);
        BinaryNode<Integer> three = new BinaryNode<>(3,null, null);
        BinaryNode<Integer> two = new BinaryNode<>(2, three, four);
        BinaryNode<Integer> root = new BinaryNode<>(1, two, ten);

        LongestIncrementingPathSize longestIncrementingPathSize = new LongestIncrementingPathSize();
        int lip = longestIncrementingPathSize.lip(root);
        System.out.println(lip);
    }
    @Test
    public void test3(){
        BinaryNode<Integer> root = new BinaryNode<>(1, null, null);
        LongestIncrementingPathSize longestIncrementingPathSize = new LongestIncrementingPathSize();
        int lip = longestIncrementingPathSize.lip(root);
        System.out.println(lip);
    }

    @Test
    public void test4(){
        LongestIncrementingPathSize longestIncrementingPathSize = new LongestIncrementingPathSize();
        int lip = longestIncrementingPathSize.lip(null);
        System.out.println(lip);
    }
}
