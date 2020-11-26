package recursion.divideandconquer;

import org.junit.jupiter.api.Test;
import recursion.divideandconnquer.CountUniqueBSTs;

public class CountUniqueBSTsTest {
    @Test
    public void test(){
        CountUniqueBSTs countUniqueBSTs = new CountUniqueBSTs();
        int i = countUniqueBSTs.countUniqueBSTs(3);
        System.out.println(i);
    }
}
