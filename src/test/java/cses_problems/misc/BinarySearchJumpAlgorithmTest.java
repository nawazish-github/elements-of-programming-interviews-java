package cses_problems.misc;

import org.junit.jupiter.api.Test;
import recursion.leetcode.BinarySearch;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchJumpAlgorithmTest {
    @Test
    public void test () {
        BinarySearchJumpAlgorithm bs = new BinarySearchJumpAlgorithm();
        int search = bs.search(new int[]{-1, 0, 3, 5, 9, 12}, 0);
        assertEquals(1, search);
    }
}