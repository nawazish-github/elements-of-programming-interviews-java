package recursion.combination;

import java.util.ArrayList;
import java.util.List;

public class CombinationRestricted {
    public List<List<Integer>> permutate(List<Integer> arr, int restriction){
        List<List<Integer>> res = new ArrayList<>();
        permutate(0, arr, res, new ArrayList<Integer>(), restriction);
        return res;
    }

    private void permutate(int i, List<Integer> arr, List<List<Integer>> res, List<Integer> partial, int restriction) {
        if(i>= arr.size() && partial.size() != restriction){
            return;
        }

        if(i >= arr.size()){
            List<Integer> partCopy = new ArrayList<>(partial);
            res.add(partCopy);
            return;
        }

        Integer currNum = arr.get(i);
        List<Integer> partCopy = new ArrayList<>(partial);
        partCopy.add(currNum);
        permutate(i+1, arr, res, partCopy, restriction);
        permutate(i+1, arr, res, partial, restriction);
    }

    public static void main(String[] args) {
        CombinationRestricted permutation = new CombinationRestricted();
        List<List<Integer>> permutate = permutation.permutate(List.of(1, 2, 3), 2);
        System.out.println(permutate);
    }
}
