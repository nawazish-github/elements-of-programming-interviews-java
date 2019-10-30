package list;

import list.reversal.ListReversal;
import list.util.ListNode;
import org.junit.jupiter.api.Test;

public class TestListReversal {

    @Test
    public void testListReversal(){
        ListNode listNode = TestListUtil.setupLinkedList(1,3,5,7,8,10);
        ListNode expected = TestListUtil.setupLinkedList(10,8,7,5,3,1);

        ListReversal listReversal = new ListReversal();
        ListNode actual = listReversal.reverseList(listNode);

        TestListUtil.assertLinkedLists(expected, actual);
    }

    @Test
    public void testSublistReversal(){
        ListNode listNode = TestListUtil.setupLinkedList(9,10,4,12,25,13,6);
        ListNode expected = TestListUtil.setupLinkedList(9,10,13,25,12,4,6);

        ListReversal listReversal = new ListReversal();
        ListNode actual = listReversal.reverseSublist(listNode, 3, 6);

        TestListUtil.assertLinkedLists(expected, actual);
    }


}
