package tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class RiverSizesTest {

    @Test
    public void riverSizesTest(){
        int [][] inputMatrix = new int[][]{
                {1,0,0,1,0},
                {1,0,1,0,0},
                {0,0,1,0,1},
                {1,0,1,0,1},
                {1,0,1,1,0}
        };
       RiverSizes riverSizes = new RiverSizes();
       ArrayList<Integer> integers = riverSizes.riverSizes(inputMatrix);
        Assertions.assertEquals(5, integers.size());
        Integer[] i = new Integer[5];
        Integer[] j = integers.toArray(i);
        Arrays.sort(j);
        Assertions.assertArrayEquals(new Integer[]{1,2,2,2,5}, j);
    }
}
