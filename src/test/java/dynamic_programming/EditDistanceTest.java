package dynamic_programming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EditDistanceTest {

    @Test
    public void test() {
        EditDistance editDistance = new EditDistance();
        int minDist = editDistance.editDistance("horse", "ros");
        Assertions.assertEquals(minDist, 3);
    }

    @Test
    public void test2() {
        EditDistance editDistance = new EditDistance();
        int minDist = editDistance.editDistance("ab", "cb");
        Assertions.assertEquals(minDist, 1);
    }

}