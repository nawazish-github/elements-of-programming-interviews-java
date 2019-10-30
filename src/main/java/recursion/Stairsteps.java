package recursion;

import java.util.ArrayList;
import java.util.List;

public class Stairsteps {
    public int stairSteps(int n) {
        if(n == 0 )return 0;
        if(n < 0) return 0;

        return 1+ stairSteps(n-1) + stairSteps(n-2)+stairSteps(n-3);
    }

    public List<List<Integer>> stairStepsCombinations(int n){
        return stairStepsCombinations(n, 0);
    }

    private List<List<Integer>> stairStepsCombinations(int n, int currStep) {

        if(currStep == n){
            List<List<Integer>> combos = new ArrayList<>();
            combos.add(new ArrayList<>());
            return combos;
        }
        return null;
    }
}
