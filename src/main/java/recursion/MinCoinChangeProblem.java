package recursion;

import java.util.HashMap;
import java.util.Map;

public class MinCoinChangeProblem {

    public int minCoinChange (int value, int[] coins){
        if(value == 0) return 0;
        int min = Integer.MAX_VALUE;
        for(int coin : coins){
            if (coin <= value){
                int tempMin = minCoinChange(value - coin, coins);
                if (tempMin + 1 < min){
                    min = tempMin + 1;
                }
            }

        }
        return min;
    }

    private Map<Integer, Integer> cache = new HashMap<>();
    public int minCoinChangeMemoized(int value, int[] coins){
        if(value == 0) return 0;
        if(cache.containsKey(value)) return cache.get(value);

        int min = Integer.MAX_VALUE;
        for(int coin : coins){
            if (coin <= value){
                int tempMin = minCoinChangeMemoized(value - coin, coins);
                if (tempMin + 1 < min){
                    min = tempMin + 1;
                }
            }

        }
        cache.put(value, min);
        return min;
    }
}
