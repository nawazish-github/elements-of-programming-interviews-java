import list.reversal.ListReversal;
import list.util.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestListReversal {

    @Test
    public void testListReversal(){
        ListNode listNode = TestListUtil.setupLinkedList(1,3,5,7,8,10);
        ListNode expected = TestListUtil.setupLinkedList(10,8,7,5,3,1);

        ListReversal listReversal = new ListReversal();
        ListNode actual = listReversal.reverseList(listNode);

        assertLinkedLists(expected, actual);
    }

    @Test
    public void testSublistReversal(){
        ListNode listNode = TestListUtil.setupLinkedList(9,10,4,12,25,13,6);
        ListNode expected = TestListUtil.setupLinkedList(9,10,13,25,12,4,6);

        ListReversal listReversal = new ListReversal();
        ListNode actual = listReversal.reverseSublist(listNode, 3, 6);

        assertLinkedLists(expected, actual);
    }

    private void assertLinkedLists(ListNode expected, ListNode actual) {
        while (actual != null && expected != null) {
            Assertions.assertEquals(actual.data, expected.data);
            actual = actual.next;
            expected = expected.next;
        }

        Assertions.assertEquals(actual, expected);
    }
}
