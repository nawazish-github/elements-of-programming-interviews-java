package recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Stairsteps {
    public int stairSteps(int n) {
        if(n == 0 )return 0;
        if(n < 0) return 0;

        return 1+ stairSteps(n-1) + stairSteps(n-2)+stairSteps(n-3);
    }

    public List<List<Integer>> stairStepsCombinations(int n){
        //return stairStepsCombinations(n, 0);
        List<List<Integer>> lists = stairStepsCombinations(n, 0);
        for(List l : lists){
            l.add(n);
        }
        return lists;
    }

    private List<List<Integer>> stairStepsCombinations(int n, int currStep) {
        if(currStep == n){
            List<List<Integer>> combos = new ArrayList<>();
            combos.add(new ArrayList<>());
            return combos;
        }

        if(currStep > n) return new ArrayList<List<Integer>>();

        List<List<Integer>> results = new ArrayList<>();
        results.addAll(stairStepsCombinations(n,currStep+1));
        results.addAll(stairStepsCombinations(n,currStep+2));
        results.addAll(stairStepsCombinations(n,currStep+3));

        for(List l : results){
            l.add(0,currStep);
        }
        return results;
    }
}
