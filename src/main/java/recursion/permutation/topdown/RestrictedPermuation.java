package recursion.permutation.topdown;

import java.util.ArrayList;
import java.util.List;

public class RestrictedPermuation {

    public ArrayList<List<Integer>> permutate (ArrayList<Integer> list, int target){
        ArrayList<List<Integer>> result = new ArrayList<>();
        permutationHelper(list, new ArrayList<>(), result, target, 0);
        return result;
    }

    private void permutationHelper(ArrayList<Integer> list, List<Integer> path, List<List<Integer>> result,
                                   int length, int i){

        if(length == 0){
            result.add(new ArrayList<>(path));
            return;
        }

        for (Integer currNum : list.toArray(new Integer[]{})){
            list.remove(currNum);
            path.add(currNum);
            permutationHelper(list, path, result, length-1, i+1);
            list.add(currNum);
            path.remove(path.size() -1);
        }
    }
}
