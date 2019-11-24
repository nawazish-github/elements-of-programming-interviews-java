package recursion;

import java.util.ArrayList;
import java.util.List;

public class RestrictedCombination3 {

    public List<List<Integer>> restrictedCombination(int[] arr){
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> partialList = new ArrayList<>();

        restrictedCombination(0, partialList, results, arr);
        return results;
    }

    private void restrictedCombination(int i, List<Integer> partialList, List<List<Integer>> results, int[] arr) {
        if(partialList.size() > 3) return;
        if(i == arr.length && partialList.size() < 3) {
            return;
        }
        if(i == arr.length){
            results.add(new ArrayList<>(partialList));
            return;
        }

        partialList.add(arr[i]);
        restrictedCombination(i+1, partialList, results, arr);
        partialList.remove(partialList.size()-1);
        restrictedCombination(i+1, partialList, results, arr);
    }

    public static void main(String[] args) {
        RestrictedCombination3 restrictedCombination3 = new RestrictedCombination3();
        System.out.println(restrictedCombination3.restrictedCombination(new int[]{1,2,3}));
        //System.out.println(restrictedCombination3.restrictedCombinationList(new int[]{1,2,3}));
    }

    public List<List<Integer>> restrictedCombinationList(int[] arr){
        return restrictedCombinationList(0, new ArrayList<>(), new ArrayList<List<Integer>>(), arr);
    }

    private List<List<Integer>> restrictedCombinationList(int i, List<Integer> partialList, List<List<Integer>> results,
                                                      int[] arr){
        if(partialList.size() > 3) {
            return new ArrayList<List<Integer>>();
        }
        if(i == arr.length && partialList.size() < 3) {
            return new ArrayList<List<Integer>>();
        }
        if(i == arr.length){
            results.add(new ArrayList<>(partialList));
            return results;
        }

        partialList.add(arr[i]);
        restrictedCombination(i+1, partialList, results, arr);
        partialList.remove(partialList.size()-1);
        restrictedCombination(i+1, partialList, results, arr);
        return results;
    }
}
