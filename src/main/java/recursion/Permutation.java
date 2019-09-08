package recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public ArrayList<ArrayList<Integer>> getPermutations(List<Integer> array){
        ArrayList<ArrayList<Integer>> permutations = new ArrayList<>();
        return getPermutations(array, new ArrayList<Integer>(), permutations);
    }

    private ArrayList<ArrayList<Integer>> getPermutations(List<Integer> array, ArrayList<Integer> permutation,
                                                          ArrayList<ArrayList<Integer>> permutations) {
        if (array.size() ==0 && permutation.size() > 0){
            permutations.add(permutation);
        }else{
            for (int i = 0; i < array.size(); i++) {
                List<Integer> newArray = new ArrayList<>(array);
                newArray.remove(i);
                ArrayList<Integer> newPermutation = new ArrayList<>(permutation);
                newPermutation.add(array.get(i));
                getPermutations(newArray, newPermutation, permutations);
            }
        }
        System.out.println(permutations);
        return permutations;
    }
}
