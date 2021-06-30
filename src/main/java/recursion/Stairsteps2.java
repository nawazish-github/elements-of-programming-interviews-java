package recursion;

import java.util.ArrayList;
import java.util.List;

public class Stairsteps2 {
    public List<List<Integer>> stairSteps (int N){
        List<List<Integer>> stairStepsCombinations = new ArrayList<>();
        stairSteps(0, N, new ArrayList<Integer>(), stairStepsCombinations);
        return stairStepsCombinations;
    }

    private void stairSteps(int i, int N, List<Integer> currCombination,
                            List<List<Integer>> stairStepsCombinations) {
        if(i == N){
            stairStepsCombinations.add(new ArrayList<>(currCombination));
            return;
        }

        if(i > N){return;}
        List<Integer> list = new ArrayList<>(currCombination);
        list.add(i);
        stairSteps(i+1, N, list, stairStepsCombinations);
        stairSteps(i+2, N, list, stairStepsCombinations);
    }

    public static void main(String[] args) {
        Stairsteps2 stairsteps2 = new Stairsteps2();
        List<List<Integer>> lists = stairsteps2.stairSteps(3);
        System.out.println(lists);

    }
}
