import list.util.ListNode;
import org.junit.jupiter.api.Assertions;

public class TestListUtil {
    public static ListNode<Integer> setupLinkedList(int...nums) {
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

    public static void assertLinkedLists(ListNode expected, ListNode actual) {
        while (actual != null && expected != null) {
            Assertions.assertEquals(actual.data, expected.data);
            actual = actual.next;
            expected = expected.next;
        }

        Assertions.assertEquals(actual, expected);
    }
}


