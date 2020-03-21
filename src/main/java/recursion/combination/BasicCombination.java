package recursion.combination;

import java.util.ArrayList;
import java.util.List;

public class BasicCombination {

    public static void main(String[] args) {
        BasicCombination basicCombination = new BasicCombination();
        basicCombination.permutations(List.of(1,2,3,4));

    }

    public void permutations(List<Integer> input){
        List<List<Integer>> result = new ArrayList<>();
        permutations(input, new ArrayList<>(), result);
        System.out.println(result);
    }

    public void permutations(List<Integer> input, List<Integer> currPath, List<List<Integer>> result){
        if (input.size()==0) {
            result.add(new ArrayList<>(currPath));
            return;
        }
        for (int j = 0; j < input.size(); j++) {
            List<Integer> copyInput = new ArrayList<>(input);
            Integer removedItem = copyInput.remove(j);
            currPath.add(removedItem);
            permutations(copyInput, currPath, result);
            copyInput.add(removedItem);
            currPath.remove(removedItem);
        }
    }
}
