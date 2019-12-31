package array;

import java.util.HashMap;

/**
 * You are given an array of integers. Each integer represents a jump of its value in the array.
 * For instance, the integer 2 represents a jump of 2 indices forward in the array; the integer -3 represents a jump of
 * 3 indices backward in the array. If a jump spills past the array's bounds, it wraps over to the other side.
 * For instance, a jump of -1 at index 0 brings us to the last index in the array. Similarly, a jump of 1 at the
 * last index in the array brings us to index 0. Write a function that returns a boolean representing whether the jumps
 * in the array form a single cycle. A single cycle occurs if, starting at any index in the array and following the
 * jumps, every element is visited exactly once before landing back on the starting index.
 *
 * Sample input: [2, 3, 1, -4, -4, 2]
 * Sample output: true
 *
 * Credits: algoexpert.io
 */
public class SingleCycleCheck {
    public boolean hasSingleCycle(int[] array) {
        int currentIndex = 0;
        for (int i = 0; i< array.length; i++){
            if (i > 0 && currentIndex == 0)
                return false;
            currentIndex = getNextIndex(currentIndex, array);
        }
        return currentIndex == 0;
    }

    private int getNextIndex(int currentIndex, int[] array) {
        int jump = array[currentIndex];
        int nextIndex = (jump+currentIndex) % array.length;

        return nextIndex>=0?nextIndex:array.length+nextIndex;
    }
}
