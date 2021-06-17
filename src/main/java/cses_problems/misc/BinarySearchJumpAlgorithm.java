package cses_problems.misc;

public class BinarySearchJumpAlgorithm {
    int search (int [] array, int target) {
        int k = 0;
        int n = array.length;
        for (int b = n/2; b >= 1; b /= 2) {
            while (k+b < n && array[k+b] <= target) k += b; }
        if (array[k] == target) {
            return k;
        }
        return -1;
    }
}
