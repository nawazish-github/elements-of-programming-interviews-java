package dynamic_programming;

public class NumWaysToExchangeCoins {
    // O(target * denominations) - time complexity | O(target) - space complexity
    public int numberOfWaysToExchangeCoins(int target, int[] denoms) {
        int[] ways = new int[target+1];
        ways[0] = 1;
        for (int i = 0; i < denoms.length; i++){
            int denom = denoms[i];
            for (int amt = 0; amt <= target; amt++){
                if (denom <= amt){
                    ways[amt] = ways[amt]+ways[amt-denom];
                }
            }
        }
        return ways[target];
    }
}
