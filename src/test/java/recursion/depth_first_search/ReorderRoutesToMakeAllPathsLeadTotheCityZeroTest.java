package recursion.depth_first_search;

import org.junit.jupiter.api.Test;

public class ReorderRoutesToMakeAllPathsLeadTotheCityZeroTest {
    @Test
    public void test() {
        ReorderRoutesToMakeAllPathsLeadTotheCityZero reorder = new ReorderRoutesToMakeAllPathsLeadTotheCityZero();
        int changes = reorder.minReorder(5, new int[][]{
                new int[]{1, 0},
                new int[]{1, 2},
                new int[]{3, 2},
                new int[]{3, 4},
        });

        System.out.println(changes);
    }
}
