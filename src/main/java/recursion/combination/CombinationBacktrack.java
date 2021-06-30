package recursion.combination;

import java.util.ArrayList;
import java.util.List;

public class CombinationBacktrack {
    public List<List<Integer>> permutate(List<Integer> arr){
        List<List<Integer>> res = new ArrayList<>();
        permutate(0, arr, res, new ArrayList<Integer>());
        return res;
    }

    private void permutate(int i, List<Integer> arr, List<List<Integer>> res, ArrayList<Integer> partial) {
        if(i >= arr.size()){
            List<Integer> partCopy = new ArrayList<>(partial);
            res.add(partCopy);
            return;
        }

        Integer number = arr.get(i);
        partial.add(number);//add
        permutate(i+1, arr, res, partial);//recurse
        partial.remove(partial.size()-1); //rollback
        permutate(i+1, arr, res, partial);//recurse
    }

    public static void main(String[] args) {
        CombinationBacktrack combinationBacktrack = new CombinationBacktrack();
        List<List<Integer>> permutate = combinationBacktrack.permutate(List.of(1, 2, 3));
        System.out.println(permutate);
    }
}
