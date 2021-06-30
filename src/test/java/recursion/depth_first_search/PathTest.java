package recursion.depth_first_search;

import list.util.BinaryNode;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PathTest {

    @Test
    public void test(){
        Path path = new Path();
        BinaryNode<Integer> four = new BinaryNode<>(4, null, null);
        BinaryNode<Integer> two = new BinaryNode<>(2, null, null);
        BinaryNode<Integer> three = new BinaryNode<>(3,two, four);
        BinaryNode<Integer> five = new BinaryNode<>(5,null, null);
        BinaryNode<Integer> root = new BinaryNode<>(1, three, five);

        List<Integer> resPath = path.path(root, 4);

        System.out.println(resPath);
    }

    @Test
    public void noResult(){
        Path path = new Path();
        BinaryNode<Integer> four = new BinaryNode<>(4, null, null);
        BinaryNode<Integer> two = new BinaryNode<>(2, null, null);
        BinaryNode<Integer> three = new BinaryNode<>(3,two, four);
        BinaryNode<Integer> five = new BinaryNode<>(5,null, null);
        BinaryNode<Integer> root = new BinaryNode<>(1, three, five);

        List<Integer> resPath = path.path(root, 8);

        System.out.println(resPath);
    }

    @Test
    public void noInput(){
        Path path = new Path();
        BinaryNode<Integer> four = new BinaryNode<>(4, null, null);
        BinaryNode<Integer> two = new BinaryNode<>(2, null, null);
        BinaryNode<Integer> three = new BinaryNode<>(3,two, four);
        BinaryNode<Integer> five = new BinaryNode<>(5,null, null);
        BinaryNode<Integer> root = new BinaryNode<>(1, three, five);

        List<Integer> resPath = path.path(null, 8);

        System.out.println(resPath);
    }
}
