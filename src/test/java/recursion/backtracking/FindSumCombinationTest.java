package recursion.backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FindSumCombinationTest {

    @Test
    public void test(){
        FindSumCombination findSumCombination = new FindSumCombination();
        List<List<Integer>> sumCombination = findSumCombination.findSumCombination(new int[]{4, 2, 1, 6, 7, 3},
                8);
        System.out.println(sumCombination);
    }

    @Test
    public void notPossible(){
        FindSumCombination findSumCombination = new FindSumCombination();
        List<List<Integer>> sumCombination = findSumCombination.findSumCombination(new int[]{4, 2, 1, 6, 7, 3},
                24);
        System.out.println(sumCombination);
    }
}
