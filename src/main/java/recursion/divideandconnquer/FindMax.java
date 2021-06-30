package recursion.divideandconnquer;

public class FindMax {

    public int findMax(int[] arr) {
        return findMax(arr, 0, arr.length-1);
    }

    private int findMax(int[] arr, int lo, int hi) {
        if (lo == hi) return arr[lo];

        int mid = (hi - lo) / 2;
        int lhs = findMax(arr, lo, mid);
        int rhs = findMax(arr, mid+1, hi);

        return Math.max(lhs, rhs);
    }
}
