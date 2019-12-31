import list.removal.RemoveKthNodeFromEnd;
import list.util.ListNode;
import org.junit.jupiter.api.Test;

public class RemoveKthNodeFromEndTest {

    @Test
    public void removeKthNodeFromEndTest(){
        ListNode<Integer> head = TestListUtil.setupLinkedList(1, 2, 3, 4, 5);
        ListNode<Integer> expected = TestListUtil.setupLinkedList(1, 2, 4, 5);
        RemoveKthNodeFromEnd removeKthNodeFromEnd = new RemoveKthNodeFromEnd();
        removeKthNodeFromEnd.removeKthNodeFromEnd(head, 3);
        TestListUtil.assertLinkedLists(head, expected);
    }

    @Test
    public void removeKthNodeFromEndTest2(){
        ListNode<Integer> head = TestListUtil.setupLinkedList(1, 2, 3, 4, 5);
        ListNode<Integer> expected = TestListUtil.setupLinkedList(1, 2, 3, 4);
        RemoveKthNodeFromEnd removeKthNodeFromEnd = new RemoveKthNodeFromEnd();
        removeKthNodeFromEnd.removeKthNodeFromEnd(head, 1);
        TestListUtil.assertLinkedLists(head, expected);
    }


    @Test
    public void removeKthNodeFromEndTest3(){
        ListNode<Integer> head = TestListUtil.setupLinkedList(1, 2, 3, 4, 5);
        ListNode<Integer> expected = TestListUtil.setupLinkedList(2, 3, 4, 5);
        RemoveKthNodeFromEnd removeKthNodeFromEnd = new RemoveKthNodeFromEnd();
        removeKthNodeFromEnd.removeKthNodeFromEnd(head, 5);
        TestListUtil.assertLinkedLists(head, expected);
    }
}
