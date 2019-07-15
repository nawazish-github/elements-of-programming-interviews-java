package dynamic_programming;
/*
    Write a function that takes in an array of positive integers and returns an integer representing the maximum
    sum of non-adjacent elements in the array. If a sum cannot be generated, the function should return 0.
 */
public class MaxSubSetSumWithNoAdjacentElements {
    public static void main(String[] args) {
        int[] array = {4, 3, 5, 200, 5, 3};
        System.out.println(maxSubSetSum(array));
    }

    private static int maxSubSetSum(int[] array) {
        if (array.length < 1)
            return 0;
        if (array.length == 1)
            return array[0];
        if (array.length == 2)
            return maxOf(array[0], array[1]);

        int prevSubOpt = 0, currSubOpt = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                prevSubOpt = array[i];
                currSubOpt = array[i];
                continue;
            }
            if (i == 1) {
                currSubOpt = maxOf(prevSubOpt, array[i]);
                continue;
            }

            int temp = currSubOpt;
            currSubOpt = maxOf(currSubOpt, (array[i] + prevSubOpt));
            prevSubOpt = temp;
        }
        return currSubOpt;

    }

    private static int maxOf(int x, int y) {
        return x > y ? x : y;
    }
}
