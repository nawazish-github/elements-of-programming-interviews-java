package recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FlattenTest {

    @Test
    public void flattenTest(){
        int[][] arr = new int[][]{{1,2,3}, {4}, {5,6}};
        Flatten flatten = new Flatten();
        List<Integer> actualList = flatten.flatten(arr);
        Integer[] actual = new Integer[6];
        actual=actualList.toArray(actual);
        Assertions.assertArrayEquals(actual, new Integer[]{1,2,3,4,5,6});
    }
}
