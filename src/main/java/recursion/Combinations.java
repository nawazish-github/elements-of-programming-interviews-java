package recursion;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public List<List<Integer>> combinations (int[] arr){
        //return combinations (arr, 0);
        return combinations(arr, 0, new ArrayList<List<Integer>>(), new ArrayList<>());
    }

    private List<List<Integer>> combinations(int[] arr, int i, ArrayList<List<Integer>> results, ArrayList<Integer> path) {
        if(i == arr.length){
            results.add(path);
            return results;
        }

       int elem = arr[i];

        ArrayList<Integer> pathWithElement = new ArrayList<>(path);
        pathWithElement.add(elem);

        combinations(arr, i+1, results, pathWithElement);
        combinations(arr, i+1, results, path);

        return results;
    }

    private List<List<Integer>> combinations(int[] arr, int i) {
        if(i == arr.length){
            List<List<Integer>> results = new ArrayList<>();
            results.add(new ArrayList<Integer>());
            return results;
        }

        int elem = arr[i];
        List<List<Integer>> results = new ArrayList<>();
        for(List<Integer> list : combinations(arr, i+1)){
            results.add(new ArrayList<>(list));
            if(list.size() < 3){
                list.add(elem);
                if(list.size() == 3)
                results.add(new ArrayList<>(list));
            }
        }
        return results;
    }



    public static void main(String[] args) {
        Combinations combinations = new Combinations();
        List<List<Integer>> combos = combinations.combinations(new int[]{1, 2, 3, 4});
        System.out.println(combos);
    }
}
