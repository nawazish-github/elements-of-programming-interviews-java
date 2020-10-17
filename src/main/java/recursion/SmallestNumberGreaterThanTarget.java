package recursion;

import java.util.List;

public class SmallestNumberGreaterThanTarget {
    public int indexOfSmallestNumberGreaterThanTargetNumber(List<Integer> integers, int target) {
        return indexOfSmallestNumberGreaterThanTargetNumber(integers, 0, integers.size()-1, target);
    }

    private int indexOfSmallestNumberGreaterThanTargetNumber(List<Integer> integers, int start, int end, int target) {
        if(Math.abs(start-end) == 1 && integers.get(0) > target) return 0;
        else if(Math.abs(start-end) == 1 && integers.get(1)>target) return 1;
        else if(Math.abs(start - end) == 1 && integers.get(0) < target && integers.get(1) < target) return -1;

        if(Math.abs(start-end) == 2){
            if(integers.get(0) > target) return 0;
            else return 1;
        }
        int mid = (start + end) / 2;
        if (integers.get(mid) > target && integers.get(mid - 1) > target){
            return indexOfSmallestNumberGreaterThanTargetNumber(integers, start, mid-1, target);
        } else
        if (integers.get(mid) > target){
            return mid;
        }
        if(integers.get(mid) < target){
            return indexOfSmallestNumberGreaterThanTargetNumber(integers, mid+1, end, target);
        }else if(integers.get(mid-1) < target){
            return indexOfSmallestNumberGreaterThanTargetNumber(integers, mid+1, end, target);
        }
        return -1;
    }
}
