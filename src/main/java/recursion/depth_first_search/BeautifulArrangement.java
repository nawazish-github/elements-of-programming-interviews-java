package recursion.depth_first_search;

import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/beautiful-arrangement/
 * Suppose you have n integers labeled 1 through n. A permutation of those n integers perm (1-indexed) is considered a beautiful arrangement if for every i (1 <= i <= n), either of the following is true:
 *
 * perm[i] is divisible by i.
 * i is divisible by perm[i].
 * Given an integer n, return the number of the beautiful arrangements that you can construct.
 */
public class BeautifulArrangement {
    private int result = 0;
    public int countArrangement(int n) {
        List<Integer> available = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            available.add(i);
        }

        perm (n, available, 1);
        return result;
    }

    private void perm (int n, List<Integer> available, int i) {
        //if (i > n) return; //safety
        //if (available.size() != (n-i)+1); return;

        if (i == n) {
            int elem = available.get(available.size()-1); // at this point available should have only one elem at index 0;
            if (elem % i == 0 || i % elem == 0) result += 1;
            return;
        }

        for (int elem : available.toArray(new Integer[]{})) {
            if (elem % i == 0 || i % elem == 0) {
                int num = available.remove(elem); //backtrack?
                perm (n, available, i+1);
                available.add(num);
            }
        }
    }
}
