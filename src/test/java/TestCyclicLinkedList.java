import list.cyclic.CyclicLinkedList;
import list.util.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCyclicLinkedList {

    @Test
    public void testForNoCyclicLinkedList(){
        ListNode l4 = new ListNode(4, null);
        ListNode l3 = new ListNode (3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);

        CyclicLinkedList cyclicLinkedList = new CyclicLinkedList();
        ListNode actual = cyclicLinkedList.verifyCyclicLinkedList(l1);
        ListNode expected = null;

        Assertions.assertEquals(actual, expected);
    }
}
