import merge.ListMerger;
import merge.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMergeList {
    @Test
    public void testMergeList(){
        ListNode<Integer>l1 = setupList(1,2,3);
        ListNode<Integer>l2 = setupList(4,5,6);
        ListNode<Integer> expected = setupList(1,2,3,4,5,6);

        ListMerger listMerger = new ListMerger();
        ListNode<Integer>actual=listMerger.merge(l1, l2);

        while (actual!= null && expected!=null){
            Assertions.assertEquals(actual.data, expected.data);
            actual = actual.next;
            expected = expected.next;
        }

       Assertions.assertEquals(actual, expected);
    }

    private ListNode<Integer> setupList(int...nums) {
        ListNode<Integer> head = new ListNode<Integer>();
        ListNode<Integer> tail = head;

        for (int i=0;i<nums.length; i++){
            ListNode l = new ListNode<Integer>();
            l.data=nums[i];
            tail.next=l;
            tail = l;
        }
        return head.next;
    }
}
