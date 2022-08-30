package two_pointer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RemoveDuplicatesfromSortedArrayTest {
    
    private int removeDuplicates;

    @Test
    public void test() {
        RemoveDuplicatesfromSortedArray r = new RemoveDuplicatesfromSortedArray();
        int[] nums = new int[]{1,1,2};
        removeDuplicates = r.removeDuplicates(nums);
        assertEquals(2, removeDuplicates);
    }

    @Test
    public void test2() {
        RemoveDuplicatesfromSortedArray r = new RemoveDuplicatesfromSortedArray();
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        removeDuplicates = r.removeDuplicates(nums);
        assertEquals(5, removeDuplicates);
    }

    @Test
    public void test3() {
        RemoveDuplicatesfromSortedArray r = new RemoveDuplicatesfromSortedArray();
        int[] nums = new int[]{2, 3, 3, 3, 6, 9, 9};
        removeDuplicates = r.removeDuplicates(nums);
        assertEquals(4, removeDuplicates);
    }

    @Test
    public void test4() {
        RemoveDuplicatesfromSortedArray r = new RemoveDuplicatesfromSortedArray();
        int[] nums = new int[]{2, 2, 2, 11};
        removeDuplicates = r.removeDuplicates(nums);
        assertEquals(2, removeDuplicates);
    }
}
