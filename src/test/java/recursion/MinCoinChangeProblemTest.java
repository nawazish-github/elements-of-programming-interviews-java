package recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinCoinChangeProblemTest {

    @Test
    public void minCoinChangeTest1(){
        MinCoinChangeProblem minCoinChangeProblem = new MinCoinChangeProblem();
        long start = System.currentTimeMillis();
        int minCoinChange = minCoinChangeProblem.minCoinChangeMemoized(40, new int[]{1, 2, 5});
        //int minCoinChange = minCoinChangeProblem.minCoinChange(40, new int[]{1, 2, 5});
        System.out.println("Total Time Taken(s): "+(System.currentTimeMillis()-start)/1000L);
        Assertions.assertEquals(8, minCoinChange);
    }
}
