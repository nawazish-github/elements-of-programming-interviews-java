package recursion.combination.bottomup;

import java.util.ArrayList;
import java.util.List;

public class Combination2 {

    public List<List<Integer>> combinations(List<Integer> arr){
        return combinations2(arr, 0);
    }

    private List<List<Integer>> combinations(List<Integer> arr,  int i){
        if(i == arr.size()){
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>());
            return result;
        }

        Integer currNum = arr.get(i);
        List<List<Integer>> select = combinations(arr, i + 1);
        List<List<Integer>> reject = combinations(arr, i + 1);
        for(List<Integer> incl : select){
            incl.add(currNum);
        }
        List<List<Integer>> result = new ArrayList<>();
        result.addAll(select);
        result.addAll(reject);
        return result;
    }


    private List<List<Integer>> combinations2(List<Integer> arr,  int i){
        if(i == arr.size()){
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>());
            return result;
        }

        List<List<Integer>> result = new ArrayList<>();
        Integer currNum = arr.get(i);
        List<List<Integer>> select = combinations(arr, i + 1);
        //List<List<Integer>> reject = new ArrayList<>(select);
        for(List<Integer> incl : select){
            result.add(new ArrayList<>(incl));
            incl.add(currNum);
            result.add(new ArrayList<>(incl));
        }
        /*result.addAll(select);
        result.addAll(reject);*/
        return result;
    }

    public static void main(String[] args) {
        Combination2 combination2 = new Combination2();
        System.out.println(combination2.combinations(List.of(1,2)));
    }
}
