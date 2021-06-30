package recursion.combination.bottomup;

import java.util.ArrayList;
import java.util.List;

public class RestrictedCombination {

    public List<List<Integer>> combinate(List<Integer> arr, int restriction){
        return combinate(arr, 0, restriction, 0);
    }

    private List<List<Integer>> combinate(List<Integer> arr, int i, int restriction, int currSize) {
       if(i == arr.size() && currSize != restriction){
           return new ArrayList<>();
       }
       if(restriction > arr.size()){
           return new ArrayList<>();
       }

       if(i == arr.size()){
           List<List<Integer>> result = new ArrayList<>();
           result.add(new ArrayList<>());
           return result;
       }

       Integer currNum = arr.get(i);
       List<List<Integer>> returnable = new ArrayList<>();
       List<List<Integer>> combinateIncl = combinate(arr, i + 1, restriction, currSize + 1);
       List<List<Integer>> combinateExcl = combinate(arr, i + 1, restriction, currSize);

       for(List<Integer> incl : combinateIncl){
           incl.add(currNum);
       }
       returnable.addAll(combinateIncl);
       returnable.addAll(combinateExcl);
       return returnable;
    }

    public static void main(String[] args) {
        RestrictedCombination restrictedCombination = new RestrictedCombination();
        List<List<Integer>> combinate = restrictedCombination.combinate(List.of(1, 2, 3), 2);
        System.out.println(combinate);
    }
}
