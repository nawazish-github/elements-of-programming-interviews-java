package recursion;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PermutationTest {

    @Test
    public void testPermutation(){
        Permutation permutation = new Permutation();
        permutation.getPermutations(Arrays.asList(1,2,3));
    }

    @Test
    public void testPermutation2(){
        Permutation permutation = new Permutation();
        permutation.getPermutations(Arrays.asList(1));
    }

    @Test
    public void testPermutation3(){
        Permutation permutation = new Permutation();
        permutation.getPermutations(Arrays.asList());
    }
}
