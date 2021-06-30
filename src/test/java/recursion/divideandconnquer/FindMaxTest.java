package recursion.divideandconnquer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMaxTest {

    @Test
    void findMax() {
        FindMax findMax = new FindMax();
        int max = findMax.findMax(new int[]{-2});
        System.out.println(max);
    }
}