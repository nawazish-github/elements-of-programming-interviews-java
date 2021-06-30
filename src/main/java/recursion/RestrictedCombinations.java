package recursion;

import java.util.ArrayList;
import java.util.List;

public class RestrictedCombinations {
    public List<List<Integer>> restrictedCombinations(int[] arr, final int target){
        return restrictedCombinations(arr, 0, 0, target);
    }

    private List<List<Integer>> restrictedCombinations(int[] arr, int i, int currSize, int target) {

        if(i == arr.length && currSize != target){
            return new ArrayList<List<Integer>>();
        }
        if(target > arr.length) {
            return new ArrayList<List<Integer>>();
        }
        if(i == arr.length){
            List<List<Integer>> results = new ArrayList<>();
            results.add(new ArrayList<Integer>());
            return results;
        }

        List<List<Integer>> incl = restrictedCombinations(arr, i+1, currSize+1, target);
        List<List<Integer>> excl = restrictedCombinations(arr, i+1, currSize, target);
        List<List<Integer>> results = new ArrayList<>();

        for(List<Integer> list : incl){
            list.add(arr[i]);
            results.add(list);
        }

        results.addAll(excl);

        return results;
    }

    public static void main(String[] args) {
        RestrictedCombinations restrictedCombinations = new RestrictedCombinations();
        List<List<Integer>> lists = restrictedCombinations.restrictedCombinations(new int[]{1, 2, 3, 4}, 2);
        System.out.println(lists);
    }
}
