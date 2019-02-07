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

    @Test
    public void testForCyclicLinkedList(){
        ListNode l11 = new ListNode();
        ListNode l44 = new ListNode(4, l11);
        ListNode l33 = new ListNode (3, l44);
        ListNode l22 = new ListNode(2, l33);
        l11.data = 1;
        l11.next = l22;

        CyclicLinkedList cyclicLinkedList = new CyclicLinkedList();
        ListNode actual = cyclicLinkedList.verifyCyclicLinkedList(l11);
        ListNode expected = l11;

        Assertions.assertEquals(actual, expected);

         l11 = new ListNode();
         l22 = new ListNode();
         l44 = new ListNode(4, l22);
         l33 = new ListNode (3, l44);
         l22.data=2;
         l22.next=l33;
         l11.data = 1;
         l11.next = l22;

         actual = cyclicLinkedList.verifyCyclicLinkedList(l11);
         expected = l22;

         Assertions.assertEquals(actual, expected);
    }


}
