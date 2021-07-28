package dynamic_programming;


/**
 * Given an array of integers and a target number, find the different ways the numbers in the list can be
 * added or substracted to get the target number. Examaple, list = [1,2,3,4], target = 0. Answers:
 * 1 -2 -3 +4 = 0
 */

import java.util.ArrayList;
import java.util.List;

public class TargetSum {
    public List<Integer> targetSum(int[] arr, int target) {
        List<Integer> currList = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        targetSum(arr, target, 0, 0, currList, result);
        return result.get(0);
    }

    private void targetSum(int[] arr, int target, int i, int currSum, List<Integer> currList,
                           List<List<Integer>> result) {

        if (i >= arr.length) {
            if (currSum == target) {
                result.add(new ArrayList<>(currList));
                return;
            }
            return;
        }

        currList.add(arr[i]);
        targetSum(arr, target, i + 1, currSum + arr[i], currList, result);

        currList.remove(new Integer(arr[i]));

        currList.add(-(arr[i]));
        targetSum(arr, target, i + 1, currSum - arr[i], currList, result);

        currList.remove(new Integer(-arr[i]));
    }
}
