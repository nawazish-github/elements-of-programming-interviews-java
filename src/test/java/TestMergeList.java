import list.merge.ListMerger;
import list.merge.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMergeList {
    @Test
    public void testMergeList(){
        ListNode<Integer>l1 = setupLinkedList(1,2,3);
        ListNode<Integer>l2 = setupLinkedList(4,5,6);
        ListNode<Integer> expected = setupLinkedList(1,2,3,4,5,6);

        ListMerger listMerger = new ListMerger();
        ListNode<Integer>actual=listMerger.merge(l1, l2);

        while (actual!= null && expected!=null){
            Assertions.assertEquals(actual.data, expected.data);
            actual = actual.next;
            expected = expected.next;
        }

       Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testEfficientMerger(){
        ListNode<Integer>l1 = setupLinkedList(9, 12, 16);
        ListNode<Integer>l2 = setupLinkedList(10, 14, 20);
        ListNode<Integer> expected = setupLinkedList(9, 10, 12, 14, 16, 20);

        ListMerger listMerger = new ListMerger();
        ListNode<Integer>actual=listMerger.efficientMerger(l1, l2);

        while (actual!= null && expected!=null){
            Assertions.assertEquals(actual.data, expected.data);
            actual = actual.next;
            expected = expected.next;
        }

        Assertions.assertEquals(actual, expected);

    }
    private ListNode<Integer> setupLinkedList(int...nums) {
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
