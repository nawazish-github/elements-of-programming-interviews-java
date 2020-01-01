package miscinterviews;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hackerrank problem.
 * Given number of people and an array of sizes of Umbrella.
 * Find all combinations of umbrellas that would fit the peoples exactly.
 * Also find the minimum, umbrella which could be used to exactly fit all people.
 * Input people = 6; umbrella sizes: [3, 5]: output => 2 (3+3)
 * Input people = 6; umbrella sizes: [3, 6]: output => 1 (6)
 * Input people = 7; umbrella sizes: [3, 7]: output => 0 (6)
 */
public class UmbrellaProblem {

    public static void main(String[] args) {
        umbrella(6, new int[]{3, 6});
    }

    public static void umbrella (int people, int [] arr){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        umbrella(people, arr, new ArrayList<Integer>(), result);
        System.out.println(result);

        Collections.sort(result, (List<Integer>l1, List<Integer> l2) ->{
            if(l1.size() < l2.size()) return -1;
            if(l1.size() > l2.size()) return 1;
            return 0;
        });

        System.out.println(result.get(0).size());
    }

    private static void umbrella ( int people, int[] arr, List<Integer> partial, List<List<Integer>> result){
        if(people < 0){
            partial.clear();
            return;
        }

        if(people == 0){
            result.add(new ArrayList<Integer>(partial));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            partial.add(arr[i]);
            umbrella(people-arr[i], arr, partial, result);
            partial.clear();
        }
    }
}
