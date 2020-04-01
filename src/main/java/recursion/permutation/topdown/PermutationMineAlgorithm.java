package recursion.permutation.topdown;

import java.util.ArrayList;
import java.util.List;

public class PermutationMineAlgorithm {

    public List<List<Integer>> permutate(List<Integer> arr){
        List<List<Integer>> result = new ArrayList<>();
        permutate(arr, 0, arr.size() ,new ArrayList<Integer>(), result);
        return result;
    }

    private void permutate(List<Integer> arr, int i, int n, List<Integer> partial, List<List<Integer>> result) {
        if(partial.size() == n){
            result.add(new ArrayList<>(partial));
            return;
        }

        for (int j = 0; j < arr.size(); j++) {
            List<Integer> copyPartial = new ArrayList<>(partial);
            copyPartial.add(arr.get(j));
            ArrayList<Integer> copyList = new ArrayList<>(arr);
            copyList.remove(j);
            permutate(copyList, i, n, copyPartial, result);
        }
    }

    public static void main(String[] args) {
        PermutationMineAlgorithm perm = new PermutationMineAlgorithm();
        System.out.println(perm.permutate(/*list*/ List.of(1,2,3)));
    }
}
