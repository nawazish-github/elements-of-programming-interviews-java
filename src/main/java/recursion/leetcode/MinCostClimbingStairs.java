package recursion.leetcode;

/**
 * You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.
 *
 * You can either start from the step with index 0, or the step with index 1.
 *
 * Return the minimum cost to reach the top of the floor.
 * https://leetcode.com/problems/min-cost-climbing-stairs/
 */
public class MinCostClimbingStairs {
    int[] minCost;
    boolean[] p;
    public int minCostClimbingStairs(int[] cost) {
        minCost = new int[cost.length + 10];
        p = new boolean[cost.length + 10];

        int cost1 = minClimbCost(cost, 0);
        int cost2 = minClimbCost(cost, 1);

        return Math.min(cost1, cost2);
    }

    private int minClimbCost(int[] cost, int idx) {
        if (idx >= cost.length) {
            return 0;
        }

        if (p[idx]) return minCost[idx];

        int oneStep = idx + 1;
        int twoStep = idx + 2;


        int op1 = minClimbCost(cost, oneStep)+cost[idx];

        int op2 = minClimbCost(cost, twoStep)+cost[idx];

        int res = Math.min(op1, op2);

        p[idx] = true;
        minCost[idx] = res;

        return res;
    }
}
