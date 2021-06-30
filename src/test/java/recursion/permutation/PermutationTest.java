package recursion.permutation;

import org.junit.jupiter.api.Test;
import recursion.permutation.topdown.Permutation;

import java.util.ArrayList;
import java.util.List;

public class PermutationTest {
    @Test
    public void test(){
        Permutation permutation = new Permutation();
        ArrayList<List<Integer>> permutate = permutation.permutate(new ArrayList<>(List.of(1, 2, 3)));
        System.out.println(permutate);
    }
}
