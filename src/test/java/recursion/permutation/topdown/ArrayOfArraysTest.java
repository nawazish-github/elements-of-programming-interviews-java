package recursion.permutation.topdown;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class ArrayOfArraysTest {

    @Test
    public void test(){
        List<List<Integer>> input = new LinkedList<>();

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        input.add(list);

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(3);
        input.add(list1);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        input.add(list2);

        ArrayOfArrays arrayOfArrays = new ArrayOfArrays();
        List<List<Integer>> lists = arrayOfArrays.arrayOfArrays(input);

        System.out.println(lists);
    }
}
