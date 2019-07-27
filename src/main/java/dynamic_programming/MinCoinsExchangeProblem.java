package dynamic_programming;

import java.util.Arrays;

public class MinCoinsExchangeProblem {
    public static void main(String[] args) {
        //int[] denoms = new int[]{1,2,5};
        int[] denoms = new int[]{2,1};
        Arrays.sort(denoms);
        int[] denominations = new int[denoms.length+1];
        System.arraycopy(denoms,0,denominations, 1, denoms.length);

        //System.out.println(minCoinsExchange(11, arr));
        System.out.println(minCoinsExchange(3, denominations));
    }

    private static int minCoinsExchange(int target, int[] denoms){
        int [][] cache = new int[denoms.length][target+1];
        initializeCache(cache, target);
        for (int d=1; d<denoms.length; d++){
            for (int t = 1; t<=target; t++){
                if (denoms[d] <= t){
                    cache[d][t] = Math.min(1+cache[d][t-denoms[d]], cache[d-1][t]);
                }else{
                    cache[d][t] = cache[d-1][t];
                }
            }
        }
        return cache[denoms.length-1][target];
    }

    private static void initializeCache(int[][] cache, int target) {
        int i = 0;
        for(int t=1; t<=target; t++){
            cache[i][t] = Integer.MAX_VALUE;
        }
    }
}
