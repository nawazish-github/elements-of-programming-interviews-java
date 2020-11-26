package recursion.permutation.topdown;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SeatingArrangements {

    public List<List<Integer>> arrangements(int N, Map<Integer, Integer> pairs){
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> available = new LinkedList<>();
        for (int i = 1; i <= N ; i++) {
            available.add(i);
        }

        arrangements(available, pairs, new LinkedList<Integer>(), result);
        return result;
    }

    private void arrangements(List<Integer> available, Map<Integer, Integer> pairs, LinkedList<Integer> path,
                              List<List<Integer>> result) {

        if (available.size() == 0){
            result.add(new LinkedList<>(path));
            return;
        }

        for (Integer i : available.toArray(new Integer[]{})) {
            available.remove(i);
            path.add(i);
            if(pairs.containsKey(i)){
                available.remove(pairs.get(i));
                path.add(pairs.get(i));
            }
            arrangements(available,pairs, path, result);
            available.add(i);
            path.remove(path.size()-1);

            if(pairs.containsKey(i)){
                available.add(pairs.get(i));
                path.remove(path.size()-1);
            }
        }
    }
}
