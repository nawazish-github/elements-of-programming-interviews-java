package list;

import list.merge.ListMerger;
import list.util.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMergeList {
    @Test
    public void testMergeList(){
        ListNode<Integer>l1 = TestListUtil.setupLinkedList(1,2,3);
        ListNode<Integer>l2 = TestListUtil.setupLinkedList(4,5,6);
        ListNode<Integer> expected = TestListUtil.setupLinkedList(1,2,3,4,5,6);

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
        ListNode<Integer>l1 = TestListUtil.setupLinkedList(9, 12, 16);
        ListNode<Integer>l2 = TestListUtil.setupLinkedList(10, 14, 20);
        ListNode<Integer> expected = TestListUtil.setupLinkedList(9, 10, 12, 14, 16, 20);

        ListMerger listMerger = new ListMerger();
        ListNode<Integer>actual=listMerger.efficientMerger(l1, l2);

        while (actual!= null && expected!=null){
            Assertions.assertEquals(actual.data, expected.data);
            actual = actual.next;
            expected = expected.next;
        }

        Assertions.assertEquals(actual, expected);

    }

}
