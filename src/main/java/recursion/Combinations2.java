package recursion;

import java.util.ArrayList;
import java.util.List;

public class Combinations2 {

    public List<List<Integer>> combinations(int[] arr){
        List<List<Integer>> combinations = new ArrayList<>();
        combinations.add(new ArrayList<>());
        return combinations(combinations, 0, arr);
    }

    private List<List<Integer>> combinations(List<List<Integer>> combinations, int i, int[] arr) {
        if(i == arr.length) return combinations;
        List<List<Integer>> cpCombos = new ArrayList<>(combinations);
        for(List<Integer> list : combinations){
            List<Integer> cpList = new ArrayList<>(list);
            cpList.add(arr[i]);
            cpCombos.add(cpList);
        }
        return combinations(cpCombos, i+1, arr);
    }

    public List<List<Integer>> combinationsBottomUp(int[] arr, int i){
        if (i == arr.length){
            ArrayList<List<Integer>> lists = new ArrayList<>();
            lists.add(new ArrayList<>());
            return lists;
        }

        List<List<Integer>> results = combinationsBottomUp(arr, i + 1);
        List<List<Integer>> toReturn = new ArrayList<>();
        //List<List<Integer>> copyResults = new ArrayList<>(toReturn);
        for(List<Integer> combination : results){
           /* List<Integer> cpList = new ArrayList<>(combination);
            cpList.add(0, arr[i]);
            copyResults.add(cpList);*/

           toReturn.add(new ArrayList<>(combination));
           combination.add(0, arr[i]);
           toReturn.add(new ArrayList<>(combination));

        }

        return toReturn;
    }

    public void combinationsWithPath(int[] arr, int i, List<List<Integer>> combinations,
                                                    List<Integer> currPath){

        if(i == arr.length){
            combinations.add(currPath);
            return;
        }

        List<Integer> path = new ArrayList<>(currPath);
        path.add(arr[i]);
        combinationsWithPath(arr, i+ 1, combinations, path);
        combinationsWithPath(arr, i+ 1, combinations, currPath);

    }

    public static void main(String[] args) {
        Combinations2 combinations2 = new Combinations2();
        //List<List<Integer>> combinations = combinations2.combinations(new int[]{1, 2, 3});
        //List<List<Integer>> combinations = combinations2.combinationsBottomUp(new int[]{1, 2, 3}, 0);
        ArrayList<List<Integer>> combinations = new ArrayList<>();
        combinations2.combinationsWithPath(new int[]{1, 2, 3}, 0, combinations, new ArrayList<Integer>());
        System.out.println(combinations);
    }
}
