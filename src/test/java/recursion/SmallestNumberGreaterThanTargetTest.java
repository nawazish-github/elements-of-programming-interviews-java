package recursion;

import org.junit.jupiter.api.Test;

import  static org.junit.jupiter.api.Assertions.*;

import java.util.List;


public class SmallestNumberGreaterThanTargetTest {

    @Test
    public void test(){
        SmallestNumberGreaterThanTarget smallestNumberGreaterThanTarget = new SmallestNumberGreaterThanTarget();
        int i = smallestNumberGreaterThanTarget.indexOfSmallestNumberGreaterThanTargetNumber(List.of(2, 3, 4, 8, 9, 15, 20, 21), 5);
        int j = smallestNumberGreaterThanTarget.indexOfSmallestNumberGreaterThanTargetNumber(List.of(2, 3, 4, 8, 9, 15, 20, 21), 1);
        int k = smallestNumberGreaterThanTarget.indexOfSmallestNumberGreaterThanTargetNumber(List.of(2, 3, 4, 8, 9, 15, 20, 21), 23);
        int l = smallestNumberGreaterThanTarget.indexOfSmallestNumberGreaterThanTargetNumber(List.of(0, 3, 4, 8, 9, 15, 20, 21), 2);

        assertEquals(3, i);
        assertEquals(0, j);
        assertEquals(-1, k);
        assertEquals(1, l);
    }
}
