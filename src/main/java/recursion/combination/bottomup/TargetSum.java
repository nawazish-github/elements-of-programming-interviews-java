package recursion.combination.bottomup;

import java.util.ArrayList;
import java.util.List;

public class TargetSum {
    public List<List<Integer>> targetSum(List<Integer> arr, int target){
        return targetSum(arr, target, 0, 0, new ArrayList<>());
    }

    private List<List<Integer>> targetSum(List<Integer> arr, int target, int i, int currSum, ArrayList<Integer> partial) {
        if(currSum > target){
            List<List<Integer>> result = new ArrayList<>();
            return result;
        }
        if(currSum == target){
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>(partial));
            return result;
        }
        if(i == arr.size()){
            List<List<Integer>> result = new ArrayList<>();
            return result;
        }

        List<List<Integer>> result = new ArrayList<>();
        Integer currNum = arr.get(i);
        partial.add(currNum);
        List<List<Integer>> continuation = targetSum(arr, target, i, currSum + currNum, partial);

        partial.remove(partial.size()-1);
        List<List<Integer>> discontinuation = targetSum(arr, target, i+1, currSum, partial);

        result.addAll(continuation);
        result.addAll(discontinuation);

        return result;
    }

    public static void main(String[] args) {
        TargetSum  targetSum = new TargetSum();
        System.out.println(targetSum.targetSum(List.of(2, 3, 1), 4));
    }

}
