package sliding_window_problems;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PermutationInStringTest {
    @Test
    public void test() {
        PermutationInString p = new PermutationInString();
        boolean actual = p.checkInclusion("ab", "eidbaooo");
        assertTrue(actual);
    }
    @Test
    public void test2() {
        PermutationInString p = new PermutationInString();
        boolean actual = p.checkInclusion("ab", "eidboaoo");
        assertFalse(actual);
    }

    @Test
    public void test3() {
        PermutationInString p = new PermutationInString();
        boolean actual = p.checkInclusion("hello", "ooolleoooleh");
        assertFalse(actual);
    }

    @Test
    public void test4() {
        PermutationInString p = new PermutationInString();
        boolean actual = p.checkInclusion("adc", "dcda");
        assertTrue(actual);
    }
}
