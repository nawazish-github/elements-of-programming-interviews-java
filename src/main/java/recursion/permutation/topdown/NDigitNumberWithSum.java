package recursion.permutation.topdown;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NDigitNumberWithSum {
    public List<List<Integer>> getNdigitNumberWithSum(int numDigit, int targetSum){
        ArrayList<List<Integer>> result = new ArrayList<>();
        RestrictedPermuation restrictedPermuation = new RestrictedPermuation();
        ArrayList options = new ArrayList(List.of(0,1,2,3,4,5,6,7,8,9));
        ArrayList<List<Integer>> restrictedPermutations = restrictedPermuation.permutate(options, numDigit);
        List<List<Integer>> collect = restrictedPermutations.stream().filter(resPerm -> {
            Integer reduce = resPerm.stream().reduce(0, (prevVal, currVal) -> prevVal + currVal);
            if (reduce == targetSum) return true;
            return false;
        }).collect(Collectors.toList());
        //System.out.println(collect);
        permuatationHelper(collect, result);
        System.out.println(result);
        return result;
    }

    private void permuatationHelper(List<List<Integer>> collect, ArrayList<List<Integer>> result){
        Permutation permutation = new Permutation();
        for(List<Integer> list : collect){
            ArrayList<List<Integer>> permutate = permutation.permutate((ArrayList) list);
            for(List<Integer> res : permutate){
                result.add((ArrayList)res);
            }
        }
    }
}
