package recursion.permutation;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public List<List<Integer>> permutate(List<Integer> arr){
        List<List<Integer>> res = new ArrayList<>();
        permutate(0, arr, res, new ArrayList<Integer>());
        return res;
    }

    private void permutate(int i, List<Integer> arr, List<List<Integer>> res, List<Integer> partial) {
        if(i >= arr.size()){
            List<Integer> partCopy = new ArrayList<>(partial);
            res.add(partCopy);
            return;
        }

        Integer currNum = arr.get(i);
        List<Integer> partCopy = new ArrayList<>(partial);
        partCopy.add(currNum);
        permutate(i+1, arr, res, partCopy);
        permutate(i+1, arr, res, partial);
    }

    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        List<List<Integer>> permutate = permutation.permutate(List.of(1, 2, 3));
        System.out.println(permutate);
    }
}
