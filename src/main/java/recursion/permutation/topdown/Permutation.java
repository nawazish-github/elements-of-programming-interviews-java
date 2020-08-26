package recursion.permutation.topdown;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public ArrayList<List<Integer>>permutate (ArrayList<Integer> list){
        ArrayList<List<Integer>> result = new ArrayList<>();
        permutationHelper(list, new ArrayList<>(), result);
        return result;
    }

    private void permutationHelper(ArrayList<Integer> list, ArrayList<Integer> path, ArrayList<List<Integer>> result){
        if(list.size() == 0){
            result.add(new ArrayList<>(path));
            return;
        }

        for(Integer currNum : list.toArray(new Integer[]{})){
            list.remove(currNum);
            path.add(currNum);
            permutationHelper(list, path, result);
            list.add(currNum);
            path.remove(path.size()-1);
        }
    }
}
