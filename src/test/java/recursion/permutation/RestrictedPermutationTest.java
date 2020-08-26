package recursion.permutation;

import org.junit.jupiter.api.Test;
import recursion.permutation.topdown.RestrictedPermuation;

import java.util.ArrayList;
import java.util.List;

public class RestrictedPermutationTest {
    @Test
    public void testRestrictedPermutation(){
        RestrictedPermuation restrictedPermuation = new RestrictedPermuation();
        ArrayList list = new ArrayList<>(List.of(1,2,3,4,5));
        List<List<Integer>> permutate = restrictedPermuation.permutate(list, 3);
        System.out.println(permutate);
    }
}
