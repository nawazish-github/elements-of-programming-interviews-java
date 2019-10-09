package string;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PermutationTest {

    @Test
    public void permutationTest1(){
        Permutation permutation = new Permutation();
        ArrayList<String> results = permutation.permutate("abc");
        System.out.println(results);

    }
}
