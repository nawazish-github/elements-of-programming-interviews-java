package sliding_window_problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FruitsIntoBasketsTest {
    @Test
    public void test() {
        int[] arr = { 1, 2, 3, 2, 2 };
        FruitsIntoBaskets f = new FruitsIntoBaskets();
        int actual = f.totalFruit(arr);
        assertEquals(4, actual);
    }
}
