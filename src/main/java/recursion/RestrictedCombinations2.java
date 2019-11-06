package recursion;

import java.util.ArrayList;
import java.util.List;

public class RestrictedCombinations2 {
    public List<List<Integer>> restrictedCombinations (int[] arr){
        List<List<Integer>> combinations = new ArrayList<>();
        combinations.add(new ArrayList<>());
        return restrictedCombinations(arr, new ArrayList<Integer>(),combinations, 0);
    }

    private List<List<Integer>> restrictedCombinations(int[] arr, List<Integer> list,List<List<Integer>> combinations, int i) {
        if(i == arr.length){
            return combinations;
        }

        if(list.size() == 2){
            combinations.add(list);
            return combinations;
        }

        List<List<Integer>> cpCombinations = new ArrayList<>(combinations);
        for(List<Integer> tmpList : combinations){
            List<Integer> cpList = new ArrayList<>(tmpList);
            cpList.add(arr[i]);
            cpCombinations.add(cpList);
        }
        return null;
    }
}
