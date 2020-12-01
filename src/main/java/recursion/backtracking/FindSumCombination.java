package recursion.backtracking;

import java.util.LinkedList;
import java.util.List;

public class FindSumCombination {
    public List<List<Integer>> findSumCombination(int[] arr, int target){
        List<List<Integer>> result = new LinkedList<>();
        findSumCombination(arr,target, 0, new LinkedList<Integer>(), result);
        return result;
    }

    public void findSumCombination(int[] arr, int target, int i, List<Integer> currList, List<List<Integer>>result){
      if(target == 0){
          result.add(new LinkedList<>(currList));
          return;
      }
      if (target < 0) return;

      if(i >= arr.length) return;

       int newTarget = target - arr[i];
       currList.add(arr[i]);
       findSumCombination(arr, newTarget, i+1, currList, result);
       currList.remove(currList.size() -1);
       findSumCombination(arr, target, i+1, currList, result);
    }
}
