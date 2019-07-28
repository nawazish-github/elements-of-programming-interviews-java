package dynamic_programming;

import java.util.Arrays;

public class MinCoinsExchangeProblem {
    public static void main(String[] args) {
        //int[] denoms = new int[]{1,2,5};
        //int[] denoms = new int[]{1,2,4};
        //int[] denoms = new int[]{1,5,6, 9};
        //int[] denoms = new int[]{5,10,25};
        //int[] denoms = new int[]{25, 10, 5};
        int[] denoms = new int[]{2, 4};
        //int[] denoms = new int[]{5};
        Arrays.sort(denoms);
        System.out.println(minCoinsExchange(7, denoms));
    }

    private static int minCoinsExchange(int target, int[] denoms){
        int[] targets = new int[target+1];
        Arrays.fill(targets, Integer.MAX_VALUE);
        targets[0] = 0;
        for (int d : denoms){
            for (int t = 0; t<=target; t++){
                if(d <= t){
                    int prevMinCoins = targets[t - d];
                    if (prevMinCoins != Integer.MAX_VALUE)
                        targets[t] = Math.min(1 + prevMinCoins, targets[t]);
                }
            }
        }
        if (targets[target] == Integer.MAX_VALUE)
            return -1;
        return targets[target];
    }
}
