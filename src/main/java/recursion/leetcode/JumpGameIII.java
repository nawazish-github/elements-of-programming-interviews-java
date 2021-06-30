package recursion.leetcode;

import java.util.HashMap;
import java.util.Map;

public class JumpGameIII {
    private Map<Integer, Boolean> isVisitedMap = new HashMap<>();
    public boolean canReach(int[] arr, int start) {

        return canReach(arr, start, 0, arr.length-1);
    }

    private boolean canReach(int[] arr, int start, int lower, int upper){
        if(isVisitedMap.containsKey(start)) return false;
        if(start < lower || start > upper) return false;
        if(arr[start] == 0) return true;

        isVisitedMap.put(start, true);

        int leftStart = start + arr[start];
        int rightStart = start - arr[start];

        boolean lhs = canReach(arr, leftStart, lower, upper);
        boolean rhs = canReach(arr, rightStart, lower, upper);

        return lhs || rhs;
    }
}
