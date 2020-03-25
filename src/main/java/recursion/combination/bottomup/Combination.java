package recursion.combination.returnvalue;

import java.util.ArrayList;
import java.util.List;

public class Combination {

    public List<List<Integer>> permutate (List<Integer> arr){

        return permutate(arr, 0);
    }

    private List<List<Integer>> permutate(List<Integer> arr, int i) {
        if(i == arr.size()){
            List<List<Integer>> res = new ArrayList<>();
            res.add(new ArrayList<>());
            return res;
        }

        Integer currNum = arr.get(i);
        List<List<Integer>> combinations = permutate(arr, i + 1);
        List<List<Integer>> result = new ArrayList<>();
        for(List<Integer> comb : combinations){
            result.add(new ArrayList<>(comb));
            comb.add(currNum);
            result.add(new ArrayList<>(comb));
        }
        return result;
    }

    public static void main(String[] args) {
        Combination perm = new Combination();
        System.out.println(perm.permutate(List.of(1,2,3)));
    }
}
