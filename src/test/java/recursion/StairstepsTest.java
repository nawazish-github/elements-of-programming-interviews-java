package recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StairstepsTest {

    @Test
    public void stairStepsTest(){
        Stairsteps stairsteps = new Stairsteps();
        int actual = stairsteps.stairSteps(3);
        Assertions.assertEquals(actual, 4);
        actual = stairsteps.stairSteps(2);
        Assertions.assertEquals(actual, 2);
        actual = stairsteps.stairSteps(4);
        Assertions.assertEquals(actual, 8);
    }
}
