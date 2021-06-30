package recursion.permutation.topdown;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeatingArrangementsTest {

    @Test
    public void test(){
        SeatingArrangements seatingArrangements = new SeatingArrangements();
        Map<Integer, Integer> pairs = new HashMap<>();
        pairs.put(1, 3);
        pairs.put(3, 1);
        List<List<Integer>> arrangements = seatingArrangements.arrangements(3, pairs);
        System.out.println(arrangements);
    }
}
