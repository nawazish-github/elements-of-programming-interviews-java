package recursion.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
    public void test () {
        BinarySearch bs = new BinarySearch();
        int search = bs.search(new int[]{-1, 0, 3, 5, 9, 12}, 9);
        assertEquals(5, search);
    }
}